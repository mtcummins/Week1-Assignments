/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mitchell Cummins
 */
public class RockPaperScissors {
    
    public static void main(String[] args){
        int user;
        int computer;
        int rounds;
        
        int tie;
        int wins;
        int loses;
        
        String input;
        Boolean done = false;
        Random rng = new Random();
        Scanner sc = new Scanner(System.in);
        
        do{
            tie=0;
            wins=0;
            loses=0;
            
            System.out.println("Please enter the number of rounds 1-10");
            rounds = Integer.parseInt(sc.nextLine());
            if(rounds<1||rounds>10){
                System.out.println("Error the number of rounds is invalid, Exiting Program!");
                break;
            }
            for(int i=1;i<=rounds;i++){
                System.out.println("Round "+i);
                System.out.println("Type in 1 for Rock.");
                System.out.println("Type in 2 for Paper.");
                System.out.println("Type in 3 for Scissors.");
               
                user = Integer.parseInt(sc.nextLine());
                computer = rng.nextInt(3)+1;
               
                if(user == computer){
                    tie++;
                    System.out.println("Its A Tie!");
                }else if(user==1){
                    if(computer==3){
                        wins++;
                        System.out.println("You Win!");
                    }else{
                        loses++;
                        System.out.println("You Lost!");
                    }
                }else if(user==2){
                    if(computer==1){
                        wins++;
                        System.out.println("You Win!");
                    }else{
                        loses++;
                        System.out.println("You Lost!");
                    }
                }else if(user==3){
                    if(computer==2){
                        wins++;
                        System.out.println("You Win!");
                    }else{
                       loses++;
                       System.out.println("You Lost!");
                    }
                }
            }
            System.out.println("Wins: "+wins+"\nLoses: "+ loses+"\nTies: "+tie);
            if(wins > loses && wins > tie){
                System.out.println("You Win!");
            }else if(loses > wins && loses > tie){
                System.out.println("Computer Wins!");
            }else{
                System.out.println("The Game Was A Tie!");
            }
            
            System.out.println("Would You Like To Play Again?");
            System.out.println("Yes or No");
            input = sc.nextLine();
            if(input=="No"){
                done = true;
            }
        }while(done == false);
    }
}
