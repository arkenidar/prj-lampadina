package org.example;

public class Button {
    private Light light;

    Button(Light light) {
        this.light = light;
    }

    public void press() {
        light.click();
    }
}
