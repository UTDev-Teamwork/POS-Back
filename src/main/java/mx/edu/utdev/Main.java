package mx.edu.utdev;

import io.javalin.Javalin;
import mx.edu.utdev.context.PostgreSQLJDBC;

public class Main {
    public static void main(String[] args) {
        PostgreSQLJDBC postgreSQLJDBC = new PostgreSQLJDBC();

        Javalin app = Javalin.create().start(7070);

        app.get("/", ctx -> ctx.result("Hello World"));

        app.get("/hello/{name}", ctx -> { // the {} doesn't allow slashes ('/') as part of the parameter, <> does.
            ctx.result("Hello: " + ctx.pathParam("name"));
        });
    }
}