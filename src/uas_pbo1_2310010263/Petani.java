package uas_pbo1_2310010263;

//class
public class Petani {
    //atribut dan enkapsulasi
    private String nama, id, hasil;

    //constructor
    public Petani(String nama, String id, String hasil) {
        this.nama = nama;
        this.id = id;
        this.hasil = hasil;
    }
    
    //mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHasil(String hasil) {
        this.hasil = hasil;
    }
    
    
    //accessor (getter)
    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public String getHasil() {
        return hasil;
    }
    
    public String petaniInfo(){
        return "Nama petani: "+ getNama()+ 
               "\nId petani: "+ getId()+ 
               "\nHasil panen: " + getHasil()+"kg";
    }
    
    //polymorphism (overloading) 
    public String petaniInfo(String komunitas){
        return petaniInfo() + "\nKomunitas asal: "+ komunitas;
    }
}
