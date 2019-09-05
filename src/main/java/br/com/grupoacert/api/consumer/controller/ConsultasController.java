package br.com.grupoacert.api.consumer.controller;

import br.com.grupoacert.api.consumer.model.Conversion;
import br.com.grupoacert.api.consumer.service.ConsultasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class ConsultasController {

    @Autowired
    ConsultasService consultasService;

    @GetMapping("/conversions")
    public ResponseEntity<List<Conversion>> getAll() throws IOException {

        return new ResponseEntity<>(consultasService.getAll(), HttpStatus.OK);
    }
}
