package day12.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private String memberOfGroup;

    public MusicBand(String name, String memberOfGroup, int year){
        this.name = name;
        this.year = year;
        this.memberOfGroup = memberOfGroup;
    }
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
    public String getMemberOfGroup() {
        return memberOfGroup;
    }

    public static void transferMembers(List<MusicBand> firstBand, List<MusicBand> secondBand){
            secondBand.addAll(firstBand);
            firstBand.clear();
    }
    public static void printMembers(List<MusicBand> membersOfBand){
        System.out.println(getMembers(membersOfBand));
        }
    public static List<String> getMembers(List<MusicBand> membersOfBand){
        List<String> members = new ArrayList<>();
        for (MusicBand band : membersOfBand){
            members.add(band.getMemberOfGroup());
        }
        return members;
    }
}

