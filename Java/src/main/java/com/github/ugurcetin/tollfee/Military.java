package com.github.ugurcetin.tollfee;

public class Military implements Vehicle {
    public String getType() {
        return "Military";
    }

    public boolean isFeeFree() {
        return true;
    }
}