package com.example.ABMPersona.service;

import com.example.ABMPersona.entity.Groups;
import com.example.ABMPersona.entity.Users;
import com.example.ABMPersona.repository.GroupsRepository;
import com.example.ABMPersona.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupsService {
    @Autowired
    private GroupsRepository groupsRepository;

    public List<Groups> getGroupsByName(String name){
        return groupsRepository.findAllByGrpName(name);
    }
}
