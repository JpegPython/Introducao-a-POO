package Exercicio4;

import Exercicio3.Porta;

public class Casa {
    String cor;
    Porta[] listaPortas=new Porta[3];


    void adicionarPortas(int k){
        for(int i=0;i<k;i++){
            this.listaPortas[i]=new Porta();
        }

    }
    void quantasPortasEstaoAbertas(){
        int k=0;
        for(int i=0;i< listaPortas.length;i++){
            if(this.listaPortas[i].estado){
                k++;
            }
        }
        System.out.println(k+" porta(s) estao abertas");
    }
    void pintarCasa(String str){
        this.cor=str;

    }


}
