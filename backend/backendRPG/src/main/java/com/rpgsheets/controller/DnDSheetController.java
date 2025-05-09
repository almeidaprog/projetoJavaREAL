package com.rpgsheets.controller;

import com.rpgsheets.model.DnDSheet;
import com.rpgsheets.model.User;
import com.rpgsheets.repository.DnDSheetRepository;
import com.rpgsheets.repository.UserRepository;
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

    @Autowired
    private UserRepository userRepository;

    // Criar nova ficha associada ao usuário
    @PostMapping
    public ResponseEntity<?> createSheet(@RequestBody DnDSheet sheet, @RequestParam Long userId) {
        Optional<User> userOpt = userRepository.findById(userId);

        if (userOpt.isEmpty()) {
            return ResponseEntity.badRequest().body("Usuário não encontrado.");
        }

        sheet.setUsuario(userOpt.get()); // associa a ficha ao usuário
        DnDSheet savedSheet = dnDSheetRepository.save(sheet);

        return ResponseEntity.ok(savedSheet);
    }

    // Listar todas as fichas
    @GetMapping
    public List<DnDSheet> listSheets() {
        return dnDSheetRepository.findAll();
    }

    // Buscar ficha por ID
    @GetMapping("/{id}")
    public Optional<DnDSheet> searchSheet(@PathVariable Long id) {
        return dnDSheetRepository.findById(id);
    }
}

