package Exercicio8;

public class Celular {
    int bateriaTotal=100;
    int nivelBateria;

    
    void enviarMsg(){
        this.nivelBateria--;

    }
    static void fazerLig(Celular c){
        new java.util.Timer().schedule(
        new java.util.TimerTask() {
            @Override
            public void run() {
                c.nivelBateria=c.nivelBateria-5;
                c.imprimirBateria();
                if(c.nivelBateria<=0){
                    System.exit(1);
                }
            }
        },
        5000,5000);
    }
    
    void imprimirBateria(){

        System.out.println(this.nivelBateria+"/"+this.bateriaTotal);
    }
    
}
