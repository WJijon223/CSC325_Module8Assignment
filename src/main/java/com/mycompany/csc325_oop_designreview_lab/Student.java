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

	public Student(String name, int age) {
        super(name, (short) age);
    }

    public Student(String name, int age, int credits) {
        super(name, (short) age);
        this.credits = credits;
    }

	// ToDo 3: Add a field for GPA and create a setter and a getter
	
	// ToDo 4: Add comments to your code
}
