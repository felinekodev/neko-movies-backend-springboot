package com.autocine.nekomoviesbackend.repositories;

import com.autocine.nekomoviesbackend.models.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {
}
