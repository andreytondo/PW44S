package br.edu.utfpr.pb.pw44s.projetofinal.dto;

import br.edu.utfpr.pb.pw44s.projetofinal.model.Order;
import br.edu.utfpr.pb.pw44s.projetofinal.model.Product;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemDTO {

    private Long id;

    @ManyToOne
    @NotNull(message = "O id do pedido não pode ser nulo")
    private Order order;

    @OneToMany
    @NotNull(message = "O id do produto não pode ser nulo")
    private Product product;

    @NotNull(message = "A quantidade do produto não pode ser nula")
    @Min(value = 1, message = "A quantidade do produto não pode ser menor que 1")
    private Integer quantity;

    @NotNull(message = "O preço não pode ser nulo")
    private Double price;

    @NotNull(message = "O preço não pode ser nulo")
    private Double total;

}
