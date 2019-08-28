package controllers;

import java.util.concurrent.CompletableFuture;

import play.mvc.*;
import play.libs.ws.WSResponse;

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
        CompletableFuture
            .completedFuture(Paylod.read)
            .thenApply(WSResponse::asJson);
        return ok(views.html.index.render());
    }

}
