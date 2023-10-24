/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.casoPractico1.demo.service;

import com.casoPractico1.demo.domain.Arbol;
import java.util.List;

/**
 *
 * @author yorvi
 */
public interface arbolService {
    
    public List<Arbol> getArbol();
    
   public Arbol getArbol(Arbol arbol);
   
   public void save(Arbol arbol);
    
    public void delete(Arbol arbol);
    
}
