package com.example.CRUD.Service;

import com.example.CRUD.Entity.Personas;

import java.util.List;

public interface UserService {

    public List<Personas> ListPesonas();
    public Personas CreatePersona( Personas persona);
    public void DeletePersona(int id);
    public Personas UpdatePersona(Personas persona);
    public Personas FindPersona(int id);



}
