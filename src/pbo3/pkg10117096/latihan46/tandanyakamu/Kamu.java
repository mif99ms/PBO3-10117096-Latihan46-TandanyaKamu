/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117096.latihan46.tandanyakamu;

/**
 *
 * @author 
 * Nama         : Miftah Muhammad Sidqi
 * NIM          : 10117096
 * Kelas        : PBO3
 */
public class Kamu {
     private int yearBirth,yearNow;
    public static final String RED = "\u001b[31m";
    public static final String RESET = "\u001B[0m";
    private String red;

    public Kamu(int yearNow){
        this.yearNow = yearNow;
    }
    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {

        return yearNow;
    }
    
    public int hitungUmur(){
        int umur = yearNow-yearBirth;
        return umur;
        
    }
    
    public String tandanyaKamu(int umur){
        if(umur>=0 && umur<=5){
            red = RED+"LAGI LUCU LUCU NYA"+RESET;
        }else if(umur>5 && umur<=10){
            red = RED+"MASIH ANAK-ANAK"+RESET;
        }else if(umur>10 && umur<=13){
            red = RED+"MASIH REMDJA"+RESET;
        }else if(umur>13 && umur<=19){
            red = RED+"ALAY"+RESET;
        }else if(umur>19 && umur<=29){
            red = RED+"LAGI GALAU NYARI JOGOH"+RESET;
        }else if(umur>29 && umur<=35){
            red = RED+"LAGI SIBUK NYARI UANG"+RESET;
        }else if(umur>35 && umur<=150){
            red = RED+"SUDAH TUA"+RESET;
        }else{
            red = RED+"TIDAK TERDETEKSI KEHIDUPAN"+RESET;
        }
        return red;
      
        
    }
}
