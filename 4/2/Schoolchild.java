public class Schoolchild extends Learner {
    private String school;
    private int klass;
public Schoolchild() {
    super(); // вызываем конструктор класса-родителя без параметров;
    school = "Неизвестно";
    klass = 0;
}
public Schoolchild(String nam, String surnam, String schooll, int clas) { 
    super(nam, surnam); // вызываем конструктор класса-роителя с параметрами
    school = schooll; // добавляем инициализацию новых членов
    klass = clas;
}
public void setSchool(String schooll) { // метод изменения школы
    school = schooll;
}
public void setKlass(int clas) { // метод изменения класса ученика
klass = clas;
}
public int getKlass() {
    return klass;
}
public String toString() { // преобразования информации в строку
   return getName()+" "+ getSurname()+ " "+ klass + " класс" + " " + school; 
}
}