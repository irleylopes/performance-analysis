package br.com.performance.controller;

import br.com.performance.service.AnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class AnalysisController {

    @Autowired
    private AnalysisService analysisService;

    @GetMapping
    public ResponseEntity home(){
        analysisService.home();
        return new ResponseEntity(HttpStatus.OK);
    }
}
