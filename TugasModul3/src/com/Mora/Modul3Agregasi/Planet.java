package com.Mora.Modul3Agregasi;

public class Planet {

    private int idPlanet;
    private int urutanPlanet;
    private String namaPlanet;

    public Planet(int idPlanet, int urutanPlanet, String namaPlanet) {
        this.idPlanet = idPlanet;
        this.urutanPlanet = urutanPlanet;
        this.namaPlanet = namaPlanet;
    }

    public void setIdPlanet(int idPlanet) {
        this.idPlanet = idPlanet;
    }

    public void setUrutanPlanet(int urutanPlanet) {
        this.urutanPlanet = urutanPlanet;
    }

    public void setNamaPlanet(String namaPlanet) {
        this.namaPlanet = namaPlanet;
    }

    // Method getter id planet, urutan planet, dan nama planet
    public int getIdPlanet() {
        return idPlanet;
    }

    public int getUrutanPlanet() {
        return urutanPlanet;
    }

    public String getNamaPlanet() {
        return namaPlanet;
    }
}
