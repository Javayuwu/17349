package mx.uv.listi.c17349.Saludar;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins= "*")
@RestController
public class SaludarControlador {

    Saludador persona;

    @RequestMapping("/")
    public String home() {
        return "{\"contenido\": \"xxx!\"}";
    }

    @GetMapping("/saludar/{nombre}")
    public String saludar(@PathVariable String nombre) {
        return "Hola, " + nombre + "!";
    }

    @RequestMapping(value = "/saludar2", method = RequestMethod.GET)
    public Saludador mostrar() {
        return new Saludador("Hola desde el objeto Saludador");
    }

    @GetMapping("/saludarget")
    public Saludador saludarGet(){
        return new Saludador("Hola desde GET");
    }

    @PostMapping("/saludarpost")
    public void saludarpost(@RequestBody Saludador s){
        System.out.println(s);
        this.persona = s; // eco del objeto recibido
    }
}
