package com.Mora.Modul3Asosiasi;


import java.util.ArrayList;

public class Komplek {

    private String idKomplek;
    private String namaKomplek;
    private int jmlRumah = 0;
    private ArrayList<String> idRumah = new ArrayList<String>();

    public Komplek(String idKomplek, String namaKomplek) {
        this.idKomplek = idKomplek;
        this.namaKomplek = namaKomplek;
    }
    public void addRumah(String idRumah) {
        this.idRumah.add(idRumah);
        jmlRumah = this.idRumah.size();
    }

    public String getIdKomplek() {
        return idKomplek;
    }

    public void setIdKomplek(String idKomplek) {

        this.idKomplek = idKomplek;
    }

    public String getNamaKomplek() {

        return namaKomplek;
    }

    public void setNamaKomplek(String namaKomplek) {

        this.namaKomplek = namaKomplek;
    }

    public int getJmlRumah() {

        return jmlRumah;
    }

    public void setJmlRumah(int jmlRumah) {

        this.jmlRumah = jmlRumah;
    }

    public ArrayList<String> getIdRumah() {

        return idRumah;
    }

    public void setIdRumah (ArrayList<String>idRumah){

        this.idRumah = idRumah;
    }

    public void getDataKompek() {
        System.out.println("ID Komplek\t\t: " + getIdKomplek());
        System.out.println("Nama Komplek\t: " + getNamaKomplek());
        System.out.println("Jumlah Rumah\t: " + getJmlRumah());

        for (int i = 0; i < jmlRumah; i++) {
            System.out.println((i+1) + ". " + getIdRumah().get(i));

        }
    }
}
