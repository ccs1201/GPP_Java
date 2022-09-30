package br.gov.sc.eproj.domain.model.repository;

import br.gov.sc.eproj.domain.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}