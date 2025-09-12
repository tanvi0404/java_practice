package com.tanvi.Day38;

//------If-Else------//
//public class StudentMarks {
//    public static void main(String[] args) {
//        int marks = 97;
//        if(marks>90){
//            System.out.println("Good Marks");
//        }
//        else if(marks<=90 && marks>70){
//            System.out.println("Ok Ok Marks");
//        }
//        else{
//            System.out.println("Fail");
//        }
//    }
//}

//------Switch-----//
public class StudentMarks {
    public static void main(String[] args) {
        int a = 50;
        switch (a){
            case 80:
                System.out.println("Pass with good marks");
                break;
            case 70:
                System.out.println("Pass");
                break;
            case 50:
                System.out.println("Fail");
        }
    }
}