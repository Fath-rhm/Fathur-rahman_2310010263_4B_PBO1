package uas_pbo1_2310010263;

import java.text.DecimalFormat;

//inheritance
public class PetaniDetail extends Petani {
    //overriding
    public PetaniDetail(String nama, String id, String hasil) {
        super(nama, id, hasil);
    }
    
      public String getKategori() {
        //seleksi if
        double petaniKategori = Double.parseDouble(getHasil());
        if (petaniKategori < 2000) {
            return "Petani Kecil";
        } else if (petaniKategori >= 2000 && petaniKategori < 10000) {
            return "Petani Menengah";
        } else {
            return "Petani Tingkat Atas";
        }
    }

    public String getKomunitas(){
        String kodeKomunitas = getId().substring(0,2).toLowerCase();
        //seleksi swith
          switch (kodeKomunitas) {
            case "d1":
                return "Karya Tani";
            case "d2":
                return "Suka Tani";
            case "d3":
                return "Bersama Tani";
            case "d4":
                return "Karya Bersama";
            default:
                return "Tidak diketahui";
        }
    }
    
    public double getPenghasilan(){
        return Double.parseDouble(getHasil()) * 2300;
    }
    
    //polymorphism (ovrerriding)
    @Override
    public String petaniInfo(){
        DecimalFormat df = new DecimalFormat("#,###");
        return super.petaniInfo()+
                "\nKategori Petani: "+getKategori()+
                "\nKomunitsa Petani: "+getKomunitas()+
                "\nPenghasilan per bulan: Rp."+df.format(getPenghasilan());
    }
}
