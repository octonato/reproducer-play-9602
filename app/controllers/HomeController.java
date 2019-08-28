package controllers;

import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSResponse;
import play.mvc.*;

import javax.inject.Inject;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletionStage;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    final private WSClient wsClient;

    @Inject
    public HomeController(WSClient wsClient) {
        this.wsClient = wsClient;
    }

    private CompletionStage<WSResponse> remoteWsCall() {
        return wsClient.url("http://localhost:8000/payload.json").get();
    }

    public CompletionStage<Result> json() {
        return remoteWsCall()
                // under the hood, this will parse the json using
                // mapper().readTree(body);
                .thenApply(res -> Json.parse(res.getBody()))
                .thenApply(json -> ok(json.toString()));
    }

    public CompletionStage<Result> jsonWithCharset(String charsetName) {
        return remoteWsCall()
                .thenApply(res -> Json.parse(res.getBodyAsBytes().decodeString(toCharset(charsetName))))
                .thenApply(json -> ok(json.toString()));
    }

    public CompletionStage<Result> jsonWs() {
        return wsClient.url("http://localhost:8000/payload.json").get()
                // under the hood, this will parse the json using
                // ByteString bodyAsBytes = response.getBodyAsBytes();
                // objectMapper.readValue(bodyAsBytes.toArray(), JsonNode.class);
                .thenApply(WSResponse::asJson)
                .thenApply(json -> ok(json.toString()));
    }

    private Charset toCharset(String charsetName) {
        if ("iso".equals(charsetName)) {
            return StandardCharsets.ISO_8859_1;
        } else if ("utf8".equals(charsetName)) {
            return StandardCharsets.UTF_8;
        } else {
            return Charset.forName(charsetName);
        }
    }


}
