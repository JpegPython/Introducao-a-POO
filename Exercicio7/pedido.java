package Exercicio7;

public class pedido {
    produto item[]=new produto[100];
    String pag;

    public static void main(String[] args){
        pedido p1=new pedido();
        p1.item[0]=new produto();
        p1.item[1]=new produto();
        p1.item[0].preco=3.10;
        p1.item[0].quant=3;
        p1.pag="cheque";

        imprimir(p1);
    }
    static void imprimir(pedido p){
        for(int i=0;i<p.item.length;i++){
            if(p.item[i]!=null){
            System.out.printf("Preco do produto[%d]: %.2f\n",i,p.item[i].preco);
            System.out.printf("Quantidade do produto[%d]: %d\n",i,p.item[i].quant);
            }
        }
        System.out.println(p.pag);
    }
}
