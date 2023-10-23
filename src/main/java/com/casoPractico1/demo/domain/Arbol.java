/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.casoPractico1.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Arbol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_arbol;
    private String nombre;
    private String flor;
    private int dureza;
    private int años;
    private String lugar;
    private String ruta_imagen;

    public Arbol(){}

    public Arbol(String nombre, String flor, int dureza, int años, String lugar, String ruta_imagen) {
        this.nombre = nombre;
        this.flor = flor;
        this.dureza = dureza;
        this.años = años;
        this.lugar = lugar;
        this.ruta_imagen = ruta_imagen;
    }
}