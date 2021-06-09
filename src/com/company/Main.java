package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int mat , fizik , turkce, kimya,muzik, total = 0;
        double ortalama;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Matematik Notunu Giriniz : ");
        mat=scanner.nextInt();
        System.out.print("Fizik Notunu Giriniz : ");
        fizik = scanner.nextInt();
        System.out.print("Türkçe Notunu Giriniz : ");
        turkce = scanner.nextInt();
        System.out.print("Kimya Notunu Giriniz : ");
        kimya = scanner.nextInt();
        System.out.print("Müzik Notunu Giriniz : ");
        muzik=scanner.nextInt();
        if (mat>0 && mat<=100) {
            total = total + mat;
            if (fizik>0 && fizik<=100){
                total = total + fizik;
            }
            if (turkce>0 && turkce<=100){
                total = total + turkce;
            }
            if (kimya>0 && kimya<=100){
                total = total + kimya;
            }
            if (muzik>0 && muzik<=100){
                total = total + muzik;
            }
        }

        ortalama=total/5;
        if (ortalama>55){
            System.out.println("Tebrikler sınıfı geçtiniz !");
        }
        else {
            System.out.println("Kaldınız seneye görüşmek üzere !");
        }
        System.out.println("Ortalamanız : " + ortalama);

    }
}
