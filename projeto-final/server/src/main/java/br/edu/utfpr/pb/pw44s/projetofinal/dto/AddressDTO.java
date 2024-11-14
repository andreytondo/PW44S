package br.edu.utfpr.pb.pw44s.projetofinal.dto;

import br.edu.utfpr.pb.pw44s.projetofinal.model.User;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {

    private Long id;

    @NotNull(message = "O id do usuário não pode ser nulo")
    @ManyToOne
    private User user;

    @NotNull(message = "O nome da rua não pode ser nulo")
    private String street;

    @NotNull(message = "O número da rua não pode ser nulo")
    private String number;

    @NotNull(message = "A cidade não pode ser nula")
    private String city;

    @NotNull(message = "O estado não pode ser nulo")
    private String state;

    @NotNull(message = "O CEP não pode ser nulo")
    private String zipCode;

    private String complement;

    private String neighborhood;
}
