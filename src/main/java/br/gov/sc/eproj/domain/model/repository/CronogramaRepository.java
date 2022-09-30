package br.gov.sc.eproj.domain.model.repository;

import br.gov.sc.eproj.domain.model.entity.Cronograma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CronogramaRepository extends JpaRepository<Cronograma, Long> {
}