package org.example;

public class Main {
    public static void main(String[] args)
    {   //enter
        System.out.println("Hello world!");
        System.out.print("Hevrida Cantik");
        System.out.printf("Santai");

        boolean flag; //try catch
        float num;

        for (int i = 1; i<= 5; i++){
            System.out.println("i =" + i);
           //ngetik cepat sout
        }


        int a = 10;
        int b = 2;
        float c= 3;
        String nama = "Hevrida";
        char q = 'Y';
        boolean flag2 = false;

        float result;
        result = a/c;
        System.out.println(result);

        int timeStart = 8;
        int timeFinish = 17;
        int waktuSaya = 9;
        int waktuPulang = 14;
                ;
        //karyawan tepat waktu dapat selamat, karyawan telat disoraki
        //dapat selamat, karyawan telat dan pulang cepat disoraki
        //karyawan telat, pulang lama, dimaafkan
        //Karyawan datang duluan, pulang cepat, dicengin
        if(waktuSaya <= timeStart && waktuPulang <= timeFinish){
            System.out.println("Selamat kamu tepat waktu");
            System.out.println("Anda Datang" + (timeStart - waktuSaya) + " Lebih Cepat");
            System.out.println("Anda Pulang" + (waktuPulang - timeFinish) + " jam lebih lama");
        }else if (waktuSaya <= timeStart && waktuPulang <= timeFinish){
            System.out.println("Datang awal. pulcep nih yee");
            //karyawan telat, pulang lama, dimaafkan
    }else if (waktuSaya >= timeStart && waktuPulang >= timeFinish) {
            System.out.println("Dimaafkan datang telatnya");
            //karyawan telat + pulang cepat disoraki
    } else{
            System.out.println("YEU TELAT");
            System.out.println("Anda Datang" + (waktuSaya - timeStart) + " Jam");
            System.out.println("Anda Pulang duluan " + (timeFinish - waktuPulang) + " jam lebih cepat");
        }
        int day =3;
        switch (day){
            case 1:
                System.out.println("Saya WFO");
                break;
            case 2:
                    System.out.println("Saya Libur/Cuti");
                    break;
            case 3:
                        System.out.println("Saya WFH");
                        break;
            default:
                System.out.println("Liburan alias weekend");
                break;

        }
        System.out.println("Hehehehe");
    }
}