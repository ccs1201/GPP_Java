package br.com.sc.eproj.domain.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 40, nullable = false)
    private String name;

    @Column(length = 11, nullable = false, unique = true)
    private Integer cpf;

    @Column(nullable = false, length = 15)
    private String password;

    @OneToMany(mappedBy = "users")
    private Collection<Projeto> projetos;

}
