package com.example.ABMPersona.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class UserGroup {
    @Id
    @GeneratedValue
    private Long ugrpId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UGRP_USR_ID")
    @JsonManagedReference
    private Users users;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UGRP_GRP_ID")
    @JsonIgnore
    private Groups groups;

}
