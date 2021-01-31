package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(80, warehouse);
        Courier courier = new Courier(100, warehouse);

        businessProcess(picker);
        businessProcess(courier);
        System.out.println(warehouse.toString());
        System.out.println(picker.toString());
        System.out.println(courier.toString());

        System.out.println("--------");

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(80,warehouse2);
        Courier courier2 = new Courier(100, warehouse2);

        picker2.doWork();
        courier2.doWork();
        courier2.doWork();
        System.out.println(warehouse.toString());
        System.out.println(picker.toString());
        System.out.println(courier.toString());
        System.out.println(picker2.toString());
        System.out.println(courier2.toString());

    }
    static void businessProcess(Worker worker){
        for(int i = 0; i < 10000; i++){
            worker.doWork();
        }
        worker.bonus();
    }
}