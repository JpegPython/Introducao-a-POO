package Exercicio3;

public class Porta {
    public boolean estado;
    String cor;
    float largura;
    float altura;
    

    void dimensoesPorta(float l,float h){

        this.largura=l;
        this.altura=h;


    }
    void pintarPorta(String str){
        this.cor=str;
        
    }


    void abrirFechar(){
        if(this.estado){
            this.estado=false;
        }
        else{
            this.estado=true;
        }
    }
    void imprimir(){
        System.out.println("Estado:"+this.estado);
        System.out.println("Cor:"+this.cor);
        System.out.println("Largura:"+this.largura);
        System.out.println("Altura:"+this.altura);
    }

     boolean estaAberta(){
      return this.estado;
    }
}


