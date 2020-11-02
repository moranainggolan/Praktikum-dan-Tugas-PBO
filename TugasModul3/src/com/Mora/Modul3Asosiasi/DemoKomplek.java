package com.Mora.Modul3Asosiasi;

public class DemoKomplek {

    public static void main(String[] args) {
        // Inisiasi objek komplek
        Komplek komplek = new Komplek("Club House", "Radeon");

        // Inisiasi objek rumah
        Rumah rumah1 = new Rumah("R-02", "Asti Anatasia", 7);
        Rumah rumah2 = new Rumah("R-06", "Osi Kasim", 4);
        Rumah rumah3 = new Rumah("R-21", "Aya Ayunda", 6);
        Rumah rumah4 = new Rumah("R-69", "Dendi Loved", 8);
        Rumah rumah5 = new Rumah("R-72", "Vic Sam", 3);

        komplek.addRumah(rumah1.getIdRumah());
        komplek.addRumah(rumah2.getIdRumah());
        komplek.addRumah(rumah3.getIdRumah());
        komplek.addRumah(rumah4.getIdRumah());
        komplek.addRumah(rumah5.getIdRumah());

        komplek.getDataKompek();

    }
}
