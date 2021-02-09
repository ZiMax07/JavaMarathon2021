package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed = false;
    private int salaryToPay = 0;
    private int bonus;
    private  Warehouse warehouse;

    public Picker(int salary, Warehouse warehouse){
        this.salary = salary;
        this.warehouse = warehouse;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    public void setPayed(boolean payed) {
        this.isPayed = payed;
    }
    public boolean getIsPayed() {
        return isPayed;
    }
    public String toString(){
        if (isPayed){
            return "Заработная плата : " + salaryToPay + " бонус был выплачен";
        } else {
            return "Заработная плата : " + salaryToPay + " бонус не выплачен";
        }
    }
    @Override
    public void doWork() {
        salaryToPay += salary;
        warehouse.doWorkPicker();
    }
    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() == 10000 && bonus == 0){
            salaryToPay += 70000;
            isPayed = true;
            bonus = 1;
        } else if (bonus < 1){
            System.out.println("Бонус пока не доступен");
        }else if (bonus == 1) {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
