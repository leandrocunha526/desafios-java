package desafio;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Desafio3 {

    public static int[] entrada(int n){
        Scanner scanner = new Scanner(System.in);
        Set<Integer> valores = new HashSet<Integer>();

        for(int i = 0; i < n; i++){
            valores.add(scanner.nextInt());
        }

        int vetor[] = setConverteParaVetor(valores);

        return vetor;
    }

    private static int[] setConverteParaVetor(Set<Integer> valores) {

        int n = valores.size();
        int vetor[] = new int[n];

        int i = 0;
        for(int x : valores)
            vetor[i++] = x;

        return vetor;
    }

    public static void vetorProcessamento(int n, int k, int[] vetor){
        int count = 0;

        for(int i = 0; i < (n - 1); i++){
            for(int j = (i + 1); j < n; j++){
                if(Math.abs(vetor[i] - vetor[j]) == k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int vetor[] = entrada(n);
        n = vetor.length;
        vetorProcessamento(n, k, vetor);
    }
}
