package Biblioteca;

public class ClasseLivro {
    
     private String nome;
     private String autor;
     private int anoLancamento;
     private double valor;
     
     public ClasseLivro(){
         
     }
     public String getNome(){
         return nome;
     }
     public void setNome(String nome){
         this.nome = nome;
     }
     public String getAutor(){
         return autor;
     }
     public void setAutor(String autor){
         this.autor = autor;
     }
     public int getanoLancamento(int anoLancamento, int anolancamento){
         return anolancamento;
     }
     public void setAnoLancamento(int anoLancamento){
         this.anoLancamento = anoLancamento;
     }
     public double getValor(){
         return valor;
     }
     public void setValor(double valor){
         this.valor = valor;
     }
     public String verificarPreco(){
         String respostaPreco;
         if(this.valor >50){
             respostaPreco = "Desconto aplicavel";
         }else{
             respostaPreco = "Desconto não aplicavel";
         }
         return respostaPreco;
     }
     
     public double calcularDesconto() {
         
         double desconto;
         if(this.valor> 50){
            desconto = this.valor* 0.15; 
         }else{
             desconto = 0;
         }
         return desconto;
     }
        
     @Override
     public String toString(){
         return "Nome do Livro: "+this.nome+
                "\nAutor do livro: "+this.autor+
                 "\nAno do Lancamento: "+this.anoLancamento+
                 "\n----------verificando desconto-------------"+
                 "\n"+this.verificarPreco()+
                 "\n Valor do desconto: "+ this.calcularDesconto();
         
              
     }
     
        
}
