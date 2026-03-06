package com.don;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("João", 25);

        Gson gson = new Gson();

        String json = gson.toJson(pessoa);

        System.out.println(json);

    }
}