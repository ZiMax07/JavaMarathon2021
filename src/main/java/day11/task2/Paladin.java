package day11.task2;

public class Paladin extends Hero implements Healer{

    private int healHimself;
    private int healTeammate;

    public  Paladin() {
        healHimself = 25;
        healTeammate = 10;
        super.setPhysAtt(15);
        super.setPhysDef(0.5);
        super.setMagicDef(0.2);
    }
    @Override
    public void healHimself() {
        if (super.getCurrentHealth() < super.getHP_MAX() && super.getCurrentHealth() != 0){
        int heal = super.getCurrentHealth() + healHimself;
        super.setCurrentHealth(heal);
            if (super.getCurrentHealth() > super.getHP_MAX()) {
            super.setCurrentHealth(super.getHP_MAX());
            }
        } else if (super.getCurrentHealth() <= super.getHP_MIN()) {
            System.out.println("Убитый Паладин не может вылечить себя. Его только на суп Шаману");
        } else {
            System.out.println("Паладин полностью здоров");
        }
    }
    @Override
    public void healTeammate(Hero hero) {
        if (hero.getCurrentHealth() < hero.getHP_MAX() && hero.getCurrentHealth() != 0){
            int heal = hero.getCurrentHealth() + healTeammate;
            hero.setCurrentHealth(heal);
            if (hero.getCurrentHealth() > hero.getHP_MAX()){
                hero.setCurrentHealth(hero.getHP_MAX());
            }
        } else if (hero.getCurrentHealth() <= super.getHP_MIN()) {
            System.out.println("Персонаж убит, его можно только воскресить. А таких героев нет");
        } else if(super.getCurrentHealth() <= super.getHP_MIN()){
            System.out.println("Убитый Паладин не может вылечить персонажа. Его только на суп Шаману");
        } else{
            System.out.println("Персонажу не требуется лечение, здоровье максимальное");
        }
    }
    public String toShowClassInfo(){
        return "Класс Паладин.\nЗдоровье : " + super.getCurrentHealth() + "\nФиз.Атака : " + super.getPhysAtt() +
                "\nФиз.защита : " + super.getPhysDef() + "\nМаг.защита : " + super.getMagicDef() + "\nМожет использовать лечение";
    }
    @Override
    public String toString(){
        return "Здоровье Паладина : " + super.getCurrentHealth();
    }
}
