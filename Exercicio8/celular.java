package Exercicio8;

import java.util.Scanner;

public class celular {
    int bateriaTotal=100;
    int nivelBateria;
    public static void main(String[] args){
        
        celular c1=new celular();
        c1.nivelBateria=90;
        imprimirBateria(c1);

        enviarMsg(c1);
        enviarMsg(c1);
        enviarMsg(c1);
        enviarMsg(c1);
        imprimirBateria(c1);
        fazerLig(c1);
        
        
        

    }
    
    static void enviarMsg(celular c){
        c.nivelBateria=c.nivelBateria-1;

    }
    static void fazerLig(celular c){
        new java.util.Timer().schedule(
        new java.util.TimerTask() {
            @Override
            public void run() {
                c.nivelBateria=c.nivelBateria-5;
                imprimirBateria(c);
                if(c.nivelBateria<=0){
                    System.exit(1);
                }
            }
        },
        5000,5000);
    }
    
    static void imprimirBateria(celular c){
        System.out.println(c.nivelBateria+"/"+c.bateriaTotal); 
    }
    
}
