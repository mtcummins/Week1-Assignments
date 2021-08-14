/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SummativeSums;

/**
 *
 * @author michc
 */
public class SummativeSums {
    
    public static void main(String[] args){
        String done = "";
        int[] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] array2 = { 999, -60, -77, 14, 160, 301 };
        int[] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 } ;
        
        System.out.println("#1 Array Sum: "+ count(array1));
        System.out.println("#2 Array Sum: "+ count(array2));
        System.out.println("#3 Array Sum: "+ count(array3));
    }
    
    public static int count(int[] ints){
        int count=0;
        for(int i=0;i<ints.length;i++){
            count+=ints[i];
        }
        return count;
    }
}
