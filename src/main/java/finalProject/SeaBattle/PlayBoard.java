package finalProject.SeaBattle;

import java.util.Scanner;

public class PlayBoard implements GameInterface{

    String[][] board;
    String[][] gameBoard = new String[11][11];
    String[][] shootBoard = new String[11][11];
    Scanner scanner = new Scanner(System.in);
    String name;
    String coordinate;
    int x,x1,x2,x3,x4;
    int y,y1,y2,y3,y4;
    String[] numbers = new String[]{"#️⃣","1️⃣","2️⃣","3️⃣","4️⃣","5️⃣","6️⃣","7️⃣","8️⃣","9️⃣","0️⃣","\uD83D\uDFE6"};
    int valueOfShips = Ship.ONE_DECK.getNumberOfShip() + Ship.TWO_DECK.getNumberOfShip()
            + Ship.THREE_DECK.getNumberOfShip() + Ship.FOUR_DECK.getNumberOfShip();

    public PlayBoard(String name) {

        this.name = name;
        board = new String[12][12];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = Ship.FOG_WAR.getShip();
                board[i][0] = numbers[i];
            }
            board[0][i] = numbers[i];
        }
    }

    public String getName() {
        return name;
    }

    public int getValueOfShips() {
        return valueOfShips;
    }

    @Override
    public void game() {
        setShip1();
        gameBoard();
        shootBoard();
        printBoard();
        setShip2();
        setShip3();
        setShip4();
    }

    int count4 = Ship.FOUR_DECK.getNumberOfShip();
    @Override
    public void setShip4(){
        if (count4 == 0) {
            return;
        } else {
            try {
                System.out.println("Необходимо расположить " + count4 + " четырехпалубный корабль, в формате \"x1.y1;x2.y2;x3.y3;x4.y4\"");
                coordinate = scanner.nextLine();
                String[] str = coordinate.split("\\W");
                x1 = Integer.parseInt(str[0]);
                y1 = Integer.parseInt(str[1]);
                x2 = Integer.parseInt(str[2]);
                y2 = Integer.parseInt(str[3]);
                x3 = Integer.parseInt(str[4]);
                y3 = Integer.parseInt(str[5]);
                x4 = Integer.parseInt(str[6]);
                y4 = Integer.parseInt(str[7]);
                if (x1 > 0 && y1 > 0 && x2 > 0 && y2 > 0 && x3 > 0 && y3 > 0 && x4 > 0 && y4 > 0 && count4 != 0) {
                if (x2 == x1 && y2 == y1 - 1 && x3 == x1 && y3 == y1 - 2 && x4 == x1 && y4 == y1 - 3 ||
                        x2 == x1 && y2 == y1 + 1 && x3 == x1 && y3 == y1 + 2 && x4 == x1 && y4 == y1 + 3 ||
                        x2 == x1 - 1 && y2 == y1 && x3 == x1 - 2 && y3 == y1 && x4 == x1 - 3 && y4 == y1 ||
                        x2 == x1 + 1 && y2 == y1 && x3 == x1 + 2 && y3 == y1 && x4 == x1 + 3 && y4 == y1){
                    if (!board[x1][y1].equals(Ship.FOG_WAR.getShip()) || !board[x2][y2].equals(Ship.FOG_WAR.getShip())
                            || !board[x3][y3].equals(Ship.FOG_WAR.getShip()) || !board[x4][y4].equals(Ship.FOG_WAR.getShip())) {
                        System.out.println("Клетка занята кораблем или его ареалом");
                        setShip4();
                    } else {
                        for (int i = 0; i <= 1; i++) {
                            for (int j = 0; j <= 1; j++) {
                                board[x1 + i][y1 + j] = Ship.SHIP_AREA.getShip();
                                board[x1 - i][y1 - j] = Ship.SHIP_AREA.getShip();
                                board[x1 + i][y1 - j] = Ship.SHIP_AREA.getShip();
                                board[x1 - i][y1 + j] = Ship.SHIP_AREA.getShip();
                                board[x2 + i][y2 + j] = Ship.SHIP_AREA.getShip();
                                board[x2 - i][y2 - j] = Ship.SHIP_AREA.getShip();
                                board[x2 + i][y2 - j] = Ship.SHIP_AREA.getShip();
                                board[x2 - i][y2 + j] = Ship.SHIP_AREA.getShip();
                                board[x3 + i][y3 + j] = Ship.SHIP_AREA.getShip();
                                board[x3 - i][y3 - j] = Ship.SHIP_AREA.getShip();
                                board[x3 + i][y3 - j] = Ship.SHIP_AREA.getShip();
                                board[x3 - i][y3 + j] = Ship.SHIP_AREA.getShip();
                                board[x4 + i][y4 + j] = Ship.SHIP_AREA.getShip();
                                board[x4 - i][y4 - j] = Ship.SHIP_AREA.getShip();
                                board[x4 + i][y4 - j] = Ship.SHIP_AREA.getShip();
                                board[x4 - i][y4 + j] = Ship.SHIP_AREA.getShip();
                            }
                        }
                        board[x1][y1] = Ship.FOUR_DECK.getShip();
                        board[x2][y2] = Ship.FOUR_DECK.getShip();
                        board[x3][y3] = Ship.FOUR_DECK.getShip();
                        board[x4][y4] = Ship.FOUR_DECK.getShip();
                        count4--;
                        gameBoard();
                        printBoard();
                    }
                } else {
                    System.out.println("Корабль должен располагаться прямой непрерывной линией по вертикале или горизонтале");
                }
                } else {
                    System.out.println("Можно вводить только цифры от 1 до 10 в формате \"x1.y1;x2.y2;x3.y3;x4.y4\"");
                }
                setShip4();
            }catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                System.out.println("Можно вводить только цифры от 1 до 10 в формате \"x1.y1;x2.y2;x3.y3;x4.y4\"");
                setShip4();
            }
        }
    }
    int count3 = Ship.THREE_DECK.getNumberOfShip();
    @Override
    public void setShip3() {
        if (count3 == 0) {
            return;
        } else {
            try {
                System.out.println("Необходимо расположить " + count3 + " трехпалубных корабля, в формате \"x1.y1;x2.y2;x3.y3\"");
                coordinate = scanner.nextLine();
                String[] str = coordinate.split("\\W");
                x1 = Integer.parseInt(str[0]);
                y1 = Integer.parseInt(str[1]);
                x2 = Integer.parseInt(str[2]);
                y2 = Integer.parseInt(str[3]);
                x3 = Integer.parseInt(str[4]);
                y3 = Integer.parseInt(str[5]);
                if (x1 > 0 && y1 > 0 && x2 > 0 && y2 > 0 && x3 > 0 && y3 > 0 && count3 != 0) {
                if (x2 == x1 && y2 == y1 - 1 && x3 == x1 && y3 == y1 - 2 || x2 == x1 -1 && y2 == y1 && x3 == x1 - 2 && y3 == y1
                    || x2 == x1 && y2 == y1 + 1 && x3 == x1 && y3 == y1 + 2 || x2 == x1 + 1 && y2 == y1 && x3 == x1 + 2 && y3 == y1) {
                    if (!board[x1][y1].equals(Ship.FOG_WAR.getShip()) || !board[x2][y2].equals(Ship.FOG_WAR.getShip()) || !board[x3][y3].equals(Ship.FOG_WAR.getShip())) {
                        System.out.println("Клетка занята кораблем или его ареалом");
                        setShip3();
                    } else {
                        for (int i = 0; i <= 1; i++) {
                            for (int j = 0; j <= 1; j++) {
                                board[x1 + i][y1 + j] = Ship.SHIP_AREA.getShip();
                                board[x1 - i][y1 - j] = Ship.SHIP_AREA.getShip();
                                board[x1 + i][y1 - j] = Ship.SHIP_AREA.getShip();
                                board[x1 - i][y1 + j] = Ship.SHIP_AREA.getShip();
                                board[x2 + i][y2 + j] = Ship.SHIP_AREA.getShip();
                                board[x2 - i][y2 - j] = Ship.SHIP_AREA.getShip();
                                board[x2 + i][y2 - j] = Ship.SHIP_AREA.getShip();
                                board[x2 - i][y2 + j] = Ship.SHIP_AREA.getShip();
                                board[x3 + i][y3 + j] = Ship.SHIP_AREA.getShip();
                                board[x3 - i][y3 - j] = Ship.SHIP_AREA.getShip();
                                board[x3 + i][y3 - j] = Ship.SHIP_AREA.getShip();
                                board[x3 - i][y3 + j] = Ship.SHIP_AREA.getShip();
                            }
                        }
                        board[x1][y1] = Ship.THREE_DECK.getShip();
                        board[x2][y2] = Ship.THREE_DECK.getShip();
                        board[x3][y3] = Ship.THREE_DECK.getShip();
                        count3--;
                        gameBoard();
                        printBoard();
                    }
                } else {
                    System.out.println("Корабль должен располагаться прямой непрерывной линией по вертикале или горизонтале");
                }
                } else {
                    System.out.println("Можно вводить только цифры от 1 до 10 в формате \"x1.y1;x2.y2;x3.y3\"");
                }
                setShip3();
            }catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                System.out.println("Можно вводить только цифры от 1 до 10 в формате \"x1.y1;x2.y2;x3.y3\"");
                setShip3();
            }
        }
    }
    int count2 = Ship.TWO_DECK.getNumberOfShip();
    @Override
    public void setShip2() {
        if (count2 == 0) {
            return;
        } else {
            try {
                System.out.println("Необходимо расположить " + count2 + " двухпалубных корабля, в формате \"x1.y1;x2.y2\"");
                coordinate = scanner.nextLine();
                String[] str = coordinate.split("\\W");
                x1 = Integer.parseInt(str[0]);
                y1 = Integer.parseInt(str[1]);
                x2 = Integer.parseInt(str[2]);
                y2 = Integer.parseInt(str[3]);
                if (x1 > 0 && y1 > 0 && x2 > 0 && y2 > 0 && count2 != 0) {
                if (x2 == x1 + 1 && y2 == y1 || x2 == x1 && y2 == y1 + 1 || x2 == x1 - 1 && y2 == y1 || x2 == x1 && y2 == y1 - 1) {
                    if (!board[x1][y1].equals(Ship.FOG_WAR.getShip()) || !board[x2][y2].equals(Ship.FOG_WAR.getShip())) {
                        System.out.println("Клетка занята кораблем или его ареалом");
                        setShip2();
                    } else {
                        for (int i = 0; i <= 1; i++) {
                            for (int j = 0; j <= 1; j++) {
                                    board[x1 + i][y1 + j] = Ship.SHIP_AREA.getShip();
                                    board[x1 - i][y1 - j] = Ship.SHIP_AREA.getShip();
                                    board[x1 + i][y1 - j] = Ship.SHIP_AREA.getShip();
                                    board[x1 - i][y1 + j] = Ship.SHIP_AREA.getShip();
                                    board[x2 + i][y2 + j] = Ship.SHIP_AREA.getShip();
                                    board[x2 - i][y2 - j] = Ship.SHIP_AREA.getShip();
                                    board[x2 + i][y2 - j] = Ship.SHIP_AREA.getShip();
                                    board[x2 - i][y2 + j] = Ship.SHIP_AREA.getShip();
                            }
                        }
                        board[x1][y1] = Ship.TWO_DECK.getShip();
                        board[x2][y2] = Ship.TWO_DECK.getShip();
                        count2--;
                        gameBoard();
                        printBoard();
                }
                } else {
                    System.out.println("Корабль должен располагаться прямой линией по вертикале или горизонтале");
                }
                } else {
                    System.out.println("Можно вводить только цифры от 1 до 10 в формате \"x1.y1;x2.y2\"");
                }
                setShip2();
            }catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                System.out.println("Можно вводить только цифры от 1 до 10 в формате \"x1.y1;x2.y2\"");
                setShip2();
            }
        }
    }
    int count1 = Ship.ONE_DECK.getNumberOfShip();
    @Override
    public void setShip1() {
        if (count1 == 0) {
            return;
        } else {
            try {
                System.out.println("Ходит игрок " + this.name + "\nНеобходимо расположить " + count1 + " однопалубных корабля, в формате \"x.y\"");
                coordinate = scanner.nextLine();
                String[] str = coordinate.split("\\W");
                x1 = Integer.parseInt(str[0]);
                y1 = Integer.parseInt(str[1]);
                if (x1 > 0 && y1 > 0 && count1 != 0) {
                    if (!board[x1][y1].equals(Ship.FOG_WAR.getShip())) {
                        System.out.println("Клетка занята кораблем или его ареалом");
                    } else {
                        for (int i = 0; i <= 1; i++) {
                            for (int j = 0; j <= 1; j++) {
                                board[x1 + i][y1 + j] = Ship.SHIP_AREA.getShip();
                                board[x1 - i][y1 - j] = Ship.SHIP_AREA.getShip();
                                board[x1 + i][y1 - j] = Ship.SHIP_AREA.getShip();
                                board[x1 - i][y1 + j] = Ship.SHIP_AREA.getShip();
                            }
                        }
                        board[x1][y1] = Ship.ONE_DECK.getShip();
                        count1--;
                        gameBoard();
                        printBoard();
                    }
                } else {
                    System.out.println("\"Можно вводить только цифры от 1 до 10 в формате \"x.y\"");
                }
                setShip1();
            }catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                System.out.println("Можно вводить только цифры от 1 до 10 в формате \"x.y\"");
                setShip1();
            }
        }
    }

    @Override
    public void gameBoard(){
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                gameBoard[i][j] = board[i][j];
                gameBoard[i][0] = numbers[i];
            }
            gameBoard[0][i] = numbers[i];
        }
    }
    @Override
    public void shootBoard(){
        for (int i = 0; i < shootBoard.length; i++) {
            for (int j = 0; j < shootBoard[i].length; j++) {
                shootBoard[i][j] = Ship.FOG_WAR.getShip();
                shootBoard[i][0] = numbers[i];
            }
            shootBoard[0][i] = numbers[i];
        }
    }
    @Override
    public void printBoard () {
        //System.out.println("Ходит игрок " + this.name);
        for (String[] strings : gameBoard) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }
    @Override
    public void printShootBoard(){
        for (int i = 0; i < shootBoard.length; i++) {
            for (int j = 0; j < shootBoard[i].length; j++) {
                System.out.print(shootBoard[i][j]);
            }
            System.out.println();
        }
    }

    @Override
    public void shoot (PlayBoard playBoard){
        try {
            if (playBoard.valueOfShips == 0){
                System.out.println("Игра окончена. Победил игрок " + this.name);
                this.printShootBoard();
                return;
            } else {
            System.out.println("Ходит игрок " + this.name);
                System.out.println("3...");
                Thread.sleep(1300);
                System.out.println("2..");
                Thread.sleep(1300);
                System.out.println("1.");
            System.out.println("Необходимо ввести координаты выстрела, в формате \"x.y\"");
            this.printBoard();
            this.printShootBoard();
            coordinate = scanner.nextLine();
            String[] str = coordinate.split("\\W");
            x = Integer.parseInt(str[0]);
            y = Integer.parseInt(str[1]);
            if (x > 0 && x <= 10 && y > 0 && y <= 10) {
                if (playBoard.gameBoard[x][y].equals(Ship.ONE_DECK.getShip())) {
                    System.out.println("Вы попали во вражеский корабль. Можете произвести еще 1 выстрел");
                    System.out.println("Однопалубный корабль уничтожен");
                        playBoard.gameBoard[x][y] = Ship.SHIP_HIT.getShip();
                        this.shootBoard[x][y] = Ship.SHIP_HIT.getShip();
                        playBoard.valueOfShips--;
                        shoot(playBoard);
                } else if (playBoard.gameBoard[x][y].equals(Ship.TWO_DECK.getShip())){
                    playBoard.gameBoard[x][y] = Ship.SHIP_HIT.getShip();
                    this.shootBoard[x][y] = Ship.SHIP_HIT.getShip();
                        System.out.println("Вы попали во вражеский корабль. Можете произвести еще 1 выстрел");
                    if (playBoard.gameBoard[x][y - 1].equals(Ship.SHIP_HIT.getShip()) || playBoard.gameBoard[x - 1][y].equals(Ship.SHIP_HIT.getShip())
                        || playBoard.gameBoard[x][y + 1].equals(Ship.SHIP_HIT.getShip()) || playBoard.gameBoard[x + 1][y].equals(Ship.SHIP_HIT.getShip())){
                        System.out.println("Двухпалубный корабль уничтожен");
                        playBoard.valueOfShips--;
                    }
                    shoot(playBoard);
                } else if (playBoard.gameBoard[x][y].equals(Ship.THREE_DECK.getShip())){
                    playBoard.gameBoard[x][y] = Ship.SHIP_HIT.getShip();
                    this.shootBoard[x][y] = Ship.SHIP_HIT.getShip();
                    System.out.println("Вы попали во вражеский корабль. Можете произвести еще 1 выстрел");
                    if (
                                playBoard.gameBoard[x - 1][y].equals(Ship.SHIP_HIT.getShip()) && playBoard.gameBoard[x + 1][y].equals(Ship.SHIP_HIT.getShip())
                            ||  playBoard.gameBoard[x - 1][y].equals(Ship.SHIP_HIT.getShip()) && playBoard.gameBoard[x - 2][y].equals(Ship.SHIP_HIT.getShip())
                            ||  playBoard.gameBoard[x + 1][y].equals(Ship.SHIP_HIT.getShip()) && playBoard.gameBoard[x + 2][y].equals(Ship.SHIP_HIT.getShip())
                            ||  playBoard.gameBoard[x][y - 1].equals(Ship.SHIP_HIT.getShip()) && playBoard.gameBoard[x][y - 2].equals(Ship.SHIP_HIT.getShip())
                            ||  playBoard.gameBoard[x][y + 1].equals(Ship.SHIP_HIT.getShip()) && playBoard.gameBoard[x][y + 2].equals(Ship.SHIP_HIT.getShip())
                            ||  playBoard.gameBoard[x][y + 1].equals(Ship.SHIP_HIT.getShip()) && playBoard.gameBoard[x][y - 1].equals(Ship.SHIP_HIT.getShip())){
                        System.out.println("Трехпалубный корабль уничтожен");
                        playBoard.valueOfShips--;
                    }
                    shoot(playBoard);
                } else if(playBoard.gameBoard[x][y].equals(Ship.FOUR_DECK.getShip())){
                    playBoard.gameBoard[x][y] = Ship.SHIP_HIT.getShip();
                    this.shootBoard[x][y] = Ship.SHIP_HIT.getShip();
                        System.out.println("Вы попали во вражеский корабль. Можете произвести еще 1 выстрел");
                    if (
                               playBoard.gameBoard[x][y].equals(Ship.SHIP_HIT.getShip()) && playBoard.gameBoard[x + 1][y].equals(Ship.SHIP_HIT.getShip()) && playBoard.gameBoard[x + 2][y].equals(Ship.SHIP_HIT.getShip())
                            && playBoard.gameBoard[x + 3][y].equals(Ship.SHIP_HIT.getShip())
                            || playBoard.gameBoard[x][y].equals(Ship.SHIP_HIT.getShip()) && playBoard.gameBoard[x][y + 1].equals(Ship.SHIP_HIT.getShip()) && playBoard.gameBoard[x][y + 2].equals(Ship.SHIP_HIT.getShip())
                            && playBoard.gameBoard[x][y + 3].equals(Ship.SHIP_HIT.getShip())
                            || playBoard.gameBoard[x][y].equals(Ship.SHIP_HIT.getShip()) && playBoard.gameBoard[x + 1][y].equals(Ship.SHIP_HIT.getShip()) && playBoard.gameBoard[x - 1][y].equals(Ship.SHIP_HIT.getShip())
                            && playBoard.gameBoard[x - 2][y].equals(Ship.SHIP_HIT.getShip())
                            || playBoard.gameBoard[x][y].equals(Ship.SHIP_HIT.getShip()) && playBoard.gameBoard[x - 1][y].equals(Ship.SHIP_HIT.getShip()) && playBoard.gameBoard[x + 1][y].equals(Ship.SHIP_HIT.getShip())
                            && playBoard.gameBoard[x + 2][y].equals(Ship.SHIP_HIT.getShip())
                            || playBoard.gameBoard[x][y].equals(Ship.SHIP_HIT.getShip()) && playBoard.gameBoard[x][y - 1].equals(Ship.SHIP_HIT.getShip()) && playBoard.gameBoard[x][y - 2].equals(Ship.SHIP_HIT.getShip())
                            && playBoard.gameBoard[x][y - 3].equals(Ship.SHIP_HIT.getShip())
                            || playBoard.gameBoard[x][y].equals(Ship.SHIP_HIT.getShip()) && playBoard.gameBoard[x][y + 1].equals(Ship.SHIP_HIT.getShip()) && playBoard.gameBoard[x][y - 1].equals(Ship.SHIP_HIT.getShip())
                            && playBoard.gameBoard[x][y - 2].equals(Ship.SHIP_HIT.getShip())
                            || playBoard.gameBoard[x][y].equals(Ship.SHIP_HIT.getShip()) && playBoard.gameBoard[x][y - 1].equals(Ship.SHIP_HIT.getShip()) && playBoard.gameBoard[x][y + 1].equals(Ship.SHIP_HIT.getShip())
                            && playBoard.gameBoard[x][y + 2].equals(Ship.SHIP_HIT.getShip())
                            || playBoard.gameBoard[x][y].equals(Ship.SHIP_HIT.getShip()) && playBoard.gameBoard[x - 3][y].equals(Ship.SHIP_HIT.getShip()) && playBoard.gameBoard[x - 2][y].equals(Ship.SHIP_HIT.getShip())
                            && playBoard.gameBoard[x - 1][y].equals(Ship.SHIP_HIT.getShip())){
                        System.out.println("Четырехпалубный корабль уничтожен");
                        playBoard.valueOfShips--;
                    }
                    shoot(playBoard);
                } else {
                    if (playBoard.gameBoard[x][y].equals(Ship.SHIP_HIT.getShip()) || playBoard.gameBoard[x][y].equals(Ship.MISS.getShip())){
                        System.out.println("Вы уже стреляли в эту область. Введите другие координаты");
                        shoot(playBoard);
                    } else {
                    playBoard.gameBoard[x][y] = Ship.MISS.getShip();
                    this.shootBoard[x][y] = Ship.MISS.getShip();
                    System.out.println("Мимо");
                    }
                }
            } else {
                System.out.println("Необходимо производить выстрел в пределах игрового поля (10х10)");
                shoot(playBoard);
            }
            }
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException | InterruptedException e) {
            System.out.println("Для выстрела можно вводить только цифры от 1 до 10 в формате \"x.y\"");
            shoot(playBoard);
        }
    }
}