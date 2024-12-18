package com.devstudios.redsocial.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devstudios.redsocial.domain.entities.Session;


public interface ISessionsRepository extends JpaRepository<Session, Long> {

}
