package com.lyna.clonewar.poc;

import com.lyna.clonewar.poc.Asm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class AsmTest {

    @Autowired
    private ResourceLoader resourceLoader;
    private Asm asm;

    @BeforeEach
    void setUp(){
        asm = new Asm(resourceLoader);
    }

    @Test
    void should_load_file() throws IOException{
        var file = asm.loadJarFile();
        assertTrue(file.getAbsolutePath().contains("nice_p-1.jar"));
    }

    @Test
    void should_read_jar() throws IOException{
        asm.readByteCode();
    }


}