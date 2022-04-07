package Exercicio6;

public class Main {
    public static void main(String[] args){
        Baralho deck=new Baralho();

        for(int i=0;i<52;i++){
            deck.cartas[i]=new Carta();
        }

        deck.insereValores();
        deck.insereNaipes();
        deck.imprimir();

    }
}
