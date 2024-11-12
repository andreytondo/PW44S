package br.edu.utfpr.pb.pw44s.projetofinal.search;

import br.edu.utfpr.pb.pw44s.projetofinal.search.request.SearchRequest;
import br.edu.utfpr.pb.pw44s.projetofinal.search.request.filter.SearchFilter;
import br.edu.utfpr.pb.pw44s.projetofinal.search.request.filter.SearchFilterAdapter;
import br.edu.utfpr.pb.pw44s.projetofinal.search.request.sort.SearchSortAdapter;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.Identifiable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SearchHandler<ID extends Serializable, E extends Identifiable<ID>> {

    SearchFilterAdapter searchFilterAdapter = new SearchFilterAdapter();
    JpaSpecificationExecutor<E> executor;

    public SearchHandler(JpaSpecificationExecutor<E> executor) {
        Objects.requireNonNull(executor, "A JpaSpecificationExecutor must be provided");
        this.executor = executor;
    }

    public Page<E> handle(SearchRequest searchRequest) {
        List<Specification<E>> specifications = createSpecifications(searchRequest.getFilters());
        Pageable pageable = getPageable(searchRequest);
        return executor.findAll(
                Specification.where(specifications.stream().reduce(Specification::and).orElse(null)),
                pageable
        );
    }

    public static Pageable getPageable(SearchRequest searchRequest) {
        return PageRequest.of(searchRequest.getPage(), searchRequest.getRows(), SearchSortAdapter.adapt(searchRequest.getSort()));
    }

    List<Specification<E>> createSpecifications(List<SearchFilter> filters) {
        return filters.stream()
                .map(this::buildSpecification)
                .collect(Collectors.toList());
    }

    Specification<E> buildSpecification(SearchFilter filter) {
        return (root, query, criteriaBuilder) -> searchFilterAdapter.adapt(filter, root, query, criteriaBuilder);
    }
}