package Exercicio2;

public class Pessoa {
    String nome;
    int idade;

    void aniver(){
        this.idade++;
    }

    void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
}