/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.casoPractico1.demo.serviceimpl;

import com.casoPractico1.demo.Dao.arbolDao;
import com.casoPractico1.demo.domain.Arbol;
import com.casoPractico1.demo.service.arbolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author yorvi
 */
@Service
public class ArbolServiceImpl implements arbolService {

    @Autowired
    private arbolDao ArbolDao;

    @Override
    @Transactional(readOnly = true)
    public List<Arbol> getArbol() {
        return ArbolDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Arbol getArbol(Arbol arbol) {
        return ArbolDao.findById(arbol.getIdArbol()).orElse(null);
    }

}
