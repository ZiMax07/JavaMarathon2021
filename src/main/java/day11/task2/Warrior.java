package day11.task2;

public class Warrior extends Hero implements PhysAttack{

    public  Warrior(){
        super.setPhysAtt(30);
        super.setPhysDef(0.8);
        super.setMagicDef(0.0);
    }
    @Override
    public void physicalAttack(Hero hero) {
        if (hero.getCurrentHealth() > 0){
        double attack = hero.getCurrentHealth() - (super.getPhysAtt() - super.getPhysAtt() * hero.getPhysDef());
        int y = (int) attack;
        hero.setCurrentHealth(y);
            if (hero.getCurrentHealth() <= 0){
                hero.setCurrentHealth(0);
                System.out.println("Персонаж убит");
            }
        } else if (hero.getCurrentHealth() <= 0){
            System.out.println("Персонаж уже убит. Хотя... Можно пнуть и проверить наверняка");
        }
    }
    public String toShowClassInfo(){
        return "Класс Воин.\nЗдоровье : " + super.getHealth() + "\nФиз.Атака : " + super.getPhysAtt() +
                "\nФиз.защита : " + super.getPhysDef() + "\nМаг.защита : " + super.getMagicDef();
    }
    @Override
    public String toString(){
        return "Здоровье Воина : " + super.getCurrentHealth();
    }
}
