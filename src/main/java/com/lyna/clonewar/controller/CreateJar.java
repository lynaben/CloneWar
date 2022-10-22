package com.lyna.clonewar.controller;


import com.lyna.clonewar.infrastructure.model.JarEntity;
import com.lyna.clonewar.infrastructure.repository.JarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor()
public class CreateJar {

    private final JarRepository jarRepository;
    public String execute(String name){
        var jarEntity = new JarEntity();
        jarEntity.setName(name);
        if(!jarRepository.existsByName(jarEntity.getName()) ){
            var maxId = jarRepository.findMaxId();
            jarEntity.setId(maxId == null ? 0 : maxId + 1 ) ;
            return jarRepository.save(jarEntity).getName();
        }
        return "impossible";

    }

}
