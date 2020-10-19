package com.Mora.Modul2.Nomor2;

public class DemoBinatang {
    public static void main(String[] args) {

        // Objek Burung
        Burung burung = new Burung();
        burung.nama = "Burung Gagak Mata Merah";
        burung.makan = "Burung Gagak Mata Merah Makan Biji-bijian";
        burung.tidur = "Burung Gagak Mata Merah Tidur Kapanpun Mereka Mau";
        burung.terbang = "Burung Gagak Mata Merah Terbang Menggunakan Sayap";

        // Memanggil Method Burung
        System.out.println("\t\t\t*** BURUNG ***");
        burung.getNama();
        burung.binatang();
        burung.terbang();

        System.out.println();

        // Objek Ikan
        Ikan ikan = new Ikan();
        ikan.nama = "Ikan Piranha";
        ikan.makan = "Ikan Piranha Makan Apapun";
        ikan.tidur = "Ikan Piranha Tidur Pada Malam Hari";
        ikan.berenang = "Ikan Piranha Berenang Menggunakan Sirip";

        System.out.println();

        // Memanggil Method IKAN
        System.out.println("\t\t\t*** IKAN ***");
        ikan.getNama();
        ikan.binatang();
        ikan.berenang();

        System.out.println();

        // Objek Kucing
        Kucing Kucing = new Kucing();
        Kucing.nama = "Kucing Hutan";
        Kucing.makan = "Kucing Hutan Makanan Hewan Kecil";
        Kucing.tidur = "Kucing Hutan Tidur Pada Siang Hari";
        Kucing.meong = "Kucing Hutan Meong Saat Terusik";

        // Memanggil Method Kucing
        System.out.println("\t\t\t*** KUCING ***");
        Kucing.getNama();
        Kucing.binatang();
        Kucing.meong();
    }
}

