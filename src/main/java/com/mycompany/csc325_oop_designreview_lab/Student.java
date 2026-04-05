/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
    private int credits;
    private double gpa;

    // Constructor that takes only name and age
	public Student(String name, int age) {
        super(name, (short) age);
    }

    // Constructor that takes name, age, and credits
    public Student(String name, int age, int credits) {
        super(name, (short) age);
        this.credits = credits;
    }

	// Setters and getters for credits, gpa, and address
    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String getAddress() {
        return null; // Placeholder implementation
    }

    @Override
    public void setAddress(String address) {
        // Placeholder implementation
    }

    // Decided to add a toString method for better output representation
    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", credits=" + credits +
                ", gpa=" + gpa +
                '}';
    }
}
