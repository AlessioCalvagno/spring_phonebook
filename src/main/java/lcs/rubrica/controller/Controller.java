package lcs.rubrica.controller;

import lcs.rubrica.model.EntityWrapper;

import java.util.List;

public interface Controller<Model extends EntityWrapper> {

    List<Model> getAll();

    void add(Model m);
}