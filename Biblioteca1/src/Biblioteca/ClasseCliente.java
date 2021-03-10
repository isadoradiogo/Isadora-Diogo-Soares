
package Biblioteca;

public class ClasseCliente {
    private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private int idade;
    
    public ClasseCliente(){
        
    }
    public String getNome(){
        return nome;
    }
public void setNome(String nome){
    this.nome = nome;
}
public String getCpf(){
    return cpf;
}
public void setCpf (String cpf ){
    this.cpf = cpf;
}
public String getEndereco(){
    return endereco;
}
public void setEndereco(String endereco){
    this.endereco = endereco;
}
public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email = email;
}
public int getIdade(){
    return idade;
}
public void setIdade(int idade){
    this.idade = idade;
}
public String checarIdade(){
    String respostaIdade;
    if(this.idade<10){
    respostaIdade = "Menor de Idade";
}else{
     respostaIdade ="Maior de idade";
    }
    return respostaIdade;   
}
    @Override
    public String toString(){
    return "Nome: " + this.nome+
           "\nCPF: " + this.cpf+
           "\nEndereço: "+this.endereco+
            "\nEmail: "+this.email+
           "\nIdade: "+this.idade+
            "\n------Verificando Idade-----"+
            "\n"+this.checarIdade();
    }
}
         
 