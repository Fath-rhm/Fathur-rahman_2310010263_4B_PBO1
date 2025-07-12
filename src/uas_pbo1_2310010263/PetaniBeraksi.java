package uas_pbo1_2310010263;

import java.util.Scanner;

public class PetaniBeraksi {
    public static void main(String[] args) {
       //objek
       //Petani ptn = new Petani("kakang rudianto","D1001","1000kg");
        
       //System.out.println(ptn.petaniInfo());
       //System.out.println(ptn.petaniInfo("karya tani"));
       
       try{
            //io sederhana
            Scanner scanner = new Scanner(System.in);

            //array
            PetaniDetail[] ptn = new PetaniDetail[2];

            //perulangan
            for (int i=0; i <ptn.length; i++){
                 System.out.print("Masukkan nama Petani " + (i+1)+ " :");
                 String nama = scanner.nextLine();
                 System.out.print("Masukkan id Petani " + (i+1)+" :");
                 String id = scanner.nextLine();
                 System.out.print("masukkan hasil panen sawit/bulan(kg): ");
                 String hasil = scanner.nextLine();

                 //objek
                 ptn[i] = new PetaniDetail(nama, id, hasil);
            }
            //perulangan
             for(PetaniDetail data: ptn){
                 System.out.println("--------------------------------------");
                 System.out.println(data.petaniInfo());
           }
        //error handling
        }catch(Exception e){
                System.out.println("input harus berupa angka! "+e.getMessage());
                }
        
    }
}
