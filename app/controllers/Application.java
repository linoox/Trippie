package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Welcome Linoox :)"));
    }

    public static Result createTrip() {
        return ok(triphome.render("Create new trip"));
    }

}
