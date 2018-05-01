package com.lgior;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class TestApplication extends Application<TestAppConfiguration> {

    public static void main(final String[] args) throws Exception {
        new TestApplication().run(args);
    }

    @Override
    public String getName() {
        return "Prueba dropwizard";
    }

    @Override
    public void initialize(final Bootstrap<TestAppConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final TestAppConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
