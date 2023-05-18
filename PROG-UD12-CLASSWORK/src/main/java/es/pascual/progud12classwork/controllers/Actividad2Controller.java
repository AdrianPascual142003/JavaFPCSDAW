package es.pascual.progud12classwork.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@Controller
public class Actividad2Controller {

    @GetMapping("/saluda")
    @ResponseBody
    public String getSaludaAction() {
        return "Hola mundo";
    }

    @GetMapping("/bingo")
    @ResponseBody
    public String getBolaAction() {
        int numeroBola = new Random().nextInt(100);
        return String.valueOf(numeroBola);
    }

    @GetMapping("/hora-actual-es")
    @ResponseBody
    public String getHoraActualAction() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return localDateTime.format(dateTimeFormatter);
    }

    @GetMapping("/hora-actual-en")
    @ResponseBody
    public String getHoraActualEnAction() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return localDateTime.format(dateTimeFormatter);
    }

}
