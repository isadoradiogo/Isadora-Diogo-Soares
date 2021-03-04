
package excicio2tarde;

import java.util.Scanner;

public class ValorRealqualdosdoisemaior {
    
    public static void main(String[] args){
      double n1, n2;
      
      Scanner ler = new Scanner(System.in);
      System.out.println("Digite um número");
       n1 = ler.nextDouble();
        System.out.println("Digite o outro número");
        n2 = ler.nextDouble();
         if(n1 > n2){
             System.out.println("O primeiro é maior que o segundo");
         }else if(n1 < n2){
             System.out.println("O segundo é maior que o primeiro");
         }else{
             System.out.println("Os dois números são iguais");
         }
        
   }
    
}