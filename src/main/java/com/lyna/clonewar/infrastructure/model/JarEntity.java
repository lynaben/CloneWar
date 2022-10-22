package com.lyna.clonewar.infrastructure.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class JarEntity {

    @Id
    private Integer id;
    private String name;



}
