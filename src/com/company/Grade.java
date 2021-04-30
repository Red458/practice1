package com.company;

public class Grade {
    private Integer id;
    private String name;
    private Student [] students;

    public Grade(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public float obtainGeneralAverage(){
        float result = 0f;

        for (int i = 0; i < students.length ; i++) {
            result += students[i].obtainAverage();
        }

        return result / students.length;
    }

    public Student worstStudent (){

        Student student = students[0];
        float average = students[0].obtainAverage();

        for (int i = 1; i < students.length; i++) {
            if(average > students[i].obtainAverage()){
                average = students[i].obtainAverage();
                student = students[i];
            }
        }

        return student;
    }

    public String toString(){
        return "legajo: "+id +
                " nombre: "+name;
    }

}
