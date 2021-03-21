package com.enzofalvo.mvchallenge.model;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;

public class LegalClient extends Client {
    
    @NotNull
    private String cnpj;
    
    @NotNull
    private String Companyname;
    
    @NotNull
    private String Fantasyname;
    
    public LegalClient() {
    }

    public LegalClient(String cnpj, String Companyname, String Fantasyname) {
        super();
        this.cnpj = cnpj;
        this.Companyname = Companyname;
        this.Fantasyname = Fantasyname;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCompanyname() {
        return Companyname;
    }

    public void setCompanyname(String Companyname) {
        this.Companyname = Companyname;
    }

    public String getFantasyname() {
        return Fantasyname;
    }

    public void setFantasyname(String Fantasyname) {
        this.Fantasyname = Fantasyname;
    }
    
}
