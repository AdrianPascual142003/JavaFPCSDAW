package es.pascual.progud12classwork.controllers;

import es.pascual.progud12classwork.Validador;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class Actividad4Controller {

    @GetMapping("/suma")
    @ResponseBody
    public String suma(@RequestParam String numero1, @RequestParam  String numero2) {
        if (Validador.isNumeric(numero1) && Validador.isNumeric(numero2)) {
            int numero1Entero = Integer.parseInt(numero1);
            int numero2Entero = Integer.parseInt(numero2);
            int suma = numero1Entero + numero2Entero;
            return numero1Entero + " + " + numero2Entero + " = " + suma;
        }else {
            return "Los dos valores deben de ser númericos";
        }
    }

    @GetMapping("/resta")
    @ResponseBody
    public String resta(@RequestParam Map<String, String> params) {
        String numero1 = params.get("numero1");
        String numero2 = params.get("numero2");
        if (numero1 == null || numero2 == null) {
            return "Los numeros deben de ser distintos a null";
        }

        if (!Validador.isNumeric(numero1) || !Validador.isNumeric(numero2)) {
            return "Los dos valores deben de ser númericos";
        }

        int numero1Restar = Integer.parseInt(numero1);
        int numero2Restar = Integer.parseInt(numero2);
        int resultado1 = numero1Restar - numero2Restar;
        int resultado2 = numero2Restar - numero1Restar;
        return numero1Restar + " - " + numero2Restar + " = " + resultado1 + "<br>" + numero2Restar + " - " + numero1Restar + " = " + resultado2;
    }

    @GetMapping("/multiplica")
    @ResponseBody
    public String multiplicar(@RequestParam Map<String, String> params) {
        String numero1 = params.get("numero1");
        String numero2 = params.get("numero2");

        if (numero1 == null || numero2 == null) {
            return "Los numeros deben de ser distintos a null";
        }

        if (!Validador.isNumeric(numero1) || !Validador.isNumeric(numero2)) {
            return "Los dos valores deben de ser númericos";
        }

        int numero1Entero = Integer.parseInt(numero1);
        int numero2Entero = Integer.parseInt(numero2);
        int multiplicacion = numero1Entero * numero2Entero;

        return  numero1Entero + " * " + numero2Entero + " = " + multiplicacion;
    }

}
