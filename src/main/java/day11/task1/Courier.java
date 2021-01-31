package day11.task1;

public class Courier implements Worker{
    private int salary;
    private boolean isPayed;
    private int salaryToPay;
    private int bonus;
    private  Warehouse warehouse = new Warehouse();

    public Courier(int salary, Warehouse warehouse){
        this.salary = salary;
        this.warehouse =warehouse;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    public void setIsPayed(boolean isPayed) {
        this.isPayed = isPayed;
    }
    public boolean getIsPayed() {
        return isPayed;
    }
    public String toString(){
        if (isPayed == true){
            return "Заработная плата : " + salaryToPay + " бонус был выплачен";
        } else {
            return "Заработная плата : " + salaryToPay + " бонус не выплачен";
        }
    }
    @Override
    public void doWork() {
        salaryToPay += salary;
        warehouse.doWorkCourier();
    }
    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() == 10000 && bonus == 0){
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
