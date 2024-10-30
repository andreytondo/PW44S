package br.edu.utfpr.pb.pw44s.projetofinal.shared;

import org.modelmapper.ModelMapper;

public abstract class BaseController {

    protected final ModelMapper modelMapper;

    public BaseController() {
        this.modelMapper = new ModelMapper();
    }
}
