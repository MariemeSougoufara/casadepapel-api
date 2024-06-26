package com.casadepapel.api.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.casadepapel.api.entities.Admin;

import java.util.Date;
import java.util.List;

public interface AdminRepository extends MongoRepository<Admin, String> {
    List<Admin> findByNiveauAcces(String niveauAcces);
    List<Admin> findByPrivilegesContaining(String privilege);
    List<Admin> findByDateEmbaucheAfter(Date date);
}

