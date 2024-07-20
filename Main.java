package com.Hotel.prg1;

public class Main {
    public static void main(String[] args) {
        HotelMenu hm = new HotelMenu();
        hm.loadMenuFromDB();

        while (true) {
            hm.dispMenu();
            hm.choice();
        }
    }
}
