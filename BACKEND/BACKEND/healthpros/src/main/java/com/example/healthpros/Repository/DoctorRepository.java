package com.example.healthpros.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.healthpros.Model.Doctor;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
