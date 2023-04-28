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

        return repoEmocion.findByeNombre(nombre);

    }

    public ArrayList<Emocion> buscarEmocionxEstado(Boolean estado){

        return repoEmocion.findByeEstadoA(estado);

    }

    public String agregarEmocion(Emocion emocion){

         repoEmocion.save(emocion);

         return "La Emoción se registró exitosamente.";

    }

    public String actualizarEmocion(Emocion emocion){
        if (repoEmocion.findById(emocion.getId_Emocion()).isPresent()){

            repoEmocion.save(emocion);

            return "La Emoción se actualizó con exito.";

        } else {

            return "No se encontro la Emoción en el registro.";

        }

    }

    public String deshabilitarEmocion(Emocion emocion){

        Emocion emoAux = repoEmocion.findById(emocion.getId_Emocion()).get();

        if (emoAux.getE_EstadoA()){

            emoAux.setE_EstadoA(false);
            repoEmocion.save(emoAux);

            return "Emoción Deshabilitada con éxito.";

        } else {

            return "La Emoción ya se encuentra Deshabilitada";

        }

    }

    public String habilitarEmocion(Emocion emocion){

        Emocion emoAux = repoEmocion.findById(emocion.getId_Emocion()).get();

        if (emoAux.getE_EstadoA()){

            return "La Emoción ya se encuentra Habilitada.";

        } else {

            emoAux.setE_EstadoA(true);
            repoEmocion.save(emoAux);

            return "Emoción Habilitada con éxito.";

        }

    }

    public String eliminarEmocion(int idEmocion){

        if (repoEmocion.findById(idEmocion).isPresent()){

            repoEmocion.deleteById(idEmocion);

            return "Emoción Eliminada exitosamente.";

        } else {

            return "La Emoción no se encuentra registrada.";

        }

    }



}
