package br.edu.utfpr.pb.pw44s.projetofinal.dto;

import br.edu.utfpr.pb.pw44s.projetofinal.model.OrderItem;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {


    private Long id;

    @NotNull(message = "O id do usuário não pode ser nulo")
    private Long userId;

    @NotNull(message = "O id do endereço não pode ser nulo")
    private Long addressId;

    @NotNull
    private List<OrderItem> items;

    @NotNull(message = "O total não pode ser nulo")
    private Double total;

    @NotNull(message = "O status não pode ser nulo")
    private String status;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
