package com.example.ABMPersona.controller;

import com.example.ABMPersona.entity.Users;
import com.example.ABMPersona.exception.UserNotFoundException;
import com.example.ABMPersona.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/users")
    public ResponseEntity<List<Users>> getUsersByLastname(@RequestParam(name = "lastname") String lastname) {
        List<Users> usersList = usersService.getUsersByLastaname(lastname);
        if (usersList.isEmpty()){
            throw new UserNotFoundException(String.format("No se encontro ningun usuario con el apellido %s", lastname ));
        }
        return ResponseEntity.ok(usersList);
    }

}
