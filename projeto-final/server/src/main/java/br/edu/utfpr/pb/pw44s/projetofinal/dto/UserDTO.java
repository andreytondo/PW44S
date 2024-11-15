package br.edu.utfpr.pb.pw44s.projetofinal.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;

    @NotNull(message = "O atributo username não pode ser nulo.")
    @Size(min = 4, max = 50)
    private String username;

    @NotNull(message = "O atributo password não pode ser nulo.")
    @Size(min = 6)
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$")
    private String password;

    public UserDTO(Long id) {
        this.id = id;
    }
}
