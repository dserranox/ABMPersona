package com.example.ABMPersona.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Users {
    @Id
    @GeneratedValue
    private Long usrId;
    private String usrName;
    private String usrLastname;
    private Date usrBirthday;
    private String usrCardType;
    private String usrCardNumber;
    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<UserGroup> userGroups = new HashSet<>();

}
