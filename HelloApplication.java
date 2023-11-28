package com.example.oop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Scanner;
import java.io.IOException;
import java.util.Scanner;

public class Student {

    public String name;
    public String surname;
    public String university = "BDU";
    public int age;
    public int examResult;


    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public void setExamResult(int examResult) {
        this.examResult = examResult;
    }


    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("University: " + university);
        System.out.println("Age: " + age);
        System.out.println("Exam Result: " + examResult);
    }


    public void showExamResultWithAlphabet() {
        System.out.print(name + " " + surname + ", ");

        if (examResult >= 91) {
            System.out.println("you passed the exam with A");
        } else if (examResult >= 81) {
            System.out.println("you passed the exam with B");
        } else if (examResult >= 71) {
            System.out.println("you passed the exam with C");
        } if (examResult >= 61) {
            System.out.println("you passed the exam with D");
        } if (examResult >= 51) {
            System.out.println("you passed the exam with E");
        } else {
            System.out.println("you failed the exam");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();


        Student student = new Student(name, surname, age);


        System.out.print("Enter exam result: ");
        int examResult = scanner.nextInt();
        student.setExamResult(examResult);


        System.out.println("\nStudent Information:");
        student.display();


        System.out.println("\nExam Result:");
        student.showExamResultWithAlphabet();


    }
}



