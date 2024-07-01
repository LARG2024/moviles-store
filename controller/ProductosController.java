package com.univer.store.controller;

import com.univer.store.entity.ProductoEntity;
import com.univer.store.model.request.ProductoRequest;
import com.univer.store.repository.ProductoRepository;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.swing.text.html.parser.Entity;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductosController {

    @Autowired
    private ProductoRepository repository;

    @GetMapping("/producto/{id}")
    public ProductoEntity producto(@PathVariable Integer id){
        return this.repository.findById(id).get();
    }

    @PostMapping("/save/product")
    public ResponseEntity<String> save(@RequestBody ProductoRequest request){
        ProductoEntity entity = new ProductoEntity();
        entity.setName(request.getName());
        entity.setSku(request.getSku());
        entity.setCantidad(request.getCantidad());

        this.repository.save(entity);

        return ResponseEntity.ok("El registro se realizo de manera correcta");

    }
}