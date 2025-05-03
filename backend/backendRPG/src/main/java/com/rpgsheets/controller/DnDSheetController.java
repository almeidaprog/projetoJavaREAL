package com.rpgsheets.controller;

import com.rpgsheets.model.DnDSheet;
import com.rpgsheets.repository.DnDSheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/dnd")
@CrossOrigin(origins = "*")
public class DnDSheetController {

    @Autowired
    private DnDSheetRepository dnDSheetRepository;

    //Criar Nova Ficha
    @PostMapping
    public DnDSheet createSheet(@RequestBody DnDSheet sheet){
        return dnDSheetRepository.save(sheet);
    }

    //Listar todas as fichas
    @GetMapping
    public List<DnDSheet> listSheets(){
        return dnDSheetRepository.findAll();
    }

    //Buscar ficha por ID
    @GetMapping("/{id}")
    public Optional<DnDSheet> searchSheet(@PathVariable Long id){
        return dnDSheetRepository.findById(id);
    }

}
