package lcs.rubrica.controller;


import lcs.rubrica.model.EntityWrapper;
import lcs.rubrica.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

public abstract class AbstractController<Model extends EntityWrapper> implements Controller<Model> {

    @Autowired
    protected Service<Model> service;


    @GetMapping("/getAll")
    @Override
    public List<Model> getAll() {
        return service.getAll();
    }

    @PostMapping("/add")
    @Override
    public void add(@RequestBody Model m) {
        service.add(m);
    }
}
