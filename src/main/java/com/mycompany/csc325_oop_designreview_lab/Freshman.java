package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {
    // Constructor that takes name, age, and credits
    public Freshman(String name, int age, int credits) {
        super(name, age, credits);
    }

    // toString method for Freshman class
    @Override
    public String toString() {
        return "Freshman{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", credits=" + getCredits() +
                ", gpa=" + getGpa() +
                '}';
    }
}
