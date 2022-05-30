package com.devsuperior.pesquisa.controllers;

import com.devsuperior.pesquisa.dto.GameDTO;
import com.devsuperior.pesquisa.dto.RecordDTO;
import com.devsuperior.pesquisa.dto.RecordInsertDTO;
import com.devsuperior.pesquisa.services.GameService;
import com.devsuperior.pesquisa.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/records")
public class RecordController {

    @Autowired
    private RecordService recordService;

    @PostMapping
    public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO dto){

            RecordDTO newDTO = recordService.insert(dto);
            return ResponseEntity.ok().body(newDTO);
    }
}
