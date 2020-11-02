package com.Mora.Modul3Komposisi;

import java.util.ArrayList;

public class DemoKeluarga {

    public static void main(String[] args) {
        Keluarga keluarga = new Keluarga("Keluarga Cendana", "Ternate");

        ArrayList<Anak> anakList = new ArrayList<>();

        keluarga.addAnggotaKeluarga(new Ayah(1, "Ato", 76),
                new Ibu(2, "Iis", 60),
                anakList);
        anakList.add(new Anak(1, "Ahok", 35,"Anak Kandung"));
        anakList.add(new Anak(2, "Pace", 31,"Anak Kandung"));
        
        keluarga.getDataKeluarga();
    }

}
