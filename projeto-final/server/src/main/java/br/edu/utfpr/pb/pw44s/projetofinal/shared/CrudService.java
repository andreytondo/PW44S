package br.edu.utfpr.pb.pw44s.projetofinal.shared;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Optional;

public abstract class CrudService<ID extends Serializable, E  extends Identifiable<ID>, R extends CrudRepository<ID, E>> {

    @Autowired
    protected R repository;

    public E save(E entity) {
        return repository.save(entity);
    }

    public Optional<E> findById(ID id) {
        return repository.findById(id);
    }

    public void deleteById(ID id) {
        repository.deleteById(id);
    }
}
