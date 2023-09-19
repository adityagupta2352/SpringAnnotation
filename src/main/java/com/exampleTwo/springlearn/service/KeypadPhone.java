package com.exampleTwo.springlearn.service;

import org.springframework.stereotype.Component;

@Component
class KeyPadPhone implements Phone {

    @Override
    public void calling() {
        System.out.println("Making a call from a keypad phone.");
    }

    @Override
    public void messaging() {
        System.out.println("Sending a message from a keypad phone.");
    }

    @Override
    public void photoClick() {
        System.out.println("KeyPad phones cannot take photos.");
    }

    // Additional methods specific to KeyPadPhone
    public void typeText() {
        System.out.println("Typing text on a keypad phone.");
    }
}
