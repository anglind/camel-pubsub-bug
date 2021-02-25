package com.github.anglind;

import org.apache.camel.main.Main;

public class App {
    public static void main(String[] args) throws Exception {
        final Main main = new Main();
        main.configure().addRoutesBuilder(PubSubRoutes.class);
        main.run(args);
    }
}
