public class Learner {
    private String name; // поле имени учащегося
    private String surname; // поле фамилии учащегося

    public void setName(String nam) { //открытая функция (метод класса) для редактирования
        name = nam; // имени
    }
    public void setSurname(String surnam) { //открытая функция (метод класса) для редактирования
        surname = surnam; // фамилии
    }

    public String getName() { //открытая функция для вывода значения имени
        return name; 
    }
    public String getSurname() { //открытая функция для вывода значения фамилии
        return surname;
    }
    public Learner() { // Конструктор класса без параметров
        name = "Без имени"; 
        surname = "Без имени";
    }
    public Learner(String nam, String surnam) { // Конструктор класса c параметрами
        name = nam;
        surname = surnam;
    }
}