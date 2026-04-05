/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
	Student std1= new Student("James", 20);
	Freshman std2= new Freshman("James", 20, 12); // name, age, credits
	Senior std3 = new Senior("John", 30, 90);

	 Scanner scnr = new Scanner(System.in);
	 System.out.print("Enter GPA for " + std1.getName() + ": ");
	 double gpaInput = scnr.nextDouble();
	 std1.setGpa(gpaInput);


	System.out.println(std1);
	System.out.println(std2);
	System.out.println(std3);

		// ToDo 13: add comments and explain your code

	}

}

