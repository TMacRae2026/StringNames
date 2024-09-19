/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3l2stringobjectsassignment;

/**
 *
 * @author TMacRae2026
 */
public class U3L2StringObjectsAssignment {

    public static void main(String[] args) {
        
        String myName = new String("Tyler MacRae");
        System.out.println("My name length is " + myName.length());
        System.out.println("My name in uppercase is " + myName.toUpperCase());
        System.out.println("My name to lower case is " + myName.toLowerCase());
        System.out.println("The first letter in my name is " + myName.charAt(0));
        System.out.println("The last letter in my name is " + myName.charAt(myName.length() - 1));
        System.out.println("The index of the spasce between my first and last name is " + myName.indexOf(" "));
        
    }
}
