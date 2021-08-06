package com.company;

public class Lesson17 {

    public static void main(String[] args) {
        System.out.println("Hello to Lesson 17");

        Cat myCat = new Cat();
        // Set name
        myCat.setName("Ziggy");

        myCat.sleep();
        // Set age
        myCat.setAge(3);
        System.out.println(myCat.getName() + " is " + myCat.getAge() + " years old.");

        // When the cat turns a year older
        myCat.setAge(4);
        System.out.println("It's my cat's birthday so " + myCat.getName() + " is " + myCat.getAge() + " years old now.");

        Cat myOtherCat = new Cat("Ozzy", "moggy", "black with brown", true, 4);
        System.out.println(myCat.toString());
        System.out.println(myOtherCat.toString());
    }
}
