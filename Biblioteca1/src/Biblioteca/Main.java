
package Biblioteca;

import java.util.Scanner;

import Biblioteca.ClasseLivro;

import Biblioteca.ClasseCliente;


public class Main {

   
    public static void main(String[] args) {
        
        
       Scanner ler = new Scanner(System.in);
       ClasseLivro a1 = new ClasseLivro();
       ClasseCliente c1 = new ClasseCliente();
        
        System.out.println("--------------------------------------------");
        System.out.println("Seja bem vindo a biblioteca Mundial");
        System.out.println("Vamos fazer seu cadastro agora");
        System.out.println("Poderia me passar algumas informações");
        System.out.println("Nome: ");
        c1.setNome(ler.nextLine());
        System.out.println("Cpf, por favor para ferificar seu cadastro");
        c1.setCpf(ler.nextLine());
        System.out.println("Endereço para a entrega ");
        c1.setEndereco(ler.nextLine());
        System.out.println("Sua idade para vermos se todos os livros estão disponiveis");
        c1.setIdade(ler.nextInt());
        
        
        
        ler.nextLine();
        
        System.out.println("------------------------------------------------");
        System.out.println("Cadastro efetuado,por amar ler.......");
        System.out.println("Vamos cadastrar um lirvo?");
        System.out.println("Nome do livro,por gentiliza");
        a1.setNome(ler.nextLine());
        System.out.println("Nome do autor");
        a1.setAutor(ler.nextLine());
        System.out.println("Ano de lançamento");
        a1.setAnoLancamento(ler.nextInt());
        System.out.println("o valor do livro a ser cobrado(acima de 50 tem desconto de 15%");
        a1.setValor(ler.nextDouble());
        
        
        
        
        System.out.println(c1);
        System.out.println(a1);
        
        
        
        
        
                
    }
    
}
