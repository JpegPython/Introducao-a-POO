package Exercicio2;

public class pessoa {
    String nome;
    int idade;
    public static void main(String[] args){
        pessoa Pessoa1=new pessoa();
        pessoa Pessoa2=new pessoa();
        
        Pessoa1.nome="joao";
        Pessoa2.nome="gabriela";
        
        Pessoa1.idade=21;
        Pessoa2.idade=21;
        
        imprimir(Pessoa1);
        imprimir(Pessoa2);


        aniver(Pessoa1);
        aniver(Pessoa2);
        
        imprimir(Pessoa1);
        imprimir(Pessoa2);
    

    }

    static void aniver(pessoa p1){
        p1.idade=p1.idade+1;
    }

    static void imprimir(pessoa p1){
        System.out.println(p1.nome);
        System.out.println(p1.idade);
    }
}