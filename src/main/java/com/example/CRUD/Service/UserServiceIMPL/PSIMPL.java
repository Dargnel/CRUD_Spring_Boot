package com.example.CRUD.Service.UserServiceIMPL;

import com.example.CRUD.Entity.Personas;
import com.example.CRUD.Repository.UserRepo;
import com.example.CRUD.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PSIMPL implements UserService {

    @Autowired
    private UserRepo repo;

    @Override
    public List<Personas> ListPesonas() {
        return ((List<Personas>) this.repo.findAll());
    }

    @Override
    public Personas CreatePersona(Personas persona) {
        persona.setEmail(persona.getEmail());
        return this.repo.save(persona);
    }

    @Override
    public void DeletePersona(int id) {
        this.repo.deleteById(id);
    }

    @Override
    public Personas UpdatePersona(Personas persona) {
        return this.repo.save(persona);
    }

    @Override
    public Personas FindPersona(int id) {
        return this.repo.findById(id).get();
    }
}
