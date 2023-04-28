package com.ledemotions.ledep.Entidad;

import jakarta.persistence.*;

@Entity
@Table(name = "Clientes")
public class Emocion {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_Emocion;
    @Column(length = 50)
    private String e_Nombre;
    @Column
    private int e_ColorRed;
    @Column
    private int e_ColorGreen;
    @Column
    private int e_ColorBlue;
    @Column
    private Boolean e_EstadoA;

    public Emocion() {
    }

    public Emocion(int id_Emocion, String e_Nombre, int e_ColorRed, int e_ColorGreen, int e_ColorBlue, Boolean e_EstadoA) {
        this.id_Emocion = id_Emocion;
        this.e_Nombre = e_Nombre;
        this.e_ColorRed = e_ColorRed;
        this.e_ColorGreen = e_ColorGreen;
        this.e_ColorBlue = e_ColorBlue;
        this.e_EstadoA = e_EstadoA;
    }

    public Emocion(String e_Nombre, int e_ColorRed, int e_ColorGreen, int e_ColorBlue, Boolean e_EstadoA) {
        this.e_Nombre = e_Nombre;
        this.e_ColorRed = e_ColorRed;
        this.e_ColorGreen = e_ColorGreen;
        this.e_ColorBlue = e_ColorBlue;
        this.e_EstadoA = e_EstadoA;
    }

    public int getId_Emocion() {
        return id_Emocion;
    }

    public void setId_Emocion(int id_Emocion) {
        this.id_Emocion = id_Emocion;
    }

    public String getE_Nombre() {
        return e_Nombre;
    }

    public void setE_Nombre(String e_Nombre) {
        this.e_Nombre = e_Nombre;
    }

    public int getE_ColorRed() {
        return e_ColorRed;
    }

    public void setE_ColorRed(int e_ColorRed) {
        this.e_ColorRed = e_ColorRed;
    }

    public int getE_ColorGreen() {
        return e_ColorGreen;
    }

    public void setE_ColorGreen(int e_ColorGreen) {
        this.e_ColorGreen = e_ColorGreen;
    }

    public int getE_ColorBlue() {
        return e_ColorBlue;
    }

    public void setE_ColorBlue(int e_ColorBlue) {
        this.e_ColorBlue = e_ColorBlue;
    }

    public Boolean getE_EstadoA() {
        return e_EstadoA;
    }

    public void setE_EstadoA(Boolean e_EstadoA) {
        this.e_EstadoA = e_EstadoA;
    }

    @Override
    public String toString() {
        return "Emocion{" +
                "id_Emocion=" + id_Emocion +
                ", e_Nombre='" + e_Nombre + '\'' +
                ", e_ColorRed=" + e_ColorRed +
                ", e_ColorGreen=" + e_ColorGreen +
                ", e_ColorBlue=" + e_ColorBlue +
                ", e_EstadoA=" + e_EstadoA +
                '}';
    }
}
