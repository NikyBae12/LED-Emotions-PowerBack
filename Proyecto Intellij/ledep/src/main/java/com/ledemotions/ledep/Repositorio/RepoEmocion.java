package com.ledemotions.ledep.Repositorio;

import com.ledemotions.ledep.Entidad.Emocion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface RepoEmocion extends JpaRepository<Emocion, Integer> {

    ArrayList<Emocion> findByeNombre(String eNombre);

    ArrayList<Emocion> findByeEstadoA(Boolean eEstadoA);

}
