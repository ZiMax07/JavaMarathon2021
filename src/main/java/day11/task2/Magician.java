package day11.task2;

public class Magician extends Hero implements MagicAttack, PhysAttack{

    public  Magician() {
        super.setMagicAtt(20);
        super.setPhysAtt(5);
        super.setPhysDef(0.0);
        super.setMagicDef(0.8);
    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.getCurrentHealth() > 0){
            double attack = hero.getCurrentHealth() - (super.getMagicAtt() - super.getMagicAtt() * hero.getMagicDef());
            int y = (int) attack;
            hero.setCurrentHealth(y);
            if (hero.getCurrentHealth() <= 0){
                hero.setCurrentHealth(0);
                System.out.println("Персонаж убит");
            }
        } else if (hero.getCurrentHealth() <= 0){
            System.out.println("Персонаж уже убит. С другой стороны, еще один фаерболл не бывает лишним");
        }
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
            System.out.println("Персонаж уже убит. С другой стороны, еще один фаерболл не бывает лишним");
        }
    }
    public String toShowClassInfo(){
        return "Класс Маг.\nЗдоровье : " + super.getHealth() + "\nФиз.Атака : " + super.getPhysAtt() +
                "\nМаг.Атака : " + super.getMagicAtt() + "\nФиз.защита : " + super.getPhysDef() + "\nМаг.защита : " + super.getMagicDef();
    }
    @Override
    public String toString(){
        return "Здоровье Мага : " + super.getCurrentHealth();
    }
}
