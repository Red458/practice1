package com.company;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Hacer un menu para poder manejar un curso (añadir estudiantes, ver informacion de este...)

        Scanner scanner = new Scanner(System.in);
        Integer option;
        
        Grade grade1a = new Grade (1, "1A");
        Student[] stuList = new Student[3];
        int [] results = {5,7,8};
        stuList[0] = new Student(1,"Paca","Garte",results);
        int [] results2 = {8,9,7};
        stuList[1] = new Student(2,"Elton","Tito",results2);
        int [] results3 = {1,2,3};
        stuList[2] = new Student(3,"Jorge","Nitales",results3);

        grade1a.setStudents(stuList);

        System.out.println("0) Cerrar el programa");
        System.out.println("1) Ver el nombre del curso");
        System.out.println("2) Ver el promedio general");
        System.out.println("3) Ver la lista de alumnos");
        System.out.println("4) Ver la lista de alumnos aprobados");
        System.out.println("5) Ver la lista de alumnos desaprobados");
        System.out.println("6) Añadir un alumno");
        System.out.println("7) Borrar un alumno");
        System.out.println("8) Ver la lista de opciones");
        for (int i = 0; i > -1;) {
            System.out.printf("Ingrese la opcion que desea: ");
            option = scanner.nextInt();
            System.out.println("Usted ha elegido la opcion " + option);

            switch (option) {
                case 1:
                    System.out.println("Curso :" + grade1a.getName());
                    break;
                case 2:
                    System.out.println("El promedio general es " + grade1a.obtainGeneralAverage());
                    break;
                case 3:
                    System.out.println("1) Ver todos los alumnos");
                    System.out.println("2) Ver todos los alumnos desaprobados");
                    System.out.println("3) Ver todos los alumnos aprobados");

                    break;
                case 4:
                    System.out.println("No");
                    break;
                case 5:
                    System.out.println("No");
                    break;
                case 6:
                    System.out.println("0) Cerrar el programa");
                    System.out.println("1) Ver el nombre del curso");
                    System.out.println("2) Ver el promedio general");
                    System.out.println("3) Ver la lista de alumnos");
                    System.out.println("4) Añadir un alumno");
                    System.out.println("5) Borrar un alumno");
                    System.out.println("6) Ver la lista de opciones");
                    break;
                case 0:
                    System.out.println("Cerrando el programa...");
                    System.exit(0);
            }
        }
    }
}
