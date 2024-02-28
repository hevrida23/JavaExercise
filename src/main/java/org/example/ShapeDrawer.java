package org.example;

import java.util.Scanner;

public class ShapeDrawer {

    Scanner scanner = new Scanner(System.in);

    public void drawShape(int choice){
        //conditional pilih menu
        switch (choice){
            case 1:
                System.out.println("Masukkan berapa tinggi segitiga siku-siku"); //segitiga siku-siku
                int triangleHeight = scanner.nextInt();
                drawTriangleSS(triangleHeight);
                break;
            case 2:
                System.out.println("Masukkan berapa tinggi segitiga sama kaki"); // segitiga sama kaki
                int triangleHeight2 = scanner.nextInt();
               drawTriangleSK(triangleHeight2);
                break;
            case 3:
                System.out.println("Masukkan berapa tinggi persegi");// persegi
                int squareHeight = scanner.nextInt();
                drawSquare(squareHeight);
                break;
            case 4:
                System.out.println("Masukkan tinggi persegi panjang");//persegi panjang
                int rectangleHeight = scanner.nextInt();
                System.out.println("Masukkan Lebar Persegi Panjang");//lebar persegi panjang
                int rectangleWidth = scanner.nextInt();
                drawRectangle(rectangleHeight, rectangleWidth );
                break;
            case 5:
                break;
            default :
                System.out.println("Invalid Input"); // segitiga sama kaki
        }
    }

    public void drawTriangleSS(int triangleHeight){
        //nested loop
        //outer loop
        for (int i=1; i<= triangleHeight;i++){
            //inner loop
            //outer loop (take care the rows)
            System.out.println();
            //inner loop (take care the columns)
            for (int j =1;j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void drawTriangleSK(int triangleHeight){
        //nested loop
        //outer loop
        for (int i=1; i<= triangleHeight;i++){
            //inner loop
            //outer loop (take care the rows)
            System.out.println();
            System.out.println();
            //inner loop (take care the columns)
            for (int j=1;j <= triangleHeight - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i -1;k++){
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public void drawSquare(int squareHeight){
        for(int i=1; i<=squareHeight; i++) {
            for (int j = 1; j <= squareHeight; j++) {
                if (i == 1 || i == squareHeight || j == 1 || j == squareHeight)
                    System.out.print("* ");
                    else System.out.print("  ");
            }
                System.out.println();
        }
    }

   public void drawRectangle (int rows, int column)
   {
       int i;
       int j;
       for(i =1; i<= rows; i++)
       {
           for(j = 1; j<= column; j++)
           {
               System.out.print("* ");
           }
           System.out.print("\n");
       }
   }


    public void displayMenu(){
        System.out.println("Selamat datang di ASCII gambar");
        System.out.println("Pilih Gambar");
        System.out.println("1. Segitiga Siku-siku");//nested loop
        System.out.println("2. Segitiga Sama Kaki");//nested loop, tapi inner loop ada 2
        System.out.println("3. Persegi");
        System.out.println("4. Persegi Panjang");
        System.out.println("5. Exit");

    }

    public void run(){
        //loop while untuk aplikasi running sampai exit
        while(true){
          displayMenu();
            System.out.println("Masukkan Pilihan anda: ");
            int choice = scanner.nextInt();
            drawShape(choice);//dimana ada conditional
            System.out.println();
        }

    }

    public static void main(String[] args) {
        //inheritance
        //untuk running
        //psvm untuk cara cepat
        ShapeDrawer drawer = new ShapeDrawer();
        drawer.run();

    }
}
