package com.company;

public class Cat {
    private String name;
    private String breed;
    private String colour;
    private boolean isAMammal;
    private int age;

    // Contructors
    public Cat() {
        System.out.println("I am here. Meow!");
    }

    public Cat(String name, String breed, String colour, boolean isAMammal, int age) {
        this.name = name;
        this.breed = breed;
        this.colour = colour;
        this.isAMammal = isAMammal;
        this.age = age;
    }

    // Methods
    public void sleep() {
        System.out.println("ZZZZZZZZZZZZ.....");
    }

    public void catchPrey (String prey) {
        System.out.println("I have caught " + prey);
    }

    // To String return all the information as a string
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", colour='" + colour + '\'' +
                ", isAMammal=" + isAMammal +
                ", age=" + age +
                '}';
    }

    public String nameOfCat() {
        System.out.println("Name: " + name);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isAMammal() {
        return isAMammal;
    }

    public void setAMammal(boolean AMammal) {
        isAMammal = AMammal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("The age cannot be a negative number");
        } else if (age > 40) {
            System.out.println("The age cannot be more than 40 years");
        } else {
            this.age = age;
        }
    }
}
