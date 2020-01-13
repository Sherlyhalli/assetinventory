package com.itaim.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itaim.application.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>
{

}
