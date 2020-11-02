package com.Mora.Modul3Komposisi;

public class Ibu {

    private int idIbu; // idIbu bertipe data integer
    private String namaIbu; // namaIbu bertipe data string
    private int umurIbu; // umurIbu bertipe data integer

    // Constractor yang memiliki parameter idIbu, namaIbu, dan umurIbu
    public Ibu(int idIbu, String namaIbu, int umurIbu) {
        this.idIbu = idIbu;
        this.namaIbu = namaIbu;
        this.umurIbu = umurIbu;
    }

    // Method getter IdIbu, NamaIbu, dan UmurIbu
    public int getIdIbu() {
        return idIbu;
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    public int getUmurIbu() {
        return umurIbu;
    }

}
