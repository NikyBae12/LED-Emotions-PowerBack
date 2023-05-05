package com.ledemotions.ledep.Controlador;

import com.ledemotions.ledep.Entidad.Emocion;
import com.ledemotions.ledep.Servicio.ServicioEmocion;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin (origins = "*", maxAge = 3600)
@RestController
public class ControlEmocion {

    private ServicioEmocion servicio;

    public ControlEmocion(ServicioEmocion servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/ListarEmociones")
    public ArrayList<Emocion> listarEmociones(){

        return servicio.listarEmociones();

    }

    @GetMapping("/BuscarEmocion/{id}")
    public Emocion buscarEmocion(@PathVariable("id") int idEmocion){

        return servicio.buscarEmocionxId(idEmocion);

    }

    @GetMapping("/BuscarEmocionxNombre/{nombre}")
    public ArrayList<Emocion> buscarEmocionxNombre(@PathVariable("nombre") String nombre){

        return servicio.buscarEmocionxNombre(nombre);

    }

    @GetMapping("/BuscarEmocionxEstado/{estado}")
    public ArrayList<Emocion> buscarEmocionxEstado(@PathVariable("estado") boolean estado){

        return servicio.buscarEmocionxEstado(estado);

    }

    @PostMapping("/AgregarEmocion")
    public String agregarEmocion(@RequestBody Emocion emocion){

        return servicio.agregarEmocion(emocion);

    }

    @PutMapping("/ActualizarEmocion")
    public String actualizarEmocion(@RequestBody Emocion emocion){

        return servicio.actualizarEmocion(emocion);

    }

    @PutMapping("/DeshabilitarEmocion")
    public String deshabilitarEmocion(@RequestBody Emocion emocion){

        return servicio.deshabilitarEmocion(emocion);

    }

    @PutMapping("/HabilitarEmocion")
    public String habilitarEmocion(@RequestBody Emocion emocion){

        return servicio.habilitarEmocion(emocion);

    }

    @DeleteMapping("/EliminarEmocion/{id}")
    public String eliminarEmocion(@PathVariable("id") int idEmocion){

        return servicio.eliminarEmocion(idEmocion);

    }


}
