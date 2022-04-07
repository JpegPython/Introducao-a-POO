package Exercicio5;

public class Main {
    public static void main(String[] args){
        Televisao t1=new Televisao();
        t1.estado=true;
        t1.volume=4;
        t1.canal=53;
        t1.mute=false;

        t1.imprimir();

        t1.ligarDesligar();
        t1.mudarCanal();
        t1.muteTV();

        t1.imprimir();

        t1.ligarDesligar();
        t1.mudarCanal();
        t1.muteTV();

        t1.imprimir();

        t1.tvEstado();


    }
}
