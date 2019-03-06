/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author Darragh
 */
public class Fizzbuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int x;
      
        for (int i=1;i<100;i++){
        if(i%3<1 && i%5<1){
            System.out.println(i + " fizz buzz");
        }else if(i%3<1 ) {System.out.println(i + " fizz ");} else if(i%5<1){
            System.out.println(i + " buzz");}else{System.out.println(i);};
        }
        
        }
    }
    

