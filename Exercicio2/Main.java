package Exercicio2;

public class Main {
    public static void main(String[] args){
        Pessoa pessoa1 =new Pessoa();
        Pessoa pessoa2 =new Pessoa();

        pessoa1.nome="joao";
        pessoa2.nome="gabriela";

        pessoa1.idade=22;
        pessoa2.idade=22;

        pessoa1.imprimir();
        pessoa2.imprimir();



        pessoa1.aniver();
        pessoa2.aniver();

        pessoa1.imprimir();
        pessoa2.imprimir();

    }
}
