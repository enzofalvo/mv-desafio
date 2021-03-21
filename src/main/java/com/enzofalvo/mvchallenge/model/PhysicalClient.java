package com.enzofalvo.mvchallenge.model;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;

public class PhysicalClient extends Client {
    
    @NotNull
    private Long cpf;
    
    @NotNull
    private String surname;
    
    public PhysicalClient() {
    }

    public PhysicalClient(Long cpf, String surname) {
        super();
        this.cpf = cpf;
        this.surname = surname;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
