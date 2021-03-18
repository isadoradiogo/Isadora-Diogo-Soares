package exercicio3;




public class classecliente {
    
    private String nome;
    private int idade;
    private double renda;
   
    public String getNome(){
        return nome;
    }
public void setNome(String nome){
    this.nome = nome;
}   

   public int getIdade(){
     return idade;
   }
   public void setIdade(int idade){
       this.idade = idade;
   }
public double getRenda(){
   return renda;
}
public void setRenda(double renda){
    this.renda = renda;
   
}

public String classificarIdade(){
    String retorno;
    if(idade<18){
        retorno = "Menor de idade, acesso negado";
    }else{
        retorno = "Maior de idade";
    }
    return retorno;
}
public String classificarRenda(){
    String retornorenda;
    if(renda>12000){
        retornorenda = "Cliente como alta renda";
    }else{
        retornorenda = "Cliente com baixa renda";
    }
    return retornorenda;
}
public String toString(){
    return "Nome do cliente "+this.nome+
            "\nIdade do cliente "+this.idade+
            "\nRenda do cliente "+this.renda+
            "\n"+this.classificarIdade()+
            "\n"+this.classificarRenda();
    
}
}