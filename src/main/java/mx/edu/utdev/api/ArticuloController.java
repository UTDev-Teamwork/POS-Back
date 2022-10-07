package mx.edu.utdev.api;

import io.javalin.apibuilder.CrudHandler;
import io.javalin.http.Context;
import mx.edu.utdev.repository.ArticuloRepository;

public class ArticuloController implements CrudHandler {

    private ArticuloRepository repository;

    public ArticuloController() {
        repository = new ArticuloRepository();
    }

    @Override
    public void create(Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Context ctx, String id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void getAll(Context ctx) {
        ctx.json(repository.findAll());
    }

    @Override
    public void getOne(Context ctx, String id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update(Context ctx, String id) {
        // TODO Auto-generated method stub

    }

}