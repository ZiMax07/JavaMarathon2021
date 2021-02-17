package SeaBattle;

public enum Ship {
    ONE_DECK(4,"⛵️"),
    TWO_DECK(3, "⛵️"),
    THREE_DECK(2, "⛵️"),
    FOUR_DECK(1, "⛵️"),
    SHIP_HIT(0, "\uD83D\uDCA5️"),
    MISS(0, "✖️"),
    FOG_WAR(0, "\uD83D\uDFE5"),
    SHIP_AREA(0,"\uD83D\uDFE6");


    private int numberOfShip;
    private String ship;

    Ship(int numberOfShip, String ship) {
        this.numberOfShip = numberOfShip;
        this.ship = ship;
    }

    public int getNumberOfShip() {
        return numberOfShip;
    }
    public String getShip() {
        return ship;
    }
}
