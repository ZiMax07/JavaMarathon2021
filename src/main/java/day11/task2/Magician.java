package day11.task2;

public class Magician extends Hero implements MagicAttack{

    private int magicAtt;

    public  Magician() {
        magicAtt = 20;
        super.setPhysAtt(5);
        super.setPhysDef(0.0);
        super.setMagicDef(0.8);
    }
    @Override
    public void magicalAttack(Hero hero) {
        if (hero.getCurrentHealth() > super.getHP_MIN() && super.getCurrentHealth() > super.getHP_MIN()){
            int attack = (int) (hero.getCurrentHealth() - (magicAtt - magicAtt * hero.getMagicDef()));
            hero.setCurrentHealth(attack);
            if (hero.getCurrentHealth() <= super.getHP_MIN()){
                hero.setCurrentHealth(super.getHP_MIN());
                System.out.println("Персонаж убит");
            }
        } else if (hero.getCurrentHealth() <= super.getHP_MIN()){
            System.out.println("Персонаж уже убит. С другой стороны, еще один фаерболл не бывает лишним");
        } else {
            System.out.println("Маг убит. Он не может атаковать");
        }
    }
    public String toShowClassInfo(){
        return "Класс Маг.\nЗдоровье : " + super.getCurrentHealth() + "\nФиз.Атака : " + super.getPhysAtt() +
                "\nМаг.Атака : " + magicAtt + "\nФиз.защита : " + super.getPhysDef() + "\nМаг.защита : " + super.getMagicDef();
    }
    @Override
    public String toString(){
        return "Здоровье Мага : " + super.getCurrentHealth();
    }
}
