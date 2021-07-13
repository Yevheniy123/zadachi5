package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, cost = 0;
        System.out.println("Введите стоимость покупки: ");
        a = in.nextInt();
        if (a > 500 && a < 1000) {
            cost = a - (0.03 * a);
            System.out.println(" Вам предоставляется скидка в размере 3% " + "\n К оплате:" + cost + "грн");
        } else if (a >= 1000) {
            cost = a - (0.05 * a);
            System.out.println(" Вам предоставляется скидка в размере 5% " + "\n К оплате:" + cost + "грн");
        } else System.out.println(" К оплате:" + a + "грн");

        ////////////////////////////
        System.out.println(" /////////////////////");
        System.out.println("      Вычисление стоимости разговора по телефону." + "\nВведите исходные данные:" + "\nВведите длительность разговора (целое количество минут):");
        int time = in.nextInt();
        System.out.println("День недели (1 — понедельник, ... 7 — воскресенье)");
        int day = in.nextInt();
        switch (day) {
            case 1:
                System.out.println("Общая стоимость разговора: " + (time * 4));
                break;
            case 2:
                System.out.println("Общая стоимость разговора: " + (time * 4));
                break;
            case 3:
                System.out.println("Общая стоимость разговора: " + (time * 4));
                break;
            case 4:
                System.out.println("Общая стоимость разговора: " + (time * 4));
                break;
            case 5:
                System.out.println("Общая стоимость разговора: " + (time * 4));
                break;
            case 6:
                System.out.println("Вам предоставляется скидка 20%.\n" + "Общая стоимость разговора: " + (time * 2 - (0.2 * time)));
                break;
            case 7:
                System.out.println("Вам предоставляется скидка 20%.\n" + "Общая стоимость разговора: " + (time * 2 - (0.2 * time)));
                break;
            default:
                System.out.println("Вы ввели несуществующий день недели.");
                break;
        }


    }
}
