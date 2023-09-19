package com.exampleTwo.springlearn.service;

import org.springframework.stereotype.Component;

@Component
public class SmartPhone implements Phone {

    @Override
    public void calling() {
        System.out.println("Making a call from a smartphone.");
    }

    @Override
    public void messaging() {
        System.out.println("Sending a message from a smartphone.");
    }

    @Override
    public void photoClick() {
        System.out.println("Taking a photo with a smartphone.");
    }

    // Additional methods specific to SmartPhone
    public void browseWeb() {
        System.out.println("Browsing the web from a smartphone.");
    }
}

