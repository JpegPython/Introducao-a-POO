package Exercicio7;

public class Main {
    public static void main(String[] args){
        Pedido p1=new Pedido();
        p1.item[0]=new Produto();
        p1.item[1]=new Produto();
        p1.item[0].preco=3.10;
        p1.item[0].quant=3;
        p1.pag="cheque";

        p1.imprimir();
    }
}
