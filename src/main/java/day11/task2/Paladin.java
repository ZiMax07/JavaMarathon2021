package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer{

    public  Paladin() {
        super.setHealTeammate(10);
        super.setHealHimself(25);
        super.setPhysAtt(15);
        super.setPhysDef(0.5);
        super.setMagicDef(0.2);
    }
    @Override
    public void healHimself() {
        if (super.getCurrentHealth() < super.getHealth() && super.getCurrentHealth() != 0){
        int heal = super.getCurrentHealth() + super.getHealHimself();
        super.setCurrentHealth(heal);
            if (super.getCurrentHealth() > super.getHealth()){
            super.setCurrentHealth(super.getHealth());
            }
        } else if (super.getCurrentHealth() <= 0) {
            System.out.println("Убитый Паладин не может вылечить себя. Его только на суп Шаману");
        } else {
            System.out.println("Паладин полностью здоров");
        }
    }
    @Override
    public void healTeammate(Hero hero) {
        if (hero.getCurrentHealth() < hero.getHealth() && hero.getCurrentHealth() != 0){
            int heal = hero.getCurrentHealth() + super.getHealTeammate();
            hero.setCurrentHealth(heal);
            if (hero.getCurrentHealth() > hero.getHealth()){
                hero.setCurrentHealth(hero.getHealth());
            }
        } else if (hero.getCurrentHealth() <= 0) {
            System.out.println("Персонаж убит, его можно только воскресить. А таких героев нет");
        } else if(super.getCurrentHealth() <=0){
            System.out.println("Убитый Паладин не может вылечить персонажа. Его только на суп Шаману");
        } else{
            System.out.println("Персонажу не требуется лечение, здоровье максимальное");
        }
    }
    @Override
    public void physicalAttack(Hero hero) {
        if (hero.getCurrentHealth() > 0){
            double attack = hero.getCurrentHealth() - (super.getPhysAtt() - super.getPhysAtt()*hero.getPhysDef());
            int y = (int) attack;
            hero.setCurrentHealth(y);
            if (hero.getCurrentHealth() <= 0){
                hero.setCurrentHealth(0);
                System.out.println("Персонаж убит");
            }
        } else if (hero.getCurrentHealth() <= 0){
            System.out.println("Персонаж уже убит. С него достаточно, он сражался достойно");
        }
    }
    public String toShowClassInfo(){
        return "Класс Паладин.\nЗдоровье : " + super.getHealth() + "\nФиз.Атака : " + super.getPhysAtt() +
                "\nФиз.защита : " + super.getPhysDef() + "\nМаг.защита : " + super.getMagicDef() + "\nМожет использовать лечение";
    }
    @Override
    public String toString(){
        return "Здоровье Паладина : " + super.getCurrentHealth();
    }
}
