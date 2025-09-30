package io.barisdere.start;

import java.time.LocalDateTime;

import java.util.*;

public class Main {

        public static void main(String[] args) {
            String toplamYazi = "Toplam: ";
            int sayi1 = 7;
            int sayi2 = 14;
            int toplam = sayi1 + sayi2;

            LocalDateTime tarih = LocalDateTime.now();

            System.out.println(toplamYazi +toplam);
            System.out.println("Tarih: " + tarih);
        }
}