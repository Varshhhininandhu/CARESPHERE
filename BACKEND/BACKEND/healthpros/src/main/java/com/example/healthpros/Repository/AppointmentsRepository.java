package com.example.healthpros.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.healthpros.Model.Appointments;

import java.util.List;

@Repository
public interface AppointmentsRepository extends JpaRepository<Appointments, Long> {
    List<Appointments> findByUsernameAndStatusIn(String username, List<String> statuses);
    List<Appointments> findByDoctorusernameAndStatus(String doctorusername, String status);
    long countByDoctorusername(String doctorusername);
}