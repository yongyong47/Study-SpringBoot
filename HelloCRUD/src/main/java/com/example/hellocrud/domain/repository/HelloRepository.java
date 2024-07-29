package com.example.hellocrud.domain.repository;

import com.example.hellocrud.domain.entity.Hello;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepository extends CrudRepository<Hello, Long> {
}
