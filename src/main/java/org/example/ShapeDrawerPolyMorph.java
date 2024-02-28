package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;


interface Shape{//one of implementation of polymorphm
    void draw(int height);
}

class drawTriangleSS implements Shape {
    //nested loop
    //outer loop

    @Override //(mengannti secara paksa cpntent dari function polymorphism)
    public void draw(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

    class drawTriangleSK implements Shape {
        //nested loop
        //outer loop

        @Override
        public void draw(int height) {
            //nested loop
            //outer loop
            for (int i = 1; i <= height; i++) {
                //inner loop
                //outer loop (take care the rows)
                System.out.println();
                System.out.println();
                //inner loop (take care the columns)
                for (int j = 1; j <= height - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");

                }
                System.out.println();
            }
        }
    }

    public class ShapeDrawerPolyMorph {

        Scanner scanner = new Scanner(System.in);

        public void drawShape(int choice) throws InputMismatchException {
            //conditional pilih menu
            switch (choice) {
                case 1:
                    System.out.println("Masukkan berapa tinggi segitiga siku-siku"); //segitiga siku-siku
                    int height = scanner.nextInt();
                    new drawTriangleSS().draw(height);
                    break;
                case 2:
                    System.out.println("Masukkan berapa tinggi segitiga sama kaki"); // segitiga sama kaki
                    int height2 = scanner.nextInt();
                    new drawTriangleSK().draw(height2);
                    break;
                case 5:
                    System.exit(0);
                    break;
               // default:
                   // System.out.println("Invalid Input"); // segitiga sama kaki
            }
            System.out.println("Please enter a valid integer");
            scanner.next();
        }




    public void displayMenu() {
            System.out.println("Selamat datang di ASCII gambar");
            System.out.println("Pilih Gambar");
            System.out.println("1. Segitiga Siku-siku");//nested loop
            System.out.println("2. Segitiga Sama Kaki");//nested loop, tapi inner loop ada 2
            System.out.println("3. Persegi");
            System.out.println("4. Persegi Panjang");
            System.out.println("5. Exit");

        }

        public void run() {
            //loop while untuk aplikasi running sampai exit
            while (true) {
                displayMenu();
                System.out.println("Masukkan Pilihan anda: ");
                try {
                    int choice = scanner.nextInt();
                    drawShape(choice);//dimana ada conditional
                    System.out.println();
                } catch (InputMismatchException ime) {
                    System.out.println("Please enter a valid integer");
                    scanner.next();
                }
            }
        }

        public static void main(String[] args) {
            //inheritance
            //untuk running
            //psvm untuk cara cepat
            ShapeDrawerPolyMorph drawer = new ShapeDrawerPolyMorph();
            drawer.run();

        }
    }

