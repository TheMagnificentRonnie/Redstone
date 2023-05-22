package com.example.com.magron.integrators;

import io.micronaut.http.annotation.*;

@Controller("/integratorservice")
public class IntegratorserviceController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}