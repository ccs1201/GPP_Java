package br.com.sc.eproj.domain.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
@DynamicInsert
@Entity
public class Ocorrencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = true)
    private Projeto projeto;

    @ManyToOne
    @JoinColumn(name = "meta_id", nullable = true)
    private Meta meta;

    @Column(nullable = false)
    private String descricao;

    private OffsetDateTime dataOcorrencia;

}