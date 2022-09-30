package br.gov.sc.eproj.domain.model.repository;

import br.gov.sc.eproj.domain.model.entity.Meta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetaRepository extends JpaRepository<Meta, Long> {
}