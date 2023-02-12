package com.example.ABMPersona.repository;

import com.example.ABMPersona.entity.Groups;
import com.example.ABMPersona.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupsRepository extends JpaRepository<Groups, Long> {

    public List<Groups> findAllByGrpName(String name);
}
