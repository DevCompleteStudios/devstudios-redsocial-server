package com.devstudios.redsocial.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devstudios.redsocial.domain.entities.Avatar;



public interface IAvatarsRepository extends JpaRepository<Avatar, Long> {}
