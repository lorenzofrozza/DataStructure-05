//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] vetorBubble = {5, 22, 1, 106, 32, 25, 6};
        int[] vetorSelection = {51, 212, 10, 6, 16, 1025, 1};
        int[] vetorInsertion = {151, 212, 660, 6, 16, 1000, 3};


        Ordenacao.imprimirVetor(vetorBubble);
        Ordenacao.bubbleSort(vetorBubble);
        Ordenacao.imprimirVetor(vetorBubble);

        Ordenacao.imprimirVetor(vetorSelection);
        Ordenacao.selectionSort(vetorSelection);
        Ordenacao.imprimirVetor(vetorSelection);

        Ordenacao.imprimirVetor(vetorInsertion);
        Ordenacao.insertionSort(vetorInsertion);
        Ordenacao.imprimirVetor(vetorInsertion);
    }

}