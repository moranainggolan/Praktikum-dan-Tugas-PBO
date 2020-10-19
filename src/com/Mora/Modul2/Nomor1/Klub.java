package com.Mora.Modul2.Nomor1;

public class Klub {
    String nama;
    int tahunBerdiri;
    String stadion;
    int juaraUcl;
    String deskripsi;


    public Klub() {
    }
    public Klub(String nama) {
        this.nama = nama;
    }

    public Klub(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }
    public Klub(String nama, int tahunBerdiri, String stadion) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
    }
    public Klub(String nama, int tahunBerdiri, String stadion, int juaraUcl, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = juaraUcl;
        this.deskripsi = deskripsi;
    }
    public void getTeam() {
        System.out.println("Nama Club\t\t: " + nama);
        System.out.println("Tahun Berdiri\t: " + tahunBerdiri);
        System.out.println("Nama Stadion\t: " + stadion);
        System.out.println("Juara UCL\t\t: " + juaraUcl);
        System.out.println("Deskripsi Club\t: " + deskripsi);
    }
}
