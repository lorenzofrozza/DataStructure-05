package tde.ex01;

public class Ordenacao {

    //Bubble Sort Increasing
    public static void bubbleSortIncreasing(int[] vetor){
        int n = vetor.length;
        for(int i = 0; i < n -1; i++){
            for(int j = 0; j < n -i -1; j++){
                if(vetor[j] > vetor[j+1]){
                    int variavelAuxiliar = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = variavelAuxiliar;
                }
            }
        }
    }
    //Bubble Sort Decreasing
    public static void bubbleSortDecreasing(int[] vetor){
        int n = vetor.length;
        for(int i = 0; i < n -1; i++){
            for(int j = 0; j < n -i -1; j++){
                if(vetor[j] < vetor[j+1]){
                    int variavelAuxiliar = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = variavelAuxiliar;
                }
            }
        }
    }

    //Selection Sort Increasing
    public static void selectionSortIncreasing(int[] vetor){
        int n = vetor.length;

        for(int i =0; i < n -1; i++){
            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (vetor[j] < vetor[min_idx]) {
                    min_idx = j;
                }

                int temp = vetor[min_idx]; //Variavel temporario
                vetor[min_idx] = vetor[i];
                vetor[i] = temp;
            }

        }
    }
    //Selection Sort Decreasing
    public static void selectionSortDecreasing(int[] vetor){
        int n = vetor.length;

        for(int i =0; i < n -1; i++){
            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (vetor[j] > vetor[min_idx]) {
                    min_idx = j;
                }

                int temp = vetor[min_idx]; //Variavel temporario
                vetor[min_idx] = vetor[i];
                vetor[i] = temp;
            }

        }
    }

    //Insertion Sort Increasing
    public static void insertionSortIncreasing(int [] vetor){
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int key = vetor[i]; // Elemento a ser inserido na parte ordenada
            int j = i - 1;
            while (j >= 0 && vetor[j] > key) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = key; // Insere o elemento na posição correta
        }
    }
    //Insertion Sort Decreasing
    public static void insertionSortDecreasing(int [] vetor){
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int key = vetor[i]; // Elemento a ser inserido na parte ordenada
            int j = i - 1;
            while (j >= 0 && vetor[j] < key) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = key; // Insere o elemento na posição correta
        }
    }

    //Print
    public static void imprimirVetor(int[] vetor){
        System.out.print("Lista: ");
        for(int vet : vetor){
            System.out.print(vet + " ");
        }
        System.out.println();
    }
}
