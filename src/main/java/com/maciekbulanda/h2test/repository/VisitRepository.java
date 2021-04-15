package com.maciekbulanda.h2test.repository;

import com.maciekbulanda.h2test.dao.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Integer> {
    Iterable<Visit> findAllByPatientId(Integer id);
}
