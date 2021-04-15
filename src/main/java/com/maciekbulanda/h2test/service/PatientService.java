package com.maciekbulanda.h2test.service;

import com.maciekbulanda.h2test.dao.Patient;
import com.maciekbulanda.h2test.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Iterable<Patient> findAll() {
        return patientRepository.findAll();
    }

    public Patient findById(Integer id) {
        return patientRepository.findById(id).orElse(null);
    }

    public Patient findByName(String name) {
        return patientRepository.findPatientByName(name).orElse(null);
    }
}
