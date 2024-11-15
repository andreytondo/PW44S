package br.edu.utfpr.pb.pw44s.projetofinal.enums;

import lombok.Getter;

@Getter
public enum OrderStatus {

    PENDING("Pendente"),
    CANCELED("Cancelado"),
    DELIVERED("Entregue");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }
}
