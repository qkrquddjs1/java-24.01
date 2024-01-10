package com.greedy.level01.basic.student.run;

import java.util.Scanner;

public class Application {
        private int grade;
        private int classroom;
        private String name;
        private int kor;
        private int eng;
        private int math;
        private int total;
        private int average;


    public Application(){

    }
    public int Application(){
        return (kor + eng + math) /3;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학년 : ");
        int grade = sc.nextInt();

        System.out.print("반 : ");
        int classroom = sc.nextInt();

        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("국어점수 : ");
        int kor = sc.nextInt();

        System.out.print("영어점수 : ");
        int eng = sc.nextInt();

        System.out.print("수학점수 : ");
        int math = sc.nextInt();




    }
}
