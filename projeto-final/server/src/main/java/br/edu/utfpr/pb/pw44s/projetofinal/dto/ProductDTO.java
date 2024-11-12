package br.edu.utfpr.pb.pw44s.projetofinal.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    private Long id;

    @NotNull(message = "O nome do produto não pode ser nulo")
    private String name;

    @Min(value = 0, message = "A quantidade do produto não pode ser negativa")
    @NotNull(message = "O preço do produto não pode ser nulo")
    private Double price;

    private List<CategoryDTO> categories;
}
