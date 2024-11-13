package br.edu.utfpr.pb.pw44s.projetofinal.dto;

import br.edu.utfpr.pb.pw44s.projetofinal.model.OrderItem;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
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
