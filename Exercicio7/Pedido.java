package Exercicio7;

public class Pedido {
    Produto item[]=new Produto[100];
    String pag;


    void imprimir(){
        for(int i=0;i<this.item.length;i++){
            if(this.item[i]!=null){
            System.out.printf("Preco do Produto[%d]: %.2f\n",i,this.item[i].preco);
            System.out.printf("Quantidade do Produto[%d]: %d\n",i,this.item[i].quant);
            }
        }
        System.out.println(this.pag);
    }
}
