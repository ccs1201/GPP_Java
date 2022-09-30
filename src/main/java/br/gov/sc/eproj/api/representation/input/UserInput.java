package br.gov.sc.eproj.api.representation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserInput {

    @NotBlank
    @Length(max = 40, min = 4)
    private String name;
    @CPF
    private String cpf;
    @NotBlank
    @Length(min = 5, max = 15)
    private String password;

}
