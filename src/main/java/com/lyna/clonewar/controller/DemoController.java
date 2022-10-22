package com.lyna.clonewar.controller;

import com.lyna.clonewar.infrastructure.model.JarEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController() //bean qui ce dernier est un component et sera charger au demarrage de springboot
@RequestMapping("/api/clonewar")
@RequiredArgsConstructor()
public class DemoController {

    private final CreateJar createJar;
    private final GetJars getJars;

    @PostMapping()
    public String create(@RequestBody String name) {
        createJar.execute(name);
        return "l";
    }

    @GetMapping()
    public ResponseEntity<List<JarEntity>> findAll(){
        return ok(getJars.execute());
    }

}


