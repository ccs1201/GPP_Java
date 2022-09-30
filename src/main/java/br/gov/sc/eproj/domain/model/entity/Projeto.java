package br.com.sc.eproj.domain.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
@Entity
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120)
    private String description;

    @OneToOne
    @JoinColumn(name = "cronograma_id")
    private Cronograma cronograma;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "projetos")
    private Collection<User> users;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "projeto")
    private Collection<Ocorrencia> ocorrencias;

    private LocalDateTime dataInicio;

    private LocalDateTime dataTermino;

    @CreationTimestamp
    private OffsetDateTime createOn;

    @UpdateTimestamp
    private OffsetDateTime updatedOn;
}
