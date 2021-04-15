package com.maciekbulanda.h2test.repository;

import com.maciekbulanda.h2test.dao.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Integer> {
    Iterable<Patient> findPatientByName(String name);
}