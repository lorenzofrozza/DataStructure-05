package tde.ex03;

import java.util.ArrayList;
import java.util.Arrays;

public class SortStudents {
    public static void sortByAverage(Student[] grades){
        int size = grades.length;

        for(int i = 0; i < size -1; i++){
            int min_idx = i;
            for (int j = i+1; j < size; j++){
                if (grades[j].getAverage() < grades[min_idx].getAverage()) {
                    min_idx = j;
                }
            }
            Student temp = grades[min_idx]; //Variavel temporario
            grades[min_idx] = grades[i];
            grades[i] = temp;
        }
    }

    public static void sortAlpha(ArrayList<Student> grades){
        int size = grades.size();

        for(int i = 0; i < size -1; i++){
            int min_idx = i;
            for (int j = i+1; j < size; j++){
                if (grades.get(j).getName().compareTo(grades.get(min_idx).getName()) < 0) {
                    min_idx = j;
                }

                if(min_idx != i) {
                    Student temp = grades.get(i);
                    grades.set(i, grades.get(min_idx));
                    grades.set(min_idx, temp);
                }
            }
        }
    }

    // Imprimir funcionario
    public static void print(Student[] students){
        for(Student s : students){
            System.out.println(s);
        }
    }

    // Imprimir funcionario
    public static void printArray(ArrayList<Student> students){
        for(Student s : students){
            System.out.println(s);
        }
    }
}
