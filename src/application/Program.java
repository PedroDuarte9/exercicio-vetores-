package application;

import entities.Pensao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*A dona de um pensionato possui dez quartos para alugar para estudantes,
        sendo esses quartos identificados pelos números 0 a 9.

        Fazer um programa que inicie com todos os dez quartos vazios, e depois
        leia uma quantidade N representando o número de estudantes que vão
        alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
        N estudantes. Para cada registro de aluguel, informar o nome e email do
        estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
        que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
        um relatório de todas ocupações do pensionato, por ordem de quarto,
        conforme exemplo.*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        Pensao[] vetor = new Pensao[10];

        System.out.println("Quantos quartos serão alugados");
        int n = sc.nextInt();

        Pensao[] vetor = new Pensao[10]; //Estrutura do vetor a partir de uma classe.

        for(int i = 0; i < vetor.length; i++){
            sc.nextLine();
            System.out.println("Nome:");
            vetor[i].setNome(sc.nextLine());
            System.out.println("E-mail:");
            vetor[i].setEmail(sc.nextLine());
            System.out.println("Quarto:");
            vetor[i].setQuarto(sc.nextInt());
            vetor[i] = new Pensao();

        }

        String nome = "";
        String email = "";
        int quarto = 0;
        for (int i = 0; i < n; i++){
            nome = vetor[i].getNome();
            email = vetor[i].getEmail();
            quarto = vetor[i].getQuarto();

        }
        Pensao p1 = new Pensao(nome, email, quarto);
        Pensao p2 = new Pensao(nome, email, quarto);
        Pensao p3 = new Pensao(nome, email, quarto);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        sc.close();


    }

}
