package com.clinic.repository;

import com.clinic.entity.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClinicRepository extends JpaRepository<Clinic, String> {
    Optional<Clinic> findByName(String name);
}
