package com.syntax.class19;

public class DogTester {
    public static void main(String[] args) {
        Cat1 cat=new Cat1("kitty","green");
        cat.printInfo(); //Cat class does not have
        // this method but because we are using
        // inheritance we can use the methods from the
        // parent class
        Dog dog=new Dog("Max","Blue");
        dog.printInfo();
    }
}
