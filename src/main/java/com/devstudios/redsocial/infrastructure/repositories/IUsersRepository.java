package com.devstudios.redsocial.infrastructure.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devstudios.redsocial.domain.entities.User;




public interface IUsersRepository extends JpaRepository<User, Long> {
    public Optional<User> findByEmail( String email );
}
