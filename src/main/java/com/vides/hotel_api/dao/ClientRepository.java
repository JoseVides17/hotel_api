package com.vides.hotel_api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vides.hotel_api.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
    Client findByEmail(String email);
}
