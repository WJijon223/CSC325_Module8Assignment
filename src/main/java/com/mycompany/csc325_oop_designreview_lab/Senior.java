package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {
    // Constructor that takes name, age, and credits
    public Senior(String name, int age, int credits) {
        super(name, age, credits);
        if (credits < 85) {
            throw new IllegalArgumentException("Senior students must have at least 85 credits.");
        }
    }

    // toString method for Senior class
    @Override
    public String toString() {
        return "Senior{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", credits=" + getCredits() +
                ", gpa=" + getGpa() +
                '}';
    }
}
