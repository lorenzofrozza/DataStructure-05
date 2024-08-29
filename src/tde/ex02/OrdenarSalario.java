package tde.ex02;

public class OrdenarSalario {
    //Bubble Sort Increasing
    public static void ordemCrescente(Funcionario[] vetor){
        int n = vetor.length;
        for(int i = 0; i < n -1; i++){
            for(int j = 0; j < n -i -1; j++){
                if(vetor[j].getSalario() > vetor[j+1].getSalario()){
                    Funcionario variavelAuxiliar = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = variavelAuxiliar;
                }
            }
        }
    }

    //Bubble Sort Decreasing
    public static void ordemDecrescente(Funcionario[] vetor){
        int n = vetor.length;
        for(int i = 0; i < n -1; i++){
            for(int j = 0; j < n -i -1; j++){
                if(vetor[j].getSalario() < vetor[j+1].getSalario()){
                    Funcionario variavelAuxiliar = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = variavelAuxiliar;
                }
            }
        }
    }

}
