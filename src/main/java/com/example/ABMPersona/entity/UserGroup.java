package com.example.ABMPersona.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class UserGroup {
    @Id
    @GeneratedValue
    private Long ugrpId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "UGRP_USR_ID")
    private Users users;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "UGRP_GRP_ID")
    @JsonIgnore
    private Groups groups;

}
