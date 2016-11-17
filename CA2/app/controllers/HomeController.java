package controllers;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render());
    }

    public Result genre(){
        return ok(genre.render());
    }

    public Result deals(){
        return ok(deals.render());
    }

    public Result contactus(){
        return ok(contactus.render());
    }

    public Result sports(){
        return ok(sports.render());
    }

    public Result rpg(){
        return ok(rpg.render());
    }

    public Result fps(){
        return ok(fps.render());
    }

    public Result openworld(){
        return ok(openworld.render());
    }

    public Result action(){
        return ok(action.render());
    }

    public Result explore(){
        return ok(explore.render());
    }

    public Result strategy(){
        return ok(strategy.render());
    }

    public Result simulation(){
        return ok(simulation.render());
    }

    public Result early(){
        return ok(early.render());
    }

    public Result form(){
        return ok(form.render());
    }

    public Result checkout(){
        return ok(checkout.render());
    }

    public Result category(){
        return ok(category.render());
    }
}
