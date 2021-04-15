package com.maciekbulanda.h2test.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.maciekbulanda.h2test.dao.Patient;
import com.maciekbulanda.h2test.service.PatientService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
    Iterable<Patient> getPatientByName() {
        return patientService.findAll();
    }
}
