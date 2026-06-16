package com.codecool.animal;

public abstract class Animal {

    private String name;
    private int age;
    private int health;

    public Animal(String name, int age, int health) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "Unnamed";
        } else {
            this.name = name;
        }

        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }

        if (health < 0) {
            this.health = 0;
        } else if (health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAge() {
        return age;
    }

    // TODO: Implement the logic for this method with TDD approach
    //

    public abstract void makeSound();

    public String getHealthStatus() {
        int health = getHealth();

        if (health >= 80) {
            return "Healthy and Happy";
        } else if (health >= 50) {
            return "A bit tired";
        } else {
            return "Sick or exhausted";
        }
    }
}


