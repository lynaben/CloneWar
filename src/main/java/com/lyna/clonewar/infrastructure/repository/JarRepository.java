package com.lyna.clonewar.infrastructure.repository;


import com.lyna.clonewar.infrastructure.model.JarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository()
public interface JarRepository extends JpaRepository<JarEntity, Integer>{
    boolean existsByName(String name);


    @Query("select max(j.id) from JarEntity j")
    Integer findMaxId();


}
