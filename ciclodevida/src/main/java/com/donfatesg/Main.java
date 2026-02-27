package com.donfatesg;

public class Main {
    public static void main(String[] args) {
        BitTorrent b1 = new BitTorrent("T1");
        BitTorrent b2 = new BitTorrent("T2");
        BitTorrent b3 = new BitTorrent("T3");

        b3.start();
        b2.start();
        b1.start();
    }
}