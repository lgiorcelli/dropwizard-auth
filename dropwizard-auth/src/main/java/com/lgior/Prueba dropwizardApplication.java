package com.lgior;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class Prueba dropwizardApplication extends Application<Prueba dropwizardConfiguration> {

    public static void main(final String[] args) throws Exception {
        new Prueba dropwizardApplication().run(args);
    }

    @Override
    public String getName() {
        return "Prueba dropwizard";
    }

    @Override
    public void initialize(final Bootstrap<Prueba dropwizardConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final Prueba dropwizardConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
