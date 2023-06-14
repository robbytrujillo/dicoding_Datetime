package com.dicoding.javafundamental.datetime;

import java.util.Calendar;

public class ExampleSplitCalendar {
    public static void main(String[] args) {
        // Menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());
        // menampilkan spesifik waktu yang diinginka
        System.out.println("Tanggal : " + calendar.get(Calendar.DATE));
        System.out.println("Bulan : " + calendar.get(Calendar.MONTH));
        System.out.println("Tahun : " + calendar.get(Calendar.YEAR));
    }
}
