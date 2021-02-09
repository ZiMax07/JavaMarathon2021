package day11.task2;

public abstract class Hero implements PhysAttack{

    private double physDef;
    private double magicDef;
    private int physAtt;
    private final int HP_MAX = 100;
    private final int HP_MIN = 0;
    private int currentHealth;


    public Hero (){
        this.currentHealth = HP_MAX;
    }
    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }
    public int getPhysAtt() {
        return physAtt;
    }
    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }
    public double getMagicDef() {
        return magicDef;
    }
    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }
    public double getPhysDef() {
        return physDef;
    }
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }
    public int getCurrentHealth() {
        return currentHealth;
    }
    public int getHP_MIN() {
        return HP_MIN;
    }
    public int getHP_MAX() {
        return HP_MAX;
    }
    @Override
    public void physicalAttack(Hero hero) {
        if (hero.getCurrentHealth() > HP_MIN && currentHealth > HP_MIN){
            int attack = (int) (hero.getCurrentHealth() - (physAtt - physAtt * hero.getPhysDef()));
            hero.setCurrentHealth(attack);
            if (hero.getCurrentHealth() <= HP_MIN){
                hero.setCurrentHealth(HP_MIN);
                System.out.println("Персонаж убит");
            }
        } else if (hero.getCurrentHealth() <= HP_MIN){
            System.out.println("Персонаж уже убит. Хотя... Можно пнуть и проверить наверняка");
        } else {
            System.out.println("Персонаж убит. Он не может атаковать");
        }
    }
}
