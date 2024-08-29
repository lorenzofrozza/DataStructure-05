package tde.ex01;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] vetorBubble = {5, 22, 1, 106, 32, 25, 6};
        int[] vetorSelection = {51, 212, 10, 6, 16, 1025, 1};
        int[] vetorInsertion = {151, 212, 660, 1, 15, 1000, 3};

        System.out.println("- Bubble Sort -");
        Ordenacao.imprimirVetor(vetorBubble);
        Ordenacao.bubbleSortIncreasing(vetorBubble);
        Ordenacao.imprimirVetor(vetorBubble);
        Ordenacao.bubbleSortDecreasing(vetorBubble);
        Ordenacao.imprimirVetor(vetorBubble);

        System.out.println("- Selection Sort -");
        Ordenacao.imprimirVetor(vetorSelection);
        Ordenacao.selectionSortIncreasing(vetorSelection);
        Ordenacao.imprimirVetor(vetorSelection);
        Ordenacao.selectionSortDecreasing(vetorSelection);
        Ordenacao.imprimirVetor(vetorSelection);

        System.out.println("- Insertion Sort -");
        Ordenacao.imprimirVetor(vetorInsertion);
        Ordenacao.insertionSortIncreasing(vetorInsertion);
        Ordenacao.imprimirVetor(vetorInsertion);
        Ordenacao.insertionSortDecreasing(vetorInsertion);
        Ordenacao.imprimirVetor(vetorInsertion);
    }

}