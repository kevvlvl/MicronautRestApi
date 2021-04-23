package MicronautRestApi.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("health")
public class HealthController {

    @Get(produces = MediaType.APPLICATION_JSON)
    public String isHealthy() {
        return "healthy";
    }
}
