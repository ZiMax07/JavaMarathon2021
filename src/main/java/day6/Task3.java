package day6;

public class Task3 {
    public static void main(String[] args) {
    Teacher teacher = new Teacher("Ловчиков Валерий Петрович", "Коммерческие банки");
    Student student = new Student("Солдатов Александр Олегович");
        teacher.evaluate(student.getName());
    }
}
