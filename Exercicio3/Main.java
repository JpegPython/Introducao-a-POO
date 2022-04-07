package Exercicio3;

public class Main {
    public static void main(String[] args){
        Porta porta1=new Porta();

        porta1.estado=true;
        porta1.cor="branca";
        porta1.largura=0.5f;
        porta1.altura= 2.3f;

        porta1.pintarPorta("verde");
        porta1.imprimir();
        System.out.println();

        System.out.println("Estado:"+porta1.estaAberta());
        porta1.abrirFechar();
        System.out.println("Estado:"+porta1.estaAberta());
        porta1.abrirFechar();
        System.out.println("Estado:"+porta1.estaAberta());
        System.out.println();

        porta1.dimensoesPorta(0.7f,2.5f);
        porta1.imprimir();


    }
}
