package br.edu.utfpr.pb.pw44s.projetofinal.model;

import br.edu.utfpr.pb.pw44s.projetofinal.enums.Color;
import br.edu.utfpr.pb.pw44s.projetofinal.enums.Size;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.Identifiable;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Identifiable<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "O nome do produto não pode ser nulo")
    private String name;

    @NotNull(message = "A descrição do produto não pode ser nula")
    private String description;

    private String image;

    @Min(value = 0, message = "O preço do produto não pode ser negativo")
    @NotNull(message = "O preço do produto não pode ser nulo")
    private Double price;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Category> categories;

    @Enumerated(EnumType.STRING)
    private Color color;

    @Enumerated(EnumType.STRING)
    private Size size;
}
