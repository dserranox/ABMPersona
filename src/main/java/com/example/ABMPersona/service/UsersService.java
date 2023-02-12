package com.example.ABMPersona.service;

import com.example.ABMPersona.entity.Users;
import com.example.ABMPersona.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    private UsersRepository usersRepository;

    public List<Users> getUsersByLastaname(String usrLastname){
        return usersRepository.findAllByUsrLastnameOrderByUsrLastname(usrLastname);
    }
}
