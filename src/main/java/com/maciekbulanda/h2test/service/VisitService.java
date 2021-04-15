package com.maciekbulanda.h2test.service;

import com.maciekbulanda.h2test.dao.Visit;
import com.maciekbulanda.h2test.repository.VisitRepository;
import org.springframework.stereotype.Service;

@Service
public class VisitService {
    private final VisitRepository visitRepository;

    public VisitService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    public Iterable<Visit> findAllVisits() {
        return visitRepository.findAll();
    }

    public Iterable<Visit> findVisitsByPatient(Integer id) {
        return visitRepository.findAllByPatientId(id);
    }

    public Visit addVisit(Visit visit) {
        return visitRepository.save(visit);
    }
}
