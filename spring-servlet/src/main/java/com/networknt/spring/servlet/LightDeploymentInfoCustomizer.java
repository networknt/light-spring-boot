package com.networknt.spring.servlet;

import com.networknt.handler.Handler;
import com.networknt.handler.OrchestrationHandler;
import io.undertow.servlet.api.DeploymentInfo;
import org.springframework.boot.web.embedded.undertow.UndertowDeploymentInfoCustomizer;
import org.springframework.stereotype.Component;

//@Component
public class LightDeploymentInfoCustomizer implements UndertowDeploymentInfoCustomizer {
    @Override
    public void customize(DeploymentInfo deploymentInfo) {
        Handler.init();
        deploymentInfo.addInitialHandlerChainWrapper(handler -> {
                    return new OrchestrationHandler();
                }
        );
    }
}
