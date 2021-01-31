package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }
    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }
    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }
    public int getCountPickedOrders() {
        return countPickedOrders;
    }
    public String toString(){
        return "количество собранных заказов : " + countPickedOrders + "\nколичество доставленных заказов : " + countDeliveredOrders;
    }

    public void doWorkCourier() {
        countDeliveredOrders++;
    }
    public void  doWorkPicker() {
        countPickedOrders++;
    }

}
