package com.Mora.Modul2.Nomor1;

public class DemoKlub {
    public static void main(String[] args) {

        // Objek Club
        Klub club1 = new Klub();
        Klub club2 = new Klub("Juventus");
        Klub club3 = new Klub("Juventus","Juventus F.C adalah klub sepak bola profesional asal Italia yang berbasis di kota Turin, Piemonte.");
        Klub club4 = new Klub("Juventus", 1897, "Stadion Allianz");
        Klub club5 = new Klub("Juventus", 1897, "Stadion Allianz", 2, "Juventus F.C adalah klub sepak bola profesional asal Italia yang berbasis di kota Turin, Piemonte.");

        // Memanggil Method dari class Club
        club1.getTeam();
        System.out.println();
        club2.getTeam();
        System.out.println();
        club3.getTeam();
        System.out.println();
        club4.getTeam();
        System.out.println();
        club5.getTeam();
    }
}
