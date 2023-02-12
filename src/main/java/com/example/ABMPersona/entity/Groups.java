package com.example.ABMPersona.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Groups {
    @Id
    @GeneratedValue
    private Long grpId;
    private String grpName;
    private String grpDescription;
    @OneToMany(mappedBy = "groups", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<UserGroup> userGroups = new HashSet<>();
}
