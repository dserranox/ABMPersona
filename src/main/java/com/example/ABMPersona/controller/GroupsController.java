package com.example.ABMPersona.controller;

import com.example.ABMPersona.entity.Groups;
import com.example.ABMPersona.entity.Users;
import com.example.ABMPersona.exception.GroupNotFoundException;
import com.example.ABMPersona.exception.UserNotFoundException;
import com.example.ABMPersona.service.GroupsService;
import com.example.ABMPersona.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GroupsController {

    @Autowired
    private GroupsService groupsService;

    @GetMapping("/groups")
    public ResponseEntity<List<Groups>> getGroupsByName(@RequestParam(name = "name") String name) {
        List<Groups> groupsList = groupsService.getGroupsByName(name);
        if (groupsList.isEmpty()){
            throw new GroupNotFoundException(String.format("No se encontro ningun grupo con el nombre %s", name ));
        }
        return ResponseEntity.ok(groupsList);
    }

}
