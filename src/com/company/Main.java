package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите количество чисел:");
        int num = scanner.nextInt();
        int[] mass = new int[num];
        for (int i = 0; i < num; i++) {
            mass[i] = random.nextInt(101);
            System.out.print(mass[i] + " ");
        }
        System.out.print("\n");
        System.out.println("Какое число нужно найти? (от 0 до 100)");
        int value;
        while (true) {
            value = scanner.nextInt();
            if (value >= 0 && value <= 100) {
                break;
            } else {
                System.out.println("Неправильный диапозон, введите снова.");
            }
        }
        boolean resultOk = false;
        int position = -1;
        for (int i = 0; i < num; i++) {
            if (mass[i] == value) {
                position = i;
                resultOk = true;
            }
        }
        if (resultOk) {
            System.out.println("Элемент найден на позиции " + position);
        } else {
            System.out.println("Элемент не найден");
        }
    }
}
