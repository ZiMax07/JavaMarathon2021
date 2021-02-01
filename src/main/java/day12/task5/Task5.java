package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args){

        List<MusicArtist> musicArtists = new ArrayList<>();
            musicArtists.add(new MusicArtist("Сати Казанова", 1987));
            musicArtists.add(new MusicArtist("Саша Савельева" , 1988));
            musicArtists.add(new MusicArtist("Ирина Тонева", 1988));

        MusicBand musicBand = new MusicBand("Фабрика", 2003,musicArtists);

        List<MusicArtist> musicArtists2 = new ArrayList<>();
            musicArtists2.add(new MusicArtist("Джон Купер", 1983));
            musicArtists2.add(new MusicArtist("Кори Купер", 1981));
            musicArtists2.add(new MusicArtist("Джен Леджер", 1988));
            musicArtists2.add(new MusicArtist("Сет Моррисон", 1987));

        MusicBand musicBand2 = new MusicBand("Skillet",1996,musicArtists2);

        musicBand.printMember();
        musicBand2.printMember();
        MusicBand.transferMembers(musicBand,musicBand2);
        musicBand.printMember();
        musicBand2.printMember();
    }
}
