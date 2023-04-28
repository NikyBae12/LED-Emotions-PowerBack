package com.ledemotions.ledep.Servicio;

import com.ledemotions.ledep.Entidad.Emocion;
import com.ledemotions.ledep.Repositorio.RepoEmocion;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServicioEmocion {

    private RepoEmocion repoEmocion;

    public ServicioEmocion(RepoEmocion repoEmocion) {
        this.repoEmocion = repoEmocion;
    }

    public ArrayList<Emocion> listarEmociones(){

        return (ArrayList<Emocion>) repoEmocion.findAll();

    }

    public Emocion buscarEmocionxId(int id_emocion){

        if (repoEmocion.findById(id_emocion).isPresent()){

            return repoEmocion.findById(id_emocion).get();

        } else return null;

    }

    public ArrayList<Emocion> buscarEmocionxNombre(String nombre){

        return repoEmocion.findBye_Nombre(nombre);

    }



}
