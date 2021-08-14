/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthyHearts;

import java.util.Scanner;

/**
 *
 * @author michc
 */
public class HealthyHearts {
    public static void main(String[] args){
        
        int heartRate;
        double minRate;
        double maxRate;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your age.");
        heartRate = 220 - Integer.parseInt(sc.nextLine());
        minRate = heartRate * .5;
        maxRate = heartRate * .85;
        System.out.println("Your maximum heart rate should be "+heartRate+" beats per minute.");
        System.out.println("Your target HR Zone is "+minRate+" - "+maxRate+" beats per minute.");
    }
}
