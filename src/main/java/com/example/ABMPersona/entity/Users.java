package com.example.ABMPersona.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

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
    @JsonBackReference
    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<UserGroup> userGroups = new HashSet<>();

}
