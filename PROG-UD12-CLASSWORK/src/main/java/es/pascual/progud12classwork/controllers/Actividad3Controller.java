package es.pascual.progud12classwork.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Actividad3Controller {

    @GetMapping("/tabla-multiplicar")
    @ResponseBody
    public String getTablasAction() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            stringBuilder.append("<br>");
            stringBuilder.append("Tabla del " + i + "<br>");
            stringBuilder.append("========" + "<br>");
            for (int j = 0; j < 10; j++) {
                int resultado = i * j;
                stringBuilder.append(i + "x" + j + "=" + resultado +  "<br>");
            }
        }
        return String.valueOf(stringBuilder);
    }

}
