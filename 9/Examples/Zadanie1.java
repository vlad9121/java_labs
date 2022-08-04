import java.awt.BorderLayout; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.*;
public class Zadanie1 extends JFrame implements ActionListener{ private JMyPanel myPanel=new JMyPanel();

 public static void main(String[] args) {
new Zadanie1("Задание 1");//создаем окно с меню
 }
 public Zadanie1(String name){//конструктор окна с меню, параметр – заголовок окна
super(name); //передаем заголовок окна в конструктор класса-родителя – в JFrame
JMenuBar myMenuBar=new JMenuBar();
JMenu menu1=new JMenu("Figure");//создаем меню рисования фигур
JMenuItem[] figures=new JMenuItem[4];// создаем массив фигур
for (int i=0;i<4;i++){ 
figures[i]=new JMenuItem(JMyPanel.Figure.values()[i].toString());
 menu1.add(figures[i]);
 figures[i].addActionListener(this);
} 
JMenuItem clear = new JMenuItem(JMyPanel.Figure.values()[4].toString());
clear.addActionListener(this);
myMenuBar.add(menu1); //в строку меню добавляем главные пункты меню
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
  