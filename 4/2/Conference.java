import java.util.ArrayList;//нужно для работы с классом ArrayList
public class Conference {
private ArrayList<Learner> people=new ArrayList<Learner>();//массив с участниками конференциями
public void addPerson(Learner m){//метод для добавления человека в конференцию
people.add(m);
}
public Conference(){
}
public Boolean findPerson(Learner m){ //для выяснения – есть ли человек на конференции
return people.contains(m);
}
public Conference(ArrayList<Learner> n){//конструктор для внесения существующего списка людей на конференцию
people=n;
} 
public void printConference() { //для вывода на экран участников конференции
System.out.println("Участники конференции: ");
 for (Learner a:people){ //
System.out.println("\t"+ " " + a.toString());
}
}
public void deletePerson(Learner m) { // метод удаления участника конференции
people.remove(m);
}
public void countsPeople() { // Метод подсчёта студентов и школьников
int count1 = 0, count2 = 0;
for (Learner a:people) {
    if (a instanceof Schoolchild) count1++;
    if (a instanceof Student) count2++;
}
System.out.println("На конференции присутствуют " + count1 + " школьника и " + count2 + " студента");
}
} 