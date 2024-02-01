package lcs.rubrica.service;

import lcs.rubrica.model.EntityWrapper;

import java.util.List;

public interface Service<Model extends EntityWrapper> {

    void add(Model m);

    List<Model> getAll();
}
