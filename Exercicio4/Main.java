package Exercicio4;

public class Main {
    public static void main(String[] args){
        Casa c1=new Casa();

        c1.cor="Azul";

        c1.adicionarPortas(3);

        c1.listaPortas[0].estado=true;
        c1.listaPortas[1].estado=true;





        c1.quantasPortasEstaoAbertas();

    }
}
