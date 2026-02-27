package com.donfatesg;

public class BitTorrent extends Thread {
    Thread t;

    public BitTorrent(String name) {
        setName(name);
        System.out.println("Novo " + getName());
    }

    public void start() {
        System.out.println("Nascido " + getName());
        if (t == null){
            t = new Thread(this, getName());
            t.start();
        }
    }

    public void run() {
        System.out.println("Executando " + getName());
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println("Morto");
    }
}