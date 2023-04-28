package com.example.CRUD.Repository;

import com.example.CRUD.Entity.Personas;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<Personas,Integer> {
}
