package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите город, чтобы узнать страну");
        System.out.println("\"Stop\" завершает работу программы");
        while (true){
        String town = console.nextLine();
            if (town.equalsIgnoreCase("Stop") || town.equalsIgnoreCase("Ыещз")){
                System.out.println("Программа завершила работу");
                break;}
        switch(town){
            case "Москва", "Владивосток", "Ростов":
                System.out.println("Россия");
                break;
            case "Рим", "Милан", "Турин":
                System.out.println("Италия");
                break;
            case "Ливерпуль", "Манчестер", "Лондон":
                System.out.println("Англия");
                break;
            case "Берлин", "Мюнхен", "Кёльн":
                System.out.println("Германия");
                break;
            default:
                System.out.println("неизвестная страна");
                break;
            }
        }
    }
}
