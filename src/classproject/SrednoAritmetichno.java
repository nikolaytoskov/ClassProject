
package classproject;

import java.util.Arrays;
import java.util.Random;

public class SrednoAritmetichno {
    public static void randomMasiv(){
    Random random = new Random();
    int[] masiv1 = new int[20];
    int[] masiv2 = new int[20];
    int[] masiv3 = new int[20];
   
        for (int i = 0 ; i < masiv1.length ; i++) { // пълня масива със случайни числа от -100 до 100
          masiv1 [i] = random.nextInt(200)-100;     
          System.out.print(masiv1 [i] + " ");
          }
           System.out.println(" ");  
            int br=0;
            int sum = 0;
            double srednoAritmetichno1;
              for(int i=0; i<masiv1.length; i++){  // проверявам кои се делят на 5 без остатък
                     if(masiv1[i]%5==0) {
                     br+=1;
                     sum+=masiv1[i];                    
                 }               
        }
              System.out.println(br); // проверявам колко броя числа се делят на 5 без остатък
              srednoAritmetichno1 = sum/br; // получавам double резултат, за да бъде верен като число
              System.out.println("Средно аритметично на елементите от масива "+Arrays.toString(masiv1)+" , които се делят на 5 без остатък е: "+srednoAritmetichno1);      

          for (int i = 0 ; i < masiv2.length ; i++) { // пълня масива със случайни числа
          masiv2 [i] = random.nextInt(200)-100;     
          System.out.print(masiv2 [i] + " ");
          }
           System.out.println(" ");  
            int br2=0;
            int sum2 = 0;
            double srednoAritmetichno2;
              for(int i=0; i<masiv2.length; i++){  // проверявам кои се делят на 5 без остатък
                     if(masiv2[i]%5==0) {
                     br2+=1;
                     sum2+=masiv2[i];                    
                 }               
        }
              System.out.println(br2); // проверявам колко броя числа се делят на 5 без остатък
              srednoAritmetichno2 = sum2/br2; // получавам double резултат, за да бъде верен като число
              System.out.println("Средно аритметично на елементите от масива "+Arrays.toString(masiv2)+" , които се делят на 5 без остатък е: "+srednoAritmetichno2); 
              
              for (int i = 0 ; i < masiv3.length ; i++) { // пълня масива със случайни числа
          masiv3 [i] = random.nextInt(200)-100;     
          System.out.print(masiv3 [i] + " ");
          }
           System.out.println(" ");  
            int br3=0;
            int sum3 = 0;
            double srednoAritmetichno3;
              for(int i=0; i<masiv3.length; i++){  // проверявам кои се делят на 5 без остатък
                     if(masiv3[i]%5==0) {
                     br3+=1;
                     sum3+=masiv3[i];                    
                 }               
        }
              System.out.println(br3); // проверявам колко броя числа се делят на 5 без остатък
              srednoAritmetichno3 = sum3/br3; // получавам double резултат, за да бъде верен като число
              System.out.println("Средно аритметично на елементите от масива "+Arrays.toString(masiv3)+" , които се делят на 5 без остатък е: "+srednoAritmetichno3); 
    
    }
    
    
}
