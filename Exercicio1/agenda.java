package Exercicio1;

public class agenda {
   
    public static void main(String[] args){
        Contato contato1=new Contato();
        Contato contato2=new Contato();

        contato1.nome="joao";
        contato2.nome="gabriela";
        contato1.numero="999000000";
        contato2.numero="999000001";
        contato1.email="joao@id.uff.br";
        contato2.email="gabriela@gmail.com";

        imprimir(contato1);
        System.out.println();
        imprimir(contato2);
        


    }
    static void imprimir(Contato contato){
        System.out.println("Nome:"+contato.nome);
        System.out.println("Numero:"+contato.numero);
        System.out.println("Email:"+contato.email);
    }


}
