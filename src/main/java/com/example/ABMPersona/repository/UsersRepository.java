package com.example.ABMPersona.repository;

import com.example.ABMPersona.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Long> {

    public List<Users> findAllByUsrLastnameOrderByUsrLastname(String usrLastname);
}
