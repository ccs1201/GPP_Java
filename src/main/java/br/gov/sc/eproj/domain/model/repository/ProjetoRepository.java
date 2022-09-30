package br.gov.sc.eproj.domain.model.repository;

import br.gov.sc.eproj.domain.model.entity.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}