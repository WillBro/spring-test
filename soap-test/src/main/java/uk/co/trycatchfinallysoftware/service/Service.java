package uk.co.trycatchfinallysoftware.service;

import org.springframework.stereotype.Component;

@Component
public class Service implements ServiceInterface {
    public String getName() {
        return "Spiderman";
    }
}
