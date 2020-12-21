package com.example.glucksteinapp;

public class Experts {

    private final int name;
    private final int imageResource;

    public Experts(int name, int imageResource) {
        this.name = name;
        this.imageResource = imageResource;
    }

    public int getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }

}
