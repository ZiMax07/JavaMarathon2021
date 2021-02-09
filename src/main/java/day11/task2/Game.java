package day11.task2;

public class Game {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        System.out.println(warrior.toShowClassInfo());
        System.out.println("____________");
        System.out.println(shaman.toShowClassInfo());
        System.out.println("\nНачало игры\n");
        warrior.physicalAttack(paladin);
        System.out.println(paladin.toString());
        paladin.physicalAttack(magician);
        System.out.println(magician.toString());
        shaman.healTeammate(magician);
        System.out.println(magician.toString());
        magician.magicalAttack(paladin);
        System.out.println(paladin.toString());
        shaman.physicalAttack(warrior);
        System.out.println(warrior.toString());
        paladin.healHimself();
        System.out.println(paladin.toString());
        for (int i = 0; i < 5; i++){
            warrior.physicalAttack(magician);
            System.out.println(magician.toString());
        }
    }
}