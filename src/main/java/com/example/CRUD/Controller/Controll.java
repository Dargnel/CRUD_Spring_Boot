package com.example.CRUD.Controller;

import com.example.CRUD.Entity.Personas;
import com.example.CRUD.Service.UserServiceIMPL.PSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CRUDRepo")
public class Controll {
    @Autowired
    private PSIMPL impl;
    @GetMapping
    @RequestMapping(value = "listPersonas",method = RequestMethod.GET)
    public ResponseEntity<?> listPersonas(){
        List<Personas> persnosList = impl.ListPesonas();
        return ResponseEntity.ok(persnosList);
    }

    @PostMapping
    @RequestMapping(value = "createPersonas",method = RequestMethod.POST)
    public ResponseEntity<?> createPersonas(@RequestBody Personas persona){
        Personas personacreate = impl.CreatePersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(personacreate);
    }


    @PutMapping
    @RequestMapping(value = "updatePersonas",method = RequestMethod.PUT)
    public ResponseEntity<?> updatePersonas(@RequestBody Personas persona){
        Personas personaupdate = impl.UpdatePersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(personaupdate);
    }

    @GetMapping
    @RequestMapping(value = "findPersona/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> findPersona(@PathVariable int id){
        Personas personafind= impl.FindPersona(id);
        return ResponseEntity.ok(personafind);
    }


    @DeleteMapping
    @RequestMapping(value = "deletePersona/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deletePersona(@PathVariable int id){
        impl.DeletePersona(id);
        return ResponseEntity.ok().build();
    }


}


