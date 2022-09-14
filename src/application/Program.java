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

        Pensao[] vetor = new Pensao[10]; //Estrutura do vetor a partir de uma classe, nesse caso temos um vetor com 10 posições

        System.out.println("Quantos quartos serão alugados");
        int n = sc.nextInt(); //Aqui vamos receber a quantidade de posições que serão usadas do nosso vetor de 10 posições


        for(int i = 0; i < n; i++){
            System.out.println();//Quebra de linha
            System.out.println("Cliente #" + i);//Indicação do cliente que será chamado
            System.out.println("Digite o nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Digite o E-mail :");
            String email = sc.nextLine();
            System.out.println("Digite o número do quarto :");
            int quarto = sc.nextInt();
            vetor[quarto] = new Pensao(nome, email); //instanciando o vetor para receber na posição do quarto os dados do cliente
        }


        for (int i = 0; i < 10; i++){ //Laço de repetição para trazer os dados dos cliente com uma estrutura if para determinar como nulo os quartos não escolhidos, definindo a variável i sendo menor que o tamanho do vetor que é 10
            if (vetor[i] != null){

                System.out.println(vetor[i] +" " + i);

            }

        }

        sc.close();

    }

}
