
package excicio2tarde;

import java.util.Scanner;

public class ValoresReais{
     public static void main(String[] args) {
        
    
        double n1, n2;
      
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um número");
        n1 = ler.nextDouble(); 
        System.out.println("Digite outro número");
        n2 = ler.nextDouble();
        
        if(n1 == n2){
            System.out.println("Números iguais");
        }else{
            System.out.println("Némeros diferentes");
        }
    }   
    
}
