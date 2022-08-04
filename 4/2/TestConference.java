public class TestConference {
public static void main(String[] args) {
Conference conference1=new Conference(); //создаем новую конференцию
Schoolchild school1=new Schoolchild("Пётр", "Иванов", "МБОУ СШ №9", 1); //создаем одного ученика
conference1.addPerson(school1); // добавляем его на конференцию
conference1.addPerson(new Schoolchild("Арсений", "Чижик", "МБОУ СШ №5", 11));//добавляем еще одного ученика
conference1.addPerson(new Schoolchild("Виктор", "Черёмушкин", "МБОУ СШ №12", 10));//добавляем еще одного ученика
Student student1=new Student("Владислав", "Алоев", "МПУ", "очная", 3);//создаем студента
Student student2=new Student("Феликс", "Беляков", "ВШЭ", "очно-заочная", 4);//создаем грузовик 
conference1.addPerson(student1); // добавляем его на конференцию
conference1.addPerson(student2); 
conference1.printConference(); //выводи на экран содержимое гаража
conference1.countsPeople(); // подсчёт школьников и студентов на конференции
}
} 