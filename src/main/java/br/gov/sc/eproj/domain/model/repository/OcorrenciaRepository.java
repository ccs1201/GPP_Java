package br.gov.sc.eproj.domain.model.repository;

import br.gov.sc.eproj.domain.model.entity.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {
}