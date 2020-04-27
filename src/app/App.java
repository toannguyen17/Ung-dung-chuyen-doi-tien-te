package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Nhập vào số USD muốn đổi:");
        Scanner scanner = new Scanner(System.in);
        double enterNumber = scanner.nextDouble();
        double rate = 23000.0;

        double result = enterNumber*rate;
        System.out.println(enterNumber + " USD = " + result + " VND");
    }
}
