package mx.edu.utdev.api;

import io.javalin.apibuilder.CrudHandler;
import io.javalin.http.Context;
import mx.edu.utdev.repository.ArticuloRepository;

public class ArticuloController implements CrudHandler {

    private ArticuloRepository repository;

    public ArticuloController() {
        //
        repository = new ArticuloRepository();
    }

    @Override
    public void create(Context ctx) {
        ctx.json(repository.create());
    }

    @Override
    public void delete(Context ctx, String id) {
        ctx.json(repository.delete(id));

    }

    @Override
    public void getAll(Context ctx) {
        //
        ctx.json(repository.findAll());
    }

    @Override
    public void getOne(Context ctx, String id) {
        // TODO Auto-generated method stub
        ctx.json(repository.getOne(id));
    }

    @Override
    public void update(Context ctx, String id) {
        ctx.json(repository.update(id));
    }
}