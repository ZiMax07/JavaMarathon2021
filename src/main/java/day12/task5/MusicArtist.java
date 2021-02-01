package day12.task5;

public class MusicArtist {
    private String memberOfGroup;
    private int memberAge;

    public MusicArtist(String memberOfGroup, int memberAge){
        this.memberOfGroup = memberOfGroup;
        this.memberAge = memberAge;
    }

    public int getMemberAge() {
        return memberAge;
    }
    public void setMemberAge(int memberAge) {
        this.memberAge = memberAge;
    }
    public String getMemberOfGroup() {
        return memberOfGroup;
    }
    public void setMemberOfGroup(String memberOfGroup) {
        this.memberOfGroup = memberOfGroup;
    }

    @Override
    public String toString(){
        return "Имя " + memberOfGroup + ", возраст " + memberAge;
    }
}

