/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package birthdayparadox;

import java.util.*;

/**
 *
 * @author fuyun
 */
public class BirthdayParadox {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        int counter;
        int Counter;
        
        
        for (int i=2; i<51; i++){
            Counter = 0;
            for(int n=0; n<5000; n++){
            counter = 0;
            Set<Integer> peopleSet = new HashSet<Integer>(i);   
            int m = i;
            int birthday = 1 + new Random().nextInt(365);
            peopleSet.add(birthday);
            do{
                birthday = 1 + new Random().nextInt(365);
                if(peopleSet.contains((Object) birthday)){
                    counter++;
                }
               peopleSet.add(birthday);
                m = m-1;
              
            }while(m!=0);

            if(counter!=0){
                Counter++;
            }
            
           
           }         
            System.out.println("For "+ i +" people, the probability of two birthday is about "+(double)Counter/5000);
            
            
        }
    }
        
    }
    

