package Exercicio5;
import java.util.Scanner;
public class Televisao {
    boolean estado;
    int volume;
    int canal;
    boolean mute;
    public static void main(String[] args){
        Televisao t1=new Televisao();
        t1.estado=false;
        t1.volume=4;
        t1.canal=53;
        t1.mute=false;

        imprimir(t1);

        ligarDesligar(t1);
        mudarCanal(t1);
        muteTV(t1);

        imprimir(t1);

        ligarDesligar(t1);
        mudarCanal(t1);
        muteTV(t1);

        imprimir(t1);

        if(t1.estado){
            System.out.println("Esta ligada.");
        }
        else{
            System.out.println("Esta desligada.");
        }


    }
    static void mudarCanal(Televisao tv){
        System.out.println("1=Avançar 2=Voltar 3=Insira o Canal");
        Scanner teclado = new Scanner(System.in);
        int n;
        int k;
        n=teclado.nextInt();
        if(n==1){
            tv.canal=tv.canal+1;
        }
        else if(n==2){
            tv.canal=tv.canal-1;
        }
        else if(n==3){
            k=teclado.nextInt();
            tv.canal=k;
            
        }
        
    
    }
    static void ligarDesligar(Televisao tv){
        if(tv.estado==true){
            tv.estado=false;
        }
        else{
            tv.estado=true;
        }
    }
    static void muteTV(Televisao tv){
        if(tv.mute==true){
            tv.mute=false;
        }
        else{
            tv.mute=true;
        }
    }
    static void imprimir(Televisao tv){
        System.out.println("Ligado:"+tv.estado);
        System.out.println("Volume:"+tv.volume);
        System.out.println("Canal:"+tv.canal);
        System.out.println("Silencioso:"+tv.mute);
    }
}
