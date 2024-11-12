package br.edu.utfpr.pb.pw44s.projetofinal.controller;

import br.edu.utfpr.pb.pw44s.projetofinal.dto.AddressDTO;
import br.edu.utfpr.pb.pw44s.projetofinal.model.Address;
import br.edu.utfpr.pb.pw44s.projetofinal.repository.AddressRepository;
import br.edu.utfpr.pb.pw44s.projetofinal.service.AddressService;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudController;

public class AddressController extends CrudController<Long, Address, AddressDTO, AddressRepository, AddressService> {
    public AddressController(Class<Address> entityClass, Class<AddressDTO> dtoClass) {
        super(entityClass, dtoClass);
    }
}
