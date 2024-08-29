package tde.ex03;

public class Student {
    private String name;
    private double average;

    public Student(String name, double average){
        this.name = name;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return
                "Name: " + name +
                ", Average: " + average;
    }
}
