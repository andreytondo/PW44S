package br.edu.utfpr.pb.pw44s.projetofinal.service;

import br.edu.utfpr.pb.pw44s.projetofinal.model.Address;
import br.edu.utfpr.pb.pw44s.projetofinal.repository.AddressRepository;
import br.edu.utfpr.pb.pw44s.projetofinal.shared.CrudService;
import org.springframework.stereotype.Service;

@Service
public class AddressService extends CrudService<Long, Address, AddressRepository> {
}
