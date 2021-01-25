package day6;

public class Teacher {
    private String name;
    private String discipline;

    public Teacher(String name, String discipline){
        this.name = name;
        this.discipline = discipline;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDiscipline() {
        return discipline;
    }
    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }
    public int getRandomInRange(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;
    }
    public void evaluate(String student){
        int markNumber = getRandomInRange(2,5);
        String markText = "";
        switch (markNumber){
            case 2 -> markText = "неудовлетворительно";
            case 3 -> markText = "удовлетворительно";
            case 4 -> markText = "хорошо";
            case 5 -> markText = "отлично";
        }
        System.out.println("Преподаватель " + this.name + " оценил студента " + student + " по предмету " + discipline + " на оценку " + markText);
    }

}
