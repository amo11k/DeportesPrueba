package com.example.alu53381650f.deportes_main;

/**
 * Created by alu53381650f on 26/10/15.
 */
public class Deporte {
    String nombre;

    int logo;

    public Deporte(String nombre, int logo) {
        super();
        this.nombre = nombre;
        this.logo = logo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getLogo() {
        return logo;
    }
    public void setLogo(int logo) {
        this.logo = logo;
    }

}
