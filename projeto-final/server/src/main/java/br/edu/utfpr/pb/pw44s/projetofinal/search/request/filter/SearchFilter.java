package br.edu.utfpr.pb.pw44s.projetofinal.search.request.filter;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchFilter {

    public enum Type {
        EQUALS, NOT_EQUALS, LIKE, NOT_LIKE, GREATER, LESS, GREATER_EQUALS, LESS_EQUALS, IN, NOT_IN, IS_NULL, IS_NOT_NULL, BETWEEN
    }

    private String field;
    private Object value;
    private Type type;
}