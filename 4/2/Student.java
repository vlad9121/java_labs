public class Student extends Learner {
    private String vuz; // поле названия вуза
    private String format; // поле формата обучения
    private int course; // поле курса
public Student() {
    super(); // вызываем конструктор класса-родителя без параметров;
    vuz = "Неизвестно";
    format = "Неизвестно";
    course = 0;
}
public Student(String nam, String surnam, String univer, String form, int courses) { 
    super(nam, surnam); // вызываем конструктор класса-роителя с параметрами
    vuz = univer; // добавляем инициализацию новых членов
    format = form;
    course = courses;
}
public void setVuz(String univer) { // метод изменения вуза
    vuz = univer;
}
public void setFormat(String form) { // метод изменения формата обучеия
format = form;
}
public void setCourse(int courses) { // метод изменения курса студента
course = courses;
}
public int getCourse() {
    return course;
}
public String toString() { // преобразования информации в строку
   return getName()+" "+ getSurname()+ " "+ course + " курс" + " " + vuz + " " + format + " форма обучения"; 
}
}