package exercicio3;
import java.util.Scanner;
import exercicio3.classecliente;
public class Exercicio3 {

       public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            
            classecliente c1 = new classecliente();
            
            System.out.println("Digite seu nome");
            c1.setNome(ler.nextLine());
            System.out.println("Digite sua renda");
            c1.setRenda(ler.nextDouble());
            System.out.println("Digite sua idade");
            c1.setIdade(ler.nextInt());
           System.out.println("---------------------------------------");
           
           
           System.out.println(c1);
           
        
    }
    
}
