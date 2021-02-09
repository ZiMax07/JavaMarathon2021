package day11.task2;

public class Warrior extends Hero{

    public  Warrior(){
        super.setPhysAtt(30);
        super.setPhysDef(0.8);
        super.setMagicDef(0.0);
    }
    public String toShowClassInfo(){
        return "Класс Воин.\nЗдоровье : " + super.getCurrentHealth() + "\nФиз.Атака : " + super.getPhysAtt() +
                "\nФиз.защита : " + super.getPhysDef() + "\nМаг.защита : " + super.getMagicDef();
    }
    @Override
    public String toString(){
        return "Здоровье Воина : " + super.getCurrentHealth();
    }
}
