package com.maciekbulanda.h2test.controller;

import com.maciekbulanda.h2test.dao.Patient;
import com.maciekbulanda.h2test.service.PatientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/api/patients/{id}")
    Patient getPatient(@PathVariable Integer id) {
        return patientService.findById(id);
    }

    @GetMapping(value = "/api/patients")
    Iterable<Patient> getPatientByName(@RequestBody Patient patient) {
        return patientService.findByName(patient.getName());
    }
}
