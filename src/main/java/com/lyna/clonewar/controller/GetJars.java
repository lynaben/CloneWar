package com.lyna.clonewar.controller;

import com.lyna.clonewar.infrastructure.model.JarEntity;
import com.lyna.clonewar.infrastructure.repository.JarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor()
public class GetJars {
    private final JarRepository jarRepository;

    public List<JarEntity> execute(){
        return jarRepository.findAll();
    }

}
