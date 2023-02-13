package com.example.ABMPersona.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

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

    @JsonIgnore
    @OneToMany(mappedBy = "groups", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<UserGroup> userGroups = new HashSet<>();
}
