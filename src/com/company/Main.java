package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print("Введите х:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        if (n < 0) System.out.println("x должен быть >=0");
        else if (n == 0) System.out.println("Факториал равен 1");
        else { int f = 1;
        for (int i = 2; i <= n; i++)
            f = f * i;
            System.out.println("Факториал = "+ f);
        }
    }
}
