# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data Petani menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama, id dan hasil Petani, dan memberikan output berupa informasi detail dari hasil tersebut seperti  hasil perbulan petani, komunitas yang diikuti, dan kategori petani.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Petani`, `PetaniDetail`, dan `PetaniBeraksi` adalah contoh dari class.

```bash
public class Petani {
    ...
}

public class PetaniDetail extends Petani {
    ...
}

public class PetaniBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `ptn[i] = new PetaniDetail(nama, id, hasil);` adalah contoh pembuatan object.

```bash
ptn[i] = new PetaniDetail(nama, id, hasil);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `id` dan `hasil` adalah contoh atribut.

```bash
String nama, id, hasil;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Petani` dan `PetaniDetail`.

```bash
public Mahasiswa(String nama, String id, String hasil) {
    this.nama = nama;
    this.id = id;
    this.hasil = hasil;
}

public MahasiswaDetail(String nama, String id, String hasil) {
    super(nama, id, hasil);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setId` dan `setHasil`adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setId(String id) {
    this.id = id;
}

public void setHasil(String hasil) {
    this.hasil = hasil;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getId`, `getHasil`,  `getKategori`, `getKomunitas` dan `getPenghasilan` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getId() {
    return id;
}

public String getHasil() {
    return hasil;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `id` dan `hasil` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama, id, hasil;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PetaniDetail` mewarisi `Petani` dengan sintaks `extends`.

```bash
public class PetaniDetail extends Petani {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `petaniInfo(String)` di `Petani` merupakan overloading method `petaniInfo` di `PetaniDetail` merupakan override dari method `PetaniInfo` di `Petani`.

```bash
@Override
    public String petaniInfo(){
        DecimalFormat df = new DecimalFormat("#,###");
        return super.petaniInfo()+
                "\nKategori Petani: "+getKategori()+
                "\nKomunitsa Petani: "+getKomunitas()+
                "\nPenghasilan per bulan: Rp."+df.format(getPenghasilan());
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getKategori` dan seleksi `switch` dalam method `getKomunitas`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < ptn.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
System.out.print("Masukkan nama Petani " + (i+1)+ " :");
String nama = scanner.nextLine();
System.out.print("Masukkan id Petani " + (i+1)+" :");
String id = scanner.nextLine();
System.out.print("masukkan hasil panen sawit/bulan(kg): ");
String hasil = scanner.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `PetaniDetail[] ptn = new PetaniDetail[2];` adalah contoh penggunaan array.

```bash
PetaniDetail[] ptn = new PetaniDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
} catch (Exception e) {
    System.out.println("input harus berupa angka! "+e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Fathur Rahman
NPM: 2310010263
