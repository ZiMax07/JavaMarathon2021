package day12.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<MusicBand> musicBands = new ArrayList<>();
        Collections.addAll(musicBands,
                new MusicBand("Глюкоза", "Наталья Чистякова", 1995),
                new MusicBand("Фабрика", "Саша Савельева" , 2006),
                new MusicBand("Непара", "Александр Шоуа", 2000));
        List<MusicBand> musicBands2 = new ArrayList<>();
        Collections.addAll(musicBands2, new MusicBand ("Премьер-министр","Марат Чанышев",2001),
                new MusicBand("Тутси", "Мария Вебер",1999));

        MusicBand.printMembers(musicBands);
        MusicBand.printMembers(musicBands2);
        MusicBand.transferMembers(musicBands, musicBands2);
        MusicBand.printMembers(musicBands);
        MusicBand.printMembers(musicBands2);
    }
}
