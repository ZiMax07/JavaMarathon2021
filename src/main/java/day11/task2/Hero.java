package day11.task2;

public abstract class Hero {
    private int health;
    private double physDef;
    private double magicDef;
    private int physAtt;
    private int magicAtt;
    private final int HP_MAX = 100;
    private final int HP_MIN = 0;
    private int currentHealth = HP_MAX;
    private  int healHimself;
    private  int healTeammate;

    public Hero (){
        this.health = HP_MAX;
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
    public int getHealth() {
        return health;
    }
    public void setMagicAtt(int magicAtt) {
        this.magicAtt = magicAtt;
    }
    public int getMagicAtt() {
        return magicAtt;
    }
    public void setHealHimself(int healHimself) {
        this.healHimself = healHimself;
    }
    public int getHealHimself() {
        return healHimself;
    }
    public void setHealTeammate(int healTeammate) {
        this.healTeammate = healTeammate;
    }
    public int getHealTeammate() {
        return healTeammate;
    }
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }
    public int getCurrentHealth() {
        return currentHealth;
    }


}
