package com.networknt.spring.servlet;

import com.networknt.handler.Handler;
import com.networknt.handler.OrchestrationHandler;
import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.servlet.api.DeploymentInfo;
import org.springframework.boot.web.embedded.undertow.UndertowDeploymentInfoCustomizer;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LightConfig {

    @Bean
    UndertowServletWebServerFactory embeddedServletWebFactory() {
        UndertowServletWebServerFactory factory = new UndertowServletWebServerFactory();
        factory.addDeploymentInfoCustomizers(new UndertowDeploymentInfoCustomizer() {
            @Override
            public void customize(DeploymentInfo deploymentInfo) {
                Handler.init();
                deploymentInfo.addInitialHandlerChainWrapper(handler -> {
                            return new OrchestrationHandler();
//                            return Handlers.path()
//                                    .addPrefixPath("/", handler)
//                                    .addPrefixPath("/light-4j", getTestHandler());
                        }
                );
            }
        });

        return factory;
    }

    static HttpHandler getTestHandler() {
        return new HttpHandler() {
            @Override
            public void handleRequest(HttpServerExchange httpServerExchange) throws Exception {
                httpServerExchange.getResponseSender().send("OK");
            }
        };
    }
}
