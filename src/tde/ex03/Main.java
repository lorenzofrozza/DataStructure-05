package tde.ex03;

import tde.ex02.OrdenarFuncionario;
import tde.ex02.OrdenarSalario;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Pedro", 7);
        Student student2 = new Student("Eduardo", 6);
        Student student3 = new Student("Maria", 5);
        Student student4 = new Student("Gugu", 4);
        Student student5 = new Student("Xico", 5);
        Student student6 = new Student("Marcio", 9);
        Student student7 = new Student("Terezinha", 10);
        Student student8 = new Student("Pedrinho", 9);

        Student[] students = {student1, student2, student3, student4, student5, student6, student7, student8};
//        Student[] approvedStudents = new Student[students.length];
        ArrayList<Student> approvedStudents = new ArrayList<Student>();
        ArrayList<Student> disapprovedStudents = new ArrayList<Student>();

        for (Student student : students) {
            if (student.getAverage() >= 7) {
                approvedStudents.add(student);
            }else {
                disapprovedStudents.add(student);
            }
        }

        //A) em ordem crescente de nota média
        System.out.println("Students by Average: ");
        SortStudents.sortByAverage(students);
        SortStudents.print(students);
        System.out.println();

        //B) Aprovados em ordem alfabética. Considere média 7 para aprovação
        System.out.println("Alphabetical Aprroved Students: ");
        SortStudents.sortAlpha(approvedStudents);
        SortStudents.printArray(approvedStudents);
        System.out.println();

        //C) Reprovados em ordem alfabética.  Considere média 7 para aprovação.
        System.out.println("Alphabetical Disapproved Students: ");
        SortStudents.sortAlpha(disapprovedStudents);
        SortStudents.printArray(disapprovedStudents);
        System.out.println();
    }

}
