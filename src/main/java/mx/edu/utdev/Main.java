package mx.edu.utdev;

import io.javalin.Javalin;
import mx.edu.utdev.repository.ArticuloRepository;

public class Main {
    public static void main(String[] args) {
        ArticuloRepository repository = new ArticuloRepository();

        Javalin app = Javalin.create().start(7070);

        app.get("/", ctx -> ctx.result("Hello World"));

        app.routes(() -> {
            app.get("/articulos", ctx -> ctx.json(repository.findAll()));
        });

        app.get("/hello/{name}", ctx -> { // the {} doesn't allow slashes ('/') as part of the parameter, <> does.
            ctx.result("Hello: " + ctx.pathParam("name"));
        });
    }
}