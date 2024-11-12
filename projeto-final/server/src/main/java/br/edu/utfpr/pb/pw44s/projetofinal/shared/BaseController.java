package br.edu.utfpr.pb.pw44s.projetofinal.shared;

import org.modelmapper.ModelMapper;

import java.io.Serializable;

/**
 * Abstract class that defines the basic operations for a controller.
 * @param <ID>
 * @param <E>
 * @param <D>
 */
public abstract class BaseController<ID extends Serializable, E  extends Identifiable<ID>, D> {

    protected final ModelMapper modelMapper;

    private final Class<E> entityClass;
    private final Class<D> dtoClass;

    public BaseController(Class<E> entityClass, Class<D> dtoClass) {
        this.entityClass = entityClass;
        this.dtoClass = dtoClass;
        this.modelMapper = new ModelMapper();
    }

    public D toDto(E entity) {
        return modelMapper.map(entity, dtoClass);
    }

    public E toEntity(D dto) {
        return modelMapper.map(dto, entityClass);
    }
}