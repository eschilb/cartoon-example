package com.tts.Cartoon.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.tts.Cartoon.entities.Cartoon;

@Repository
public interface CartoonRepository extends CrudRepository<Cartoon, Long>{

}
