package br.edu.utfpr.pb.pw44s.projetofinal.search.request;

import br.edu.utfpr.pb.pw44s.projetofinal.search.request.filter.SearchFilter;
import br.edu.utfpr.pb.pw44s.projetofinal.search.request.sort.SearchSort;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchRequest {

    private List<SearchFilter> filters = new ArrayList<>();
    private SearchSort sort;
    private Integer page = 0;
    private Integer rows = 50;
}