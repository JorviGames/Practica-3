/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.casoPractico1.demo.controller;

import com.casoPractico1.demo.service.impl.FirebaseStorageServiceImpl;
import com.casoPractico1.demo.Dao.arbolDao;
import com.casoPractico1.demo.domain.Arbol;
import com.casoPractico1.demo.service.arbolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
    @GetMapping("/nuevo")
    public String arbolNuevo(Arbol arbol) {
        return "/arbol/modifica";
    }
    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;
    
    @PostMapping("/guardar")
    public String categoriaGuardar(Arbol arbol,
            @RequestParam("imagenFile") MultipartFile imagenFile) {        
        if (!imagenFile.isEmpty()) {
            ArbolService.save(arbol);
            arbol.setRutaImagen(
                    firebaseStorageService.cargaImagen(
                            imagenFile, 
                            "arbol", 
                            arbol.getIdArbol()));
        }
        ArbolService.save(arbol);
        return "redirect:/arbol/index";
    }

    @GetMapping("/eliminar/{idArbol}")
    public String arbolEliminar(Arbol arbol) {
        ArbolService.delete(arbol);
        return "redirect:/arbol/listado";
    }

    @GetMapping("/modificar/{idArbol}")
    public String arbolModificar(Arbol arbol, Model model) {
        arbol = ArbolService.getArbol(arbol);
        model.addAttribute("arbol", arbol);
        return "/arbol/modifica";
    }
   
}
