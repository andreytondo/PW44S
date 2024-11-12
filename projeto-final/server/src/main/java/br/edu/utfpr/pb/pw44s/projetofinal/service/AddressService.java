package br.edu.utfpr.pb.pw44s.projetofinal.service;

import br.edu.utfpr.pb.pw44s.projetofinal.model.Address;
import br.edu.utfpr.pb.pw44s.projetofinal.model.Category;
import br.edu.utfpr.pb.pw44s.projetofinal.repository.AddressRepository;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudService;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public class AddressService  extends CrudService<Long, Address, AddressRepository> {

    @Override
    public JpaSpecificationExecutor<Address> getSpecExecutor() {
        return repository;
    }
}
