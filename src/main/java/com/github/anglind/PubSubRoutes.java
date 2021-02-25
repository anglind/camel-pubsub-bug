package com.github.anglind;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;

public class PubSubRoutes extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("google-pubsub://{{gcp.project.id}}:{{gcp.subscription.id}}?synchronousPull=true")
                .log(LoggingLevel.INFO, "MessageReceived! ${body}");
    }
}
