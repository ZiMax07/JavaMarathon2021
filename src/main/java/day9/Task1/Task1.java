package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
    Teacher teacher = new Teacher("Андрей Петрович", "ДКБ");
    Student student = new Student("Василий","СБ-210");
    teacher.printInfo();
    student.printInfo();

    }
}
