package day12.task5;

import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    List<MusicArtist> musicArtist;

    public MusicBand(String name, int year, List<MusicArtist> musicArtist ){
        this.name = name;
        this.year = year;
        this.musicArtist = musicArtist;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public List<MusicArtist> getMusicArtist() {
        return musicArtist;
    }
    public void setMusicArtist(List<MusicArtist> musicArtist) {
        this.musicArtist = musicArtist;
    }

    public static void transferMembers(MusicBand firstBand, MusicBand secondBand){
        for(MusicArtist member : firstBand.getMusicArtist())
            secondBand.getMusicArtist().add(member);
        firstBand.getMusicArtist().clear();
    }

    public void printMember(){
        System.out.println(this.musicArtist);
    }
}

