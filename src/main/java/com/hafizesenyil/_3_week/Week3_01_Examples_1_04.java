package com.hafizesenyil._3_week;

import com.hafizesenyil.utils.SpecialColor;

import java.util.Scanner;

public class Week3_01_Examples_1_04 {
    /* Kullanıcıdan Girilen Sayının Faktoriyelini Bulma
        Soru:
        Kullanıcıdan bir tam sayı alarak faktöriyelini hesaplayan programı yazınız.

        Validation 1: Kullanıcı sıfırdan küçük bir sayı verene kadar hesaplama yapmak
        Validation 2: Kullanıcı Sıfırdan küçük sayı gererse döngü dursun (break)
        Validation 3: Kullanıcı eğer virgüllü sayi verirse kullanıcıya tekrardan sayi girilmesi beklensin,
                    eğer kullanıcı 5 kere vigüllü sayi girerse kullanıcının hakkı kalmadığından sistemden atsın
                    (System.exit(0)
     */

    // Iterative Metod ---> BU BÖLÜMÜN KONUSU
    // Recursive Metod
    // System
    // Access Modifier

    // Iterative Metod
    public static void iterativeFactoriyel() {
// variable
        long number, result = 1; // result= 1 vermeliyizki 1 sayısı çarpmada etkisizdir ve bşlangıç değeridir
        byte doubleRemainingRight = 3; // ondalıklı sayı giriş hakkı 3 hak var
        boolean isActive = true; // hak blokları için

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // sonsuz döngü
        while (true) {
            System.out.println("\nPozitif bir sayi giriniz: ");
            if (doubleRemainingRight > 0) {
                // Kullancıdan ondalık sayi girip girmediğini kontrol edin
                if (scanner.hasNextInt()) {
                    number = scanner.nextLong();
                    if (number < 0) {
                        System.out.println(SpecialColor.RED + "Negatif bir sayi girdiniz. Sistemden çıktınız" + SpecialColor.RESET);
                        //number = Math.abs(number);
                        break;               // 1. YOL //Validation 2: Kullanıcı Sıfırdan küçük sayı gererse döngü dursun
                        //System.exit(0); // 2. YOL //Validation 2: Kullanıcı Sıfırdan küçük sayı gererse döngü dursun
                        // break: yanlzıca bulunduğu döngüyü veya switch kapatıyor
                        // Sytem.exit(0) : JVM ' yi kapatarak programı durduruyor
                    } else if (number == 0) {
                        System.out.println(SpecialColor.BLUE + number + " Sayisinin faktoryeli 1 dir." + SpecialColor.RESET);
                        result = 1;
                    } else {
                        result = 1; // bu kısımda tekrar 1 ataması yaptık önceki değerleri ile işlem yapıp girmesin diye
                        for (int i = 1; i <= number; i++) {
                            // result= result*i;
                            result *= i;
                        }
                        System.out.println(SpecialColor.GREEN + number + " sayisinin faktöryeli : " + number + "! = " + result + SpecialColor.RESET);
                    }
                } else if (scanner.hasNextDouble()) {
                    //doubleRemainingRight= (byte) (doubleRemainingRight-1);
                    doubleRemainingRight--; // best practice
                    System.out.println(SpecialColor.RED + "Ondaliıkli sayi girdiniz. Kalan hakkiniz: " + doubleRemainingRight + SpecialColor.RESET);
                    if (doubleRemainingRight == 0) {
                        System.out.printf(SpecialColor.PURPLE + "Kullanici 3 defa ondalik sayi girdigi icin program sonlandi" + SpecialColor.RESET);
                        isActive = false;
                        System.exit(0);
                    }
                    scanner.next();// geçersiz girdileri temizlemek için
                } else {
                    System.out.println(SpecialColor.RED + "Harf girdiniz" + SpecialColor.RESET);
                    break;
                }// end harf

            } else {
                System.out.println("Virgullu sayi hakkiniz kalmadi ve program sonlaniyor (JVM) tarafindan");
            }


        }//end while
        scanner.close();
    }

    // Recursive Metod
    public static void recursiveFactoriyel() {

    }
    // System
    // Access Modifier


    public static void main(String[] args) {

        System.out.println("\nLütfen seçim yapınız: " +
                "\n 1) Iterative Factoriyel " +
                "\n 2) Recursive Factoriyel " +
                "\n 3) Çıkış");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                iterativeFactoriyel();
                break;
            case 2:
                recursiveFactoriyel();
                break;
            default:
                System.out.println("Doğru seçim yapınız:");

        }

    }
}// end class

