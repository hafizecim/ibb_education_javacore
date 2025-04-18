package com.hafizesenyil._3_week;


// POJO: Plain Old Java Object
// Sadece fields + getter and setter

import com.hafizesenyil.utils.SpecialColor;

// this: global nesneyi işaret eder,
public class Week3_04_Class_POJO {

    // Field
    private String name;
    private String surname;


    // Getter And Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        //  name = _name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname.toUpperCase(); // setter ile değişilik yaptık. toUpperCase büyük harf
    }

    public static void main(String[] args) {
        Week3_04_Class_POJO pojo= new Week3_04_Class_POJO(); // EĞER İNSTENS YAPMAZSAK HAFIZADA YER AYARLAYAMAYIZ
        pojo.setName("Hafize");
        pojo.setSurname("Şenyıl");
        String nameAndSurname=pojo.getName().toString()+" "+pojo.getSurname().toString();
        System.out.println(SpecialColor.BLUE+nameAndSurname+SpecialColor.RESET);
        // POLO da veri alacaksam get ile alırım hatta  string içn içine atılır
        // toStrin yapıyı stringe çeviriyor
        // Kullanıcının Soyisminin ilk üç harfini büyük yazınız ve soyisimi eğer 3 harften fazlaysa geri kalan harflerinin yerine (*)
        // Hafize ŞENYIL , Hafize ŞEN***(Maskeleme)
        // Tip(loop, conditional)
    }
}
