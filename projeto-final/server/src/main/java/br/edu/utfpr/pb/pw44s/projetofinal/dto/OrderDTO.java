package br.edu.utfpr.pb.pw44s.projetofinal.dto;

import br.edu.utfpr.pb.pw44s.projetofinal.model.Address;
import br.edu.utfpr.pb.pw44s.projetofinal.model.OrderItem;
import br.edu.utfpr.pb.pw44s.projetofinal.model.User;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
    @ManyToOne
    private User user;

    @ManyToOne
    @NotNull(message = "O id do endereço não pode ser nulo")
    private Address address;

    @NotNull
    @OneToMany(mappedBy = "order")
    private List<OrderItem> items;

    @NotNull(message = "O total não pode ser nulo")
    private Double total;

    @NotNull(message = "O status não pode ser nulo")
    private String status;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
