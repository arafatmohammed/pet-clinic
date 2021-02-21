package com.amdcloudguru.petclinic.services;

import com.amdcloudguru.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
