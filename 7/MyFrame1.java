import java.awt.*;
import java.util.ArrayList; 
import javax.swing.*;
public class MyFrame1 {
public static void
main(String[] args) {
JFrame frame = new JFrame("FrameDemo");// создаем окно с заголовком FrameDemo
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(500,400);//задаем размер окна
 setNorth(frame); //вызываем метод для заполнения верхней области
  setWest(frame); //вызываем метод для заполнения левой области
setEast(frame); //вызываем метод для заполнения правой области
 setCenter(frame); //вызываем метод для заполнения центральной области
  setSouth(frame);//вызываем метод для заполнения нижней области
frame.setVisible(true);//делаем окно видимым
frame.setMinimumSize(frame.getSize());
 }
 public static void setNorth(JFrame fr){ //метод для заполнения верхней области
JPanel myPanel1=new JPanel(new FlowLayout());
JPanel myPanel2 = new JPanel(new FlowLayout());
int N = 6;
JLabel[] labels = new JLabel[N]; // Создаём массив меток
for (int i = 0; i < N; i++) {
  labels[i] = new JLabel("Метка " + Integer.toString(i+1));
  if (i>2) 
  myPanel2.add(labels[i]);
  else
  myPanel1.add(labels[i]);
}
JPanel p = new JPanel(new BorderLayout());
p.add(myPanel1, BorderLayout.WEST);
p.add(myPanel2, BorderLayout.EAST);
fr.add(p,BorderLayout.NORTH);
 }
 public static void setWest(JFrame fr){ //метод для заполнения левой области
 int N = 9;
JButton[] buttons = new JButton[N]; // Создаём массив кнопок
 Box myBox1=new Box(BoxLayout.Y_AXIS);
 for (int i = 0; i < N; i++) {
  buttons[i] = new JButton("Кнопка " + Integer.toString(i+1));
  myBox1.add(Box.createVerticalGlue());
  myBox1.add(buttons[i]);
}
fr.add(myBox1,BorderLayout.WEST);
 }
 public static void setEast(JFrame fr){ //метод для заполнения правой области
ButtonGroup myGroup=new ButtonGroup();
JPanel myPanel2=new JPanel();
ArrayList<JRadioButton> masRB=new ArrayList<JRadioButton>();
myPanel2.setLayout(new GridLayout(9,1));
for (int i=0;i<9;i++){
masRB.add(new JRadioButton("Выбор "+Integer.toString(i+1)));
myGroup.add(masRB.get(i));
myPanel2.add(masRB.get(i));
}
masRB.get(6).setSelected(true);
fr.add(myPanel2,BorderLayout.EAST);
 }
 public static void setCenter(JFrame fr){ //метод для заполнения центральной области 
 Box myBox1=new Box(BoxLayout.Y_AXIS);
 Box myBox2=new Box(BoxLayout.X_AXIS);
 myBox2.add(Box.createHorizontalGlue()); 
 myBox2.add(new JButton("Кнопка"));
 myBox2.add(Box.createHorizontalStrut(70));
 myBox2.add(new JButton("Кнопка"));
 myBox2.add(Box.createHorizontalGlue());
  myBox1.add(new JTextArea("Область текста"));
  myBox1.add(Box.createVerticalStrut(5));
  myBox1.add(myBox2);
  myBox1.add(Box.createVerticalStrut(150));
fr.add(myBox1,BorderLayout.CENTER);
 }
 public static void setSouth(JFrame fr){ //метод для заполнения нижней области 
 JPanel myPanel1=new JPanel(new FlowLayout(FlowLayout.RIGHT));
 JPasswordField password1 = new JPasswordField(10);
 myPanel1.add(new JPasswordField(10));
myPanel1.add(new JButton("Кнопка"));
fr.add(myPanel1,BorderLayout.SOUTH);
 }
} 