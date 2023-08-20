package CodeSoftProject;

import java.util.Scanner;

class Subjects{

    int hindi,english,math,science,java,allMarks=500;
    int totalSub = 5;
    String StudentName = "";
    Scanner sc = new Scanner(System.in);
    public void Marks(String name){
        StudentName = name;
        System.out.print("Enter Hindi Marks: ");
        hindi = sc.nextInt();
        System.out.print("Enter English Marks: ");
        english = sc.nextInt();
        System.out.print("Enter Maths Marks: ");
        math = sc.nextInt();
        System.out.print("Enter Science Marks: ");
        science = sc.nextInt();
        System.out.print("Enter Java Marks: ");
        java = sc.nextInt();

    }
}

class Calculation extends Subjects{
    int totalMarks = 0;
    double avg;

    public void Tmarks(){
        totalMarks = hindi + english + math + science + java;
        System.out.println(StudentName+" got "+(totalMarks)+" marks in "+allMarks);
    }

    public void AverageMarks(){
        avg = (double)totalMarks/totalSub;
        System.out.println("Average Marks is: "+avg);
    }

    public void Grade(){
        if (totalMarks<99){
            System.out.println("F Garde..");
        } else if (totalMarks>99 && totalMarks<=199) {
            System.out.println("B Garde...");
        }else if (totalMarks>200 && totalMarks<=299) {
            System.out.println("A Garde...");
        }else if (totalMarks>299 && totalMarks<=399) {
            System.out.println("E Garde...");
        }else if (totalMarks>399 && totalMarks<=500) {
            System.out.println("O Garde...");
        }
    }

}

class Display{
    public void dis(){
        Calculation c = new Calculation();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.next();
        c.Marks(name);
        c.Tmarks();
        c.AverageMarks();
        c.Grade();
    }
}

public class StudentGrade {
    public static void main(String[] args) {
        Display display = new Display();
        display.dis();
    }
}
