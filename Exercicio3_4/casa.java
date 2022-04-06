package Exercicio3_4;

public class casa {
    String cor;
    porta porta1=new porta();
    porta porta2=new porta();
    porta porta3=new porta();
    public static void main(String[] args){
        casa c1=new casa();
        
        c1.cor="Azul";
        c1.porta1.estado=false;
        c1.porta2.estado=false;
        c1.porta3.estado=false;

        
      

        quantasPortasEstaoAbertas(c1);

    }
    static void quantasPortasEstaoAbertas(casa casa1){
        int k=0;

        if(casa1.porta1.estado){
            k++;
        }
        if(casa1.porta2.estado){
            k++;
        }
        if(casa1.porta3.estado){
            k++;
        }


        System.out.println("Portas abertas:"+k);
    }


}
