package br.gov.sc.eproj.domain.model.service;

import br.gov.sc.eproj.domain.exception.UserNotFoundException;
import br.gov.sc.eproj.domain.model.entity.User;
import br.gov.sc.eproj.domain.model.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@RequiredArgsConstructor
@Service
public class UsuarioService {

    private UserRepository repository;

    @Transactional
    public User save(User user) {
        return repository.saveAndFlush(user);
    }

    @Transactional
    public User update(User user) {
        return repository.saveAndFlush(user);
    }

    public User findById(Long id) {
        return repository.findById(id).orElseThrow(() ->
                new UserNotFoundException("Usuário não encontrado."));
    }

    @Transactional
    public void exclude(Long id) {

        var user = this.findById(id);
        user.setExcluido(true);
        repository.saveAndFlush(user);

    }

    public Collection<User> findByNome(String nome) {

        var users = repository.findByNameContaining(nome);

        if (users.isEmpty()) throw new UserNotFoundException("Nenhum Usuário encontrado contento: " + nome);

        return users;

    }


}
