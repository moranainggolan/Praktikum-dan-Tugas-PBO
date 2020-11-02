package com.Mora.Tugas4;


import java.util.Random;

public class DemoEmployee {
    public static void main(String[] args) {
        Employee[] employee = {
                new Commision(
                        "Amang Palui",
                        "128298",
                        890000,
                        990000,
                        9,
                        (float) 0
                ),
                new Salaired(
                        "Maemunah",
                        "138762",
                        876000,
                        54500,
                        7,
                        7
                ),
                new ProjectPlanner(
                        "Malih",
                        "132454",
                        487000,
                        490000,
                        3,
                        4
                )
        };

        //random index
        Random pilihan = new Random();
        Employee karyawan = employee[pilihan.nextInt(employee.length)];

        // Get gaji
        System.out.println("Semua gaji karyawan");
        karyawan.getGaji();
    }
}
