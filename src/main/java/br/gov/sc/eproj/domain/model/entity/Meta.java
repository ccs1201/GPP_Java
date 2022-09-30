package br.com.sc.eproj.domain.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
@Entity
public class Meta extends Projeto {
    @ManyToOne
    @JoinColumn(name = "conograma_id")
    private Cronograma cronograma;
    @OneToMany
    private Collection<Ocorrencia> ocorrencias;

}