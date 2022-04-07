package Exercicio5;
import java.util.Scanner;
public class Televisao {
    boolean estado;
    int volume;
    int canal;
    boolean mute;

    void mudarCanal(){
        System.out.println("1=Avançar 2=Voltar 3=Insira o Canal");
        Scanner teclado = new Scanner(System.in);
        int n;
        int k;
        n=teclado.nextInt();
        if(n==1){
            this.canal=this.canal+1;
        }
        else if(n==2){
            this.canal=this.canal-1;
        }
        else if(n==3){
            k=teclado.nextInt();
            this.canal=k;
            
        }
        
    
    }
    void ligarDesligar() {
        this.estado=!this.estado;
    }

    void muteTV(){
        this.mute=!this.mute;
    }
    void tvEstado(){
        if(this.estado){
            System.out.println("Esta ligada.");
        }
        else{
            System.out.println("Esta desligada.");
        }
    }
    void imprimir(){
        System.out.println("Ligado:"+this.estado);
        System.out.println("Volume:"+this.volume);
        System.out.println("Canal:"+this.canal);
        System.out.println("Silencioso:"+this.mute);
    }
}
