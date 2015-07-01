package com.ci.hello;

import com.ci.hello.configuration.HelloWorldConfiguration;
import com.ci.hello.resources.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloWorldService extends Application<HelloWorldConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HelloWorldService().run(args);
    }

    @Override
    public void initialize(final Bootstrap bootstrap) {
    }

    @Override
    public void run(final HelloWorldConfiguration configuration, final Environment environment) throws Exception {

        environment.jersey().register(new HelloWorldResource());

//        environment.healthChecks().register("Methode Content Source ping", new NativeReaderPingHealthCheck(nativeReaderClient,
//                nativeReaderEndpointConfiguration));

    }

}
