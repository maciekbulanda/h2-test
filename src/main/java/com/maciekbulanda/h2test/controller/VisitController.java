package com.maciekbulanda.h2test.controller;

import com.maciekbulanda.h2test.dao.Visit;
import com.maciekbulanda.h2test.service.VisitService;
import org.springframework.web.bind.annotation.*;

@RestController
public class VisitController {
    private final VisitService visitService;

    public VisitController(VisitService visitService) {
        this.visitService = visitService;
    }

    @GetMapping("/api/visits")
    public Iterable<Visit> getVisits() {
        return visitService.findAllVisits();
    }

    @GetMapping("/api/patients/{id}/visits")
    public Iterable<Visit> getVisitsOfPatient(@PathVariable Integer id) {
        return visitService.findVisitsByPatient(id);
    }

    @PostMapping("/api/visits")
    public Visit addVisit(@RequestBody Visit visit) {
        System.out.println(visit);
        return visitService.addVisit(visit);
    }
}
