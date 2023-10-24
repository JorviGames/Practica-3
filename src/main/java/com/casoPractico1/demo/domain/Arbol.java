/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.casoPractico1.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;


@Data
@Entity
@Table(name = "arbol")
public class Arbol implements Serializable{
    
     private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArbol;
    private String nombre;
    private String flor;
    private int dureza;
    private int anios;
    private String lugar;
    private String rutaImagen;

    public Arbol(){}

    public Arbol(String nombre, String flor, int dureza, int anios, String lugar, String rutaImagen) {
        this.nombre = nombre;
        this.flor = flor;
        this.dureza = dureza;
        this.anios = anios;
        this.lugar = lugar;
        this.rutaImagen = rutaImagen;
    }
}