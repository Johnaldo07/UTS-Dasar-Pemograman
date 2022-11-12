package com.mycompany.uts_bmi;
import java.util.Scanner;
public class Uts_Bmi {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int jenis_kelamin, hasil;
        float berat, tinggi, bmi, meter;
        double broca;
        
        System.out.println("hallo selamat datang di kalkulator berat badan");
        System.out.println("Pilih Jenis Kelamin Anda Di Bawah Ini: ");
        System.out.println("1. Laki-Laki");
        System.out.println("2. Perempuan");
        System.out.println("-------------------------------------------");
 
        System.out.println("Masukan Jenis Kelamin: ");
        jenis_kelamin = input.nextInt();
        System.out.println("Masukan Berat Badan: ");
        berat = input.nextFloat();
        System.out.println("Masukan Tinggi Badan: ");
        tinggi = input.nextFloat();
        meter = tinggi / 100;
 
        bmi = (berat/(meter * meter));
 
   
        System.out.print("BMI: " + bmi + " ");
 
        if (bmi < 18.5){
            System.out.println("Kurus");
        } else if (bmi <= 22.9){
            System.out.println("Normal");
        } else if (bmi < 24.9){
            System.out.println("kelebihan berat");
        } else {
            System.out.println("Obesitas");
        }
 
        switch (jenis_kelamin)
        {
            case 1 : broca = ((tinggi-100)-(0.10 * (tinggi-100))); break;
            case 2 : broca = ((tinggi-100)-(0.15 * (tinggi-100))); break;
            default : broca = 0;
        }
 
        hasil = (int) broca;
        System.out.println("Berat Badan Ideal Anda Menurut Broca " + hasil + " Kg");
    }
}