/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1.solution.karrar.al.saadi.ja;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author SMART
 */
public class Problem1SolutionKarrarAlSaadiJa {

    /**
     * @param args the command line arguments
     */

public static boolean validateRecipe(String []fridge, String []ingredients) {
 boolean result=false;
 int count=0;
    for (int i=0;i<ingredients.length;i++){
        for(int j=0;j<fridge.length;j++) {
             if(ingredients[i].compareTo(fridge[j])==0) {
                  count++;
                j=fridge.length;
             }
         }
        }
    if(count==ingredients.length)
        result=true;
    return result;
}    

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    int done=1;
    boolean result=false;
    String []fridge={"banana","apple","egg","orainge","water","onion"};
    try{
       BufferedWriter bw=new BufferedWriter(
                                                                 new FileWriter("node problem1-solution-karrar-al-saadi.ja.txt"));
       while(done== 1){
        System.out.println("\n the number of item is");
       int  numberOfItem =sc.nextInt();
       String []ingredients=new String[numberOfItem];    
      bw.write(" item is  ");  
       for(int i=0;i<numberOfItem;i++){
        System.out.println("\n  item  ["+(i+1)+"]   is:");
        ingredients[i]=sc.next();
        bw.write( ingredients[i]);
       bw.write( "\t");
       }
        result=  validateRecipe(fridge, ingredients );
         bw.write("Found :  "+String.valueOf(result)+"\n");
         System.out.println("if you need to continue enter 1\n else enter any thing ");
        done=sc.nextInt();
         }
 bw.close();
    }
    catch(Exception e){
        System.out.println(e);
            }
    }
    
}
