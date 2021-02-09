package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer{

    private int magicAtt;
    private int healHimself;
    private int healTeammate;

    public  Shaman() {
        magicAtt = 15;
        healHimself = 50;
        healTeammate = 30;
        super.setPhysAtt(10);
        super.setPhysDef(0.2);
        super.setMagicDef(0.2);
    }
    @Override
    public void healHimself() {
        if (super.getCurrentHealth() < super.getHP_MAX() && super.getCurrentHealth() != 0){
            int heal = super.getCurrentHealth() + healHimself;
            super.setCurrentHealth(heal);
            if (super.getCurrentHealth() > super.getHP_MAX()){
                super.setCurrentHealth(super.getHP_MAX());
            }
        } else if (super.getCurrentHealth() <= 0) {
            System.out.println("Убитый Шаман не может вылечить себя. И такой суп пропадает...");
        } else {
            System.out.println("Шаман полностью здоров");
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
            System.out.println("Убитый Шаман не может вылечить персонажа. И такой суп пропадает...");
        } else{
            System.out.println("Персонажу не требуется лечение, здоровье максимальное");
        }
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
            System.out.println("Персонаж уже убит. Теперь сгодится только на суп");
        } else {
            System.out.println("Шаман убит. Он не может атаковать");
        }
    }
    public String toShowClassInfo(){
        return "Класс Шаман.\nЗдоровье : " + super.getCurrentHealth()+ "\nФиз.Атака : " + super.getPhysAtt() +
                "\nМаг.Атака : " + magicAtt + "\nФиз.защита : " + super.getPhysDef() + "\nМаг.защита : " + super.getMagicDef() + "\nМожет использовать лечение";
    }
    @Override
    public String toString(){
        return "Здоровье Шамана : " + super.getCurrentHealth();
    }
}
