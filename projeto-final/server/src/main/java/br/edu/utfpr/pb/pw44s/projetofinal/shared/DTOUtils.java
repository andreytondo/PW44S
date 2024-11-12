package br.edu.utfpr.pb.pw44s.projetofinal.shared;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public class DTOUtils<ID extends Serializable, E extends Identifiable<ID>, D> {

    private final ModelMapper modelMapper;
    private final Class<E> entityClass;
    private final Class<D> dtoClass;

    public DTOUtils(Class<E> entityClass, Class<D> dtoClass) {
        this.modelMapper = new ModelMapper();
        this.entityClass = entityClass;
        this.dtoClass = dtoClass;
    }

    Page<D> toPageDTO(Page<E> entityPage, Pageable pageable) {
        List<D> dtoList = entityPage.getContent()
                .stream()
                .map(this::toDto)
                .collect(Collectors.toList());
        return new PageImpl<>(dtoList, pageable, entityPage.getTotalElements());
    }

    public D toDto(E entity) {
        return modelMapper.map(entity, dtoClass);
    }

    public E toEntity(D dto) {
        return modelMapper.map(dto, entityClass);
    }
}