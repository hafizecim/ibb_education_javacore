package com.hafizesenyil._3_week;


// POJO: Plain Old Java Object
// Sadece fields + getter and setter

import com.hafizesenyil.utils.SpecialColor;

// this: global nesneyi işaret eder,
public class Week3_04_Class_POJO_01 {

    // Field
    private String name;
    private String surname;


    // Getter And Setter ----> sağ klik generate ( getter and setter -> ctrl ile seç hepsini)
    // getName gelen datayı bana verir
    // setName datayi değiştiriyor

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static void main(String[] args) {
        Week3_04_Class_POJO_01 pojo= new Week3_04_Class_POJO_01(); // EĞER INSTENS YAPMAZSAK HAFIZADA YER AYARLAYAMAYIZ
        pojo.setName("Hafize");
        pojo.setSurname("Şenyıl");
        String nameAndSurname=pojo.getName().toString()+" "+pojo.getSurname().toString();
        System.out.println(SpecialColor.BLUE+nameAndSurname+SpecialColor.RESET);
        // POLO da veri alacaksam get ile alırım hatta  string içn içine atılır
        // toStrin yapıyı stringe çeviriyor

    }
}
