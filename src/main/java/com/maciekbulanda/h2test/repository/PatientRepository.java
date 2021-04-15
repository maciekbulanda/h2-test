package com.maciekbulanda.h2test.repository;

import com.maciekbulanda.h2test.dao.Patient;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PatientRepository extends CrudRepository<Patient, Integer> {
    Optional<Patient> findPatientByName(String name);
}
