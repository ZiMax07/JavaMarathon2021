package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayer = 0;

    public Player(int stamina){
        countPlayer++;
        if (countPlayer > 6){
            System.out.println("Нельзя иметь на поле больше 6 игроков");
            countPlayer--;
        }
        this.stamina = stamina;
    }
    public static int getCountPlayer() {
        return countPlayer;
    }
    public int getStamina() {
        return stamina;
    }
    public void run(){
        stamina -= 1;
        if (stamina == MIN_STAMINA){
            System.out.println("Выносливость игрока на нуле, ему необходимо отдохнуть");
            countPlayer--;
        }
    }
    public static void info(){
        if (countPlayer < 6){
            System.out.println("На поле не хватает игроков, есть " + (6 - countPlayer) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест, уже " + countPlayer + " игроков");
        }
    }
    public static int getRandomStamina() {
        int min = 90;
        return (int) (Math.random() * (MAX_STAMINA - min + 1)) + min;
    }
    public  void runRunRun (int number){
        if (number > stamina){
            System.out.println("Игрок не может бежать дальше, ему необходимо отдохнуть. Он не может пробежать еще " + Math.abs(stamina - number) + " раз(а)");
            countPlayer--;
        } else {
        for (int i = 0; i < number; i++){
            run();
        } if (stamina > 0){
            System.out.println("У игрока осталось " + stamina + " выносливости");
        }
        }
    }
}
