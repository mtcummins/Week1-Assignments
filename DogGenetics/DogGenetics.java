/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DogGenetics;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author michc
 */
public class DogGenetics {
    public static void main(String[] args){
        int golden;
        int huskey;
        int begal;
        int poodle;
        int palmeranian;
        int total=0;
        String name;
        
        Random rng = new Random();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is your dog's name?");
        name=sc.nextLine();
        
        golden = rng.nextInt(100)+1;
        total += golden;
        huskey = rng.nextInt(100-total)+1;
        total += huskey;
        begal = rng.nextInt(100-total)+1;
        total += begal;
        poodle = rng.nextInt(100-total)+1;
        total += poodle;
        palmeranian = 100-total;
        
        System.out.println("Well then, I have this highly reliable report on "+name+ " prestigious background right here.");
        System.out.println(name+" is:");       
        System.out.println();    
        System.out.println(golden+"% Golden Retreiver");
        System.out.println(huskey+"% Huskey");
        System.out.println(begal+"% Begal");
        System.out.println(poodle+"% Poodle");
        System.out.println(palmeranian+"% Palmeranian");
        System.out.println();  
        System.out.println("Wow, that's QUITE the dog!");  
    }
}
