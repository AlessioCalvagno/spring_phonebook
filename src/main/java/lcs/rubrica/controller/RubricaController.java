package lcs.rubrica.controller;

import lcs.rubrica.model.Contact;
import lcs.rubrica.service.RubricaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/rubrica")
public class RubricaController extends AbstractController<Contact> {

    @GetMapping("/get")
    public Contact searchContact(@PathParam("name") String name, @PathParam("surname") String surname) {
        return ((RubricaService) service).searchContact(name,surname);
    }

    @GetMapping("/prova")
    public void prova(){
        ((RubricaService) service).prova();
    }
}
