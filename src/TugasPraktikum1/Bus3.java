package TugasPraktikum1;

import java.util.Scanner;

public class Bus3 {
    private int penumpang;
    private int maxPenumpang;
    private int beratPenumpang;

    //Konstruktor kelas Bus
    public Bus3 (int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    //Method mutator untuk menambahkan penumpang
    public void addPenumpang (int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if (temp > maxPenumpang){
            System.out.println("Penumpang Melebihi Kuota");
        }else {
            this.penumpang = temp;
        }
    }
    public void getPenumpang (int password){
        if (password == 24){
            System.out.println("Password Benar");
        }
        else {
            System.out.println("Password Salah");
        }
    }
    public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah " + penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah " + maxPenumpang);
    }
    public void getAverage(){
        //Membuat Scanner baru sebagai tempat inputan data nantinya
        Scanner masuk = new Scanner(System.in);
        //Membuat 2 variabel baru. i untuk perulangannya, sedangkan n untuk jumlah penumpangnya.
        int i, n;
        //Membuat 3 variabel baru. jum untuk mengisi dan melakukan penambahan terhadap berat masing masing penumpang.
        //x untuk menyimpan input berat penumpang yang dimasukkan user, sedangkan rata untuk menghitung rata rata
        //berat keseluruhan penumpang
        float jum, x, rata;
        //n = jumlah penumpang Bus
        n = penumpang;
        jum = 0;
        // Mengulang mulai angka 1
        i = 1;
        while (i<=n){
            System.out.println("");
            //Memasukkan berat tiap penumpang
            System.out.print ("Masukkan berat penumpang ke-"+i+": ");
            x = masuk.nextFloat();
            //Mengisi variabel dan menjumlahkan berat dari masing masing penumpang
            jum += x;
            //Agar dapat melakukan pengurutan atau perulangan dari 1 - jumlah penumpang yang telah ditentukan sebelumnya.
            i++;
        }
        rata = jum / n; //Rumus mencari rata rata berat keseluruhan penumpang Bus
        System.out.println("");
        System.out.println ("Berat rata-rata : " + rata + " Kg"); //Menampilkan berat rata rata penumpang
        System.out.println("");
        System.out.println ("Jumlah berat keseluruhan : " + jum + " Kg"); //Menampilkan jumlah berat keseluruhan penumpang
    }
}
