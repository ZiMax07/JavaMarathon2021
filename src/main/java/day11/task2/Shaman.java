package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer{


    public  Shaman() {
        super.setHealHimself(50);
        super.setHealTeammate(30);
        super.setMagicAtt(15);
        super.setPhysAtt(10);
        super.setPhysDef(0.2);
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
            System.out.println("Убитый Шаман не может вылечить себя. И такой суп пропадает...");
        } else {
            System.out.println("Шаман полностью здоров");
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
            System.out.println("Убитый Шаман не может вылечить персонажа. И такой суп пропадает...");
        } else{
            System.out.println("Персонажу не требуется лечение, здоровье максимальное");
        }
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
            System.out.println("Персонаж уже убит. Теперь сгодится только на суп");
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
            System.out.println("Персонаж уже убит. Теперь сгодится только на суп");
        }
    }
    public String toShowClassInfo(){
        return "Класс Шаман.\nЗдоровье : " + super.getHealth() + "\nФиз.Атака : " + super.getPhysAtt() +
                "\nМаг.Атака : " + super.getMagicAtt() + "\nФиз.защита : " + super.getPhysDef() + "\nМаг.защита : " + super.getMagicDef() + "\nМожет использовать лечение";
    }
    @Override
    public String toString(){
        return "Здоровье Шамана : " + super.getCurrentHealth();
    }
}
