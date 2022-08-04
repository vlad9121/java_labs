import java.awt.BorderLayout; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.*;
public class Zadanie2 extends JFrame implements ActionListener{ private JMyPanel myPanel=new JMyPanel();

 public static void main(String[] args) {
new Zadanie2("Задание 2");//создаем окно с меню
 }
 public Zadanie2(String name){//конструктор окна с меню, параметр – заголовок окна
super(name); //передаем заголовок окна в конструктор класса-родителя – в JFrame
JMenuBar myMenuBar=new JMenuBar();
JMenuItem surname=new JMenuItem(JMyPanel.Figure.values()[0].toString());
surname.addActionListener(this); 
JMenuItem clear = new JMenuItem(JMyPanel.Figure.values()[1].toString());
clear.addActionListener(this);
myMenuBar.add(surname); //в строку меню добавляем главные пункты меню
myMenuBar.add(clear); //в строку меню добавляем кнопку очистки
setJMenuBar(myMenuBar); //устанавливаем для окна созданное меню
setSize(300, 200);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
add(myPanel, BorderLayout.CENTER);
 }
  public void actionPerformed(ActionEvent e) { //при нажатии на одну из кнопок
myPanel.ris(e.getActionCommand());
} 
} 
  