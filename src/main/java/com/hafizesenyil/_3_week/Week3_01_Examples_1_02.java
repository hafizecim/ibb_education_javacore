package com.hafizesenyil._3_week;

import com.hafizesenyil.utils.SpecialColor;

import java.util.Scanner;

public class Week3_01_Examples_1_02 {
    /* Kullanıcıdan Girilen Sayının Faktoriyelini Bulma
        Soru:
        Kullanıcıdan bir tam sayı alarak faktöriyelini hesaplayan programı yazınız.

        Kullanıcı sıfırdan küçük bir sayı verene kadar hesaplama yapmak

     */

    public static void main(String[] args) {

        //✅ İterative Code: Döngülerle tekrar eden işlemleri içerir.
        //✅ Clean Code: Okunabilir ve sürdürülebilir kod yazma prensibidir.

        // ITERATIVE 
        // variable
        long number, result = 1;
        // result= 1 vermeliyizki 1 sayısı çarpmada etkisizdir ve bşlangıç değeridir

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // sonsuz döngü
        while (true) {
            System.out.println("\nPozitif bir sayi giriniz: ");
            number = scanner.nextLong();
            if (number < 0) {
                System.out.println(SpecialColor.RED + "Negatif bir sayi girdiniz." + SpecialColor.RESET);
                number = Math.abs(number);
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
        }

    }

}
