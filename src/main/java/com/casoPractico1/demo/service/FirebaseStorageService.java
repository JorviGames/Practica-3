package com.casoPractico1.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

  
    final String BucketName = "practica3-9dc43.firebaseapp.com";

    
    final String rutaSuperiorStorage = "practica3";

    
    final String rutaJsonFile = "firebase";
    
    
    final String archivoJsonFile = "practica3-9dc43-firebase-adminsdk-o6f0i-7a6002ad94.json";
}

