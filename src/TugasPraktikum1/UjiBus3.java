package TugasPraktikum1;

public class UjiBus3 {
    public static void main(String[] args) {
        Bus3 Bus = new Bus3(5);
        Bus.getPenumpang(17);
        Bus.getPenumpang(24);
        Bus.cetak();
        //Penambahan penumpang
        Bus.addPenumpang(2); //Tambah 2 penumpang
        Bus.cetak();
        //Penambahan penumpang
        Bus.addPenumpang(1); //Tambah 1 penumpang
        Bus.cetak();
        //Penambahan penumpang
        Bus.addPenumpang(2); //Tambah 2 penumpang
        Bus.cetak();
        //Penambahan penumpang
        Bus.addPenumpang(2); //Tambah 2 penumpang
        Bus.cetak();
        //Penghitungan rata rata berat penumpang
        Bus.getAverage();

        //Hasilnya adalah berupa password yang dimasukkan benar atau salah, output jumlah penumpang, indikator kelebihan penumpang jika lebih, serta jumlah
        //maksimal penumpang. Penggunaan parameter pada pembuatan objek, void getPenumpang, dan void addPenumpang.
        //Namun ketika jumlah penumpang yang dimasukkan berlebihan, memang benar program akan menampilkan peringatan
        //"Penumpang Melebihi Kuota", namun output jumlah penumpangnya setelah ditambah akan mengikuti jumlah penambahan pada program sebelumnya yang
        //kurang dari batas maksimal penumpang.

        //Juga akan muncul berat rata rata penumpang serta total beratnya dari method Bus.getAverage
    }
}
