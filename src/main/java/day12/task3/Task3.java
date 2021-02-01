package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> musicBands = new ArrayList<>();
        Collections.addAll(musicBands, new MusicBand("Глюкоза", 1995),
                new MusicBand("Фабрика", 2006),
                new MusicBand("Непара", 2000),
                new MusicBand("Премьер-министр", 2001),
                new MusicBand("Тутси", 1999),
                new MusicBand("Город 312", 1997),
                new MusicBand("А-студио", 2002),
                new MusicBand("Иванушки", 1994),
                new MusicBand("Руки Вверх", 1995),
                new MusicBand("Время и Стекло", 2010));
        Collections.shuffle(musicBands);
        for (MusicBand band : musicBands){
            System.out.println(band.getName() + " " + band.getYear() + " год");
        }
        System.out.println("------------");
        for (MusicBand band : groupsAfter2000(musicBands)){
            System.out.println(band.getName() + " " + band.getYear() + " год");
        }
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (MusicBand group : bands){
            if (group.getYear() > 2000) {
                groupsAfter2000.add(group);
            }
        }
        return groupsAfter2000;
    }
}
