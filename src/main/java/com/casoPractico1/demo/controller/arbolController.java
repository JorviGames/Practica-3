/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.casoPractico1.demo.controller;

import com.casoPractico1.demo.Dao.arbolDao;
import com.casoPractico1.demo.domain.Arbol;
import com.casoPractico1.demo.service.arbolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author yorvi
 */
@Controller
@RequestMapping("/categoria")
public class arbolController {
    
    @Autowired
    private arbolService ArbolService;
    
    @GetMapping("/listado")
    public String listarArboles(Model model) {
        List<Arbol> arboles = ArbolService.getArbol();
        model.addAttribute("arboles", arboles);
        return "/categoria/listado";
    }
    
   
}
