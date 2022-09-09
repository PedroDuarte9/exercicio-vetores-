package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Fazer um programa para ler um número inteiro N e os dados (nome e
          preço) de N Produtos. Armazene os N produtos em um vetor. Em
          seguida, mostrar o preço médio dos produtos.*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Quantidade de Produtos");
        int n = sc.nextInt();

        Product[] vetor = new Product[n]; //Estrutura do vetor a partir de uma classe.

        for(int i = 0; i < n; i++){
            sc.nextLine(); //QUebra de linha
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Preço: ");
            double preco = sc.nextDouble();
            vetor[i] = new Product(nome, preco); //Instanciando o vetor a partir de uma classe dentro do for para as variáveis armazenarem os valores corretos

        }

        double soma = 0.0;
        for(int i = 0; i < n; i++){
            soma += vetor[i].getPreco(); // Bloco de código para pegar apenas os valores do vetor[i]
        }

        double media = soma / n;

        System.out.println("A média de valores é: " + media);


        sc.close();


    }

}
