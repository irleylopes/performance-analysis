package br.com.performance.controller;

import br.com.performance.service.AnalysisService;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

@RestController
@RequestMapping("/home")
public class AnalysisController {

    @Autowired
    private AnalysisService analysisService;

    private static Logger logger = LogManager.getLogger(AnalysisController.class);

    private String hour = "HH:mm:ss:mm";
    private String minute = "mm:ss:mm";
    private SimpleDateFormat formatHour = new SimpleDateFormat(hour);
    private SimpleDateFormat formatMinute = new SimpleDateFormat(minute);

    @GetMapping
    public ResponseEntity home(){
        long input = System.currentTimeMillis();
        analysisService.home();
        long output = System.currentTimeMillis();
        long serviceTime = output - input;
        logger.info("Entrada: " + formatHour.format(input) + ", Saída: " + formatHour.format(output) + ", Tempo Serviço: 00:" +formatMinute.format(serviceTime));
        return new ResponseEntity(HttpStatus.OK);
    }
}
