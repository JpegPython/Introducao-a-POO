package Exercicio8;

import static Exercicio8.Celular.fazerLig;

public class Main {
    public static void main(String[] args){

        Celular c1 =new Celular();
        c1.nivelBateria=90;
        c1.imprimirBateria();

        c1.enviarMsg();
        c1.enviarMsg();
        c1.enviarMsg();
        c1.enviarMsg();
        c1.imprimirBateria();
        fazerLig(c1);

    }
}
