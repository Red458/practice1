package com.company;

public class Student {
    private Integer id;
    private String name;
    private String surname;
    private int [] results;

    public Student() {
    }

    public Student(Integer id, String name, String surname, int[] results) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.results = results;
    }

    public float obtainAverage (){
        float total = 0f;
        for (int i = 0; i < results.length; i++) {
            total += results[i];
        }
        return total / results.length;
    }

    private String obtainStatus (float average){
        String result = "REPROBADO";
        if(average > 5){
            result = "APROBADO";
        }
        return result;
    }

    @Override
    public String toString() {
        float average = obtainAverage();
        return "ID: "+id +
                ", Apellido y Nombre: "+surname +" "+name+
                ", Promedio: "+average+
                ", Condicion: "+obtainStatus(average);
    }
}
