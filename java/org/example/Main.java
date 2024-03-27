package org.example;
import java.util.Scanner;

public class Arena{

    String nome; // Nome da arena
    String lugar; // Local da arena
    Rapper rappers; // Participantes da competição


    public Arena(String nome) {
        this.nome = nome;
    }

    void addSerie(){

    }

    void mostraInfo(num){

        System.out.println("Nome da Arena: " + nome);
        System.out.println("Local do Evento: " + lugar);
        System.out.println("Rappers: ");
        for (int i = 0; i<n;i++){

        }


    }

    void microfoneDou(){


    }
    void ranking(){


    }


}

public class Rapper{

    String nome; // Nome do Rapper
    float nota; // Nota da avaliação
    int idade; // Idade do Rapper

    void mostraInfo(){

        System.out.println("Nome do Rapper: " + nome);
        System.out.println("Idade do Rapper: " + idade);
        System.out.println("Nota do Rapper: " + nota);

    }

}

public class Microfone{

    String material; // Material do microfone

}
public class Main {
    public static void main(String[] args) {

        Scanner se = new Scanner (System.in);
        Arena arena = new Arena();
        Rapper[] rapper = new Rapper[50];
        Microfone microfone = new Microfone();
        int num; // Numero de Rappers a ser cadastrado

        System.out.println("Insira o nome da Arena: ");
        arena.nome = sc.nextLine();

        System.out.println("Insira o local da Arena: ");
        arena.local = sc.nextLine();

        System.out.println("Insira o numero de Rappers a ser cadastrado: ");
        num = sc.nextInt();
        sc.nextLine();

        for (int i = o; i<num ; i++){
            System.out.println("Insira o nome do Rapper: ");
            rapper[num].nome = sc.nextLine();
            System.out.println("Insira a idade do Rapper: ");
            rapper[num].idade = sc.nextInt();
            sc.nextLine();
            System.out.println("Insira a nota do Rapper: ");
            rapper[num].nota = sc.nextFloat();

        }

        arena.mostraInfo(num);























    }
}