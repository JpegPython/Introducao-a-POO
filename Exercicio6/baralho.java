package Exercicio6;


public class baralho {
    carta deck[]=new carta[52];
    boolean sorted;

    public static void main(String[] args){
        baralho bar1=new baralho();
        for(int i=0;i<52;i++){
            bar1.deck[i]=new carta();
        }
        
        insereNaipes(bar1);
        insereValores(bar1);
        imprimir(bar1);
        
    }



    static void imprimir(baralho b){
        for(int i=0;i<52;i++){
            System.out.println("Valor:"+b.deck[i].valor);
            System.out.println("Naipe:"+b.deck[i].naipe);
            
        }

    }



    static void insereValores(baralho b){
        int j=0;
        int k=1;
        for(int i=1;i<=4;i++){
            while(k<=13){
                b.deck[j].valor=k;
                k++;
                j++;
            }
            k=1;
        }
    }




    static void insereNaipes(baralho b){
        for(int i=0;i<52;i++){
            if(i<13){
                b.deck[i].naipe="espadas";

            }
            else if(13<=i && i<26){
                b.deck[i].naipe="copas";

            }
            else if(26<=i && i<39){
                b.deck[i].naipe="paus";
            }
            else if(39<=i && i<52){
                b.deck[i].naipe="ouros";
            }

        }
    }
}
