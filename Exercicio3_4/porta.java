package Exercicio3_4;
import java.util.Scanner;
public class porta {
    boolean estado;
    String cor;
    double largura;
    double altura;
    
    public static void main(String[] args){
        porta porta1=new porta();

        porta1.estado=true;
        porta1.cor="branca";
        porta1.largura=0.5;
        porta1.altura=2.3;
        pintarPorta(porta1);

        imprimir(porta1);
        estaAberta(porta1);
        abrirFechar(porta1);
        estaAberta(porta1);
        abrirFechar(porta1);
        estaAberta(porta1);


        dimensoesPorta(porta1);
        imprimir(porta1);


    }
    static void dimensoesPorta(porta p1){
        Scanner teclado = new Scanner(System.in);
        double n;
        System.out.println("Insira a nova largura:");
        n=teclado.nextDouble();
        p1.largura=n;
        System.out.println("Insira a nova altura:");
        n=teclado.nextDouble();
        p1.altura=n;
        teclado.close();

    }
    static void pintarPorta(porta p1){
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("Pinte a porta:(Azul=1 Vermelho=2 Verde=3 Amarelo=4 Branco=0)");
        n=teclado.nextInt();
        if(n==0){
            p1.cor="Branca";
        }
        else if(n==1){
            p1.cor="Azul";
        }
        else if(n==2){
            p1.cor="Vermelha";
        }
        else if(n==3){
            p1.cor="Verde";
        }
        else if(n==4){
            p1.cor="Amarela";
        }
        else{
            System.out.println("Cor nao existe.");
        }
        
        teclado.close();
        
    }


    static void abrirFechar(porta p1){
        if(p1.estado){
            p1.estado=false;
        }
        else{
            p1.estado=true;
        }
    }
    static void imprimir(porta p1){
        System.out.println("Estado:"+p1.estado);
        System.out.println("Cor:"+p1.cor);
        System.out.println("Largura:"+p1.largura);
        System.out.println("Altura:"+p1.altura);
    }
    static void estaAberta(porta p1){
        if (p1.estado){
            System.out.println("Esta Aberta");
        }
        else{
            System.out.println("Esta fechada");
        }
    }
}


