package com.ledemotions.ledep.Entidad;

import jakarta.persistence.*;

@Entity
@Table(name = "Emociones")
public class Emocion {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_Emocion;
    @Column(length = 50, nullable = false)
    private String eNombre;
    @Column(nullable = false)
    private int eColorRed;
    @Column(nullable = false)
    private int eColorGreen;
    @Column(nullable = false)
    private int eColorBlue;
    @Column(nullable = false)
    private Boolean eEstadoA;

    public Emocion() {
    }

    public Emocion(int id_Emocion, String e_Nombre, int e_ColorRed, int e_ColorGreen, int e_ColorBlue, Boolean e_EstadoA) {
        this.id_Emocion = id_Emocion;
        this.eNombre = e_Nombre;
        this.eColorRed = e_ColorRed;
        this.eColorGreen = e_ColorGreen;
        this.eColorBlue = e_ColorBlue;
        this.eEstadoA = e_EstadoA;
    }

    public Emocion(String e_Nombre, int e_ColorRed, int e_ColorGreen, int e_ColorBlue, Boolean e_EstadoA) {
        this.eNombre = e_Nombre;
        this.eColorRed = e_ColorRed;
        this.eColorGreen = e_ColorGreen;
        this.eColorBlue = e_ColorBlue;
        this.eEstadoA = e_EstadoA;
    }

    public int getId_Emocion() {
        return id_Emocion;
    }

    public void setId_Emocion(int id_Emocion) {
        this.id_Emocion = id_Emocion;
    }

    public String getE_Nombre() {
        return eNombre;
    }

    public void setE_Nombre(String e_Nombre) {
        this.eNombre = e_Nombre;
    }

    public int getE_ColorRed() {
        return eColorRed;
    }

    public void setE_ColorRed(int e_ColorRed) {
        this.eColorRed = e_ColorRed;
    }

    public int getE_ColorGreen() {
        return eColorGreen;
    }

    public void setE_ColorGreen(int e_ColorGreen) {
        this.eColorGreen = e_ColorGreen;
    }

    public int getE_ColorBlue() {
        return eColorBlue;
    }

    public void setE_ColorBlue(int e_ColorBlue) {
        this.eColorBlue = e_ColorBlue;
    }

    public Boolean getE_EstadoA() {
        return eEstadoA;
    }

    public void setE_EstadoA(Boolean e_EstadoA) {
        this.eEstadoA = e_EstadoA;
    }

    @Override
    public String toString() {
        return "Emocion{" +
                "id_Emocion=" + id_Emocion +
                ", e_Nombre='" + eNombre + '\'' +
                ", e_ColorRed=" + eColorRed +
                ", e_ColorGreen=" + eColorGreen +
                ", e_ColorBlue=" + eColorBlue +
                ", e_EstadoA=" + eEstadoA +
                '}';
    }
}
