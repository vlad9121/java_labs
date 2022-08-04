import java.awt.*;
import java.util.ArrayList; 
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyFrame1 {
public static JLabel myLabel; 
public static JTextArea PerenosArea, MyTextArea;
public static void
main(String[] args) {
JFrame fr = new JFrame("FrameDemo");// создаем окно с заголовком FrameDemo
fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
myLabel=new JLabel(" ");
PerenosArea=new JTextArea(" ");
fr.setSize(500,400);//задаем размер окна
fr.setVisible(true);//делаем окно видимым
fr.setMinimumSize(fr.getSize());
JPanel myPanel1=new JPanel(new FlowLayout());
JPanel myPanel2 = new JPanel(new FlowLayout());
int N1 = 6;
JLabel[] labels = new JLabel[N1]; // Создаём массив меток
for (int i = 0; i < N1; i++) {
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
 
 int N2 = 9;
JButton[] buttons = new JButton[N2]; // Создаём массив кнопок
 Box myBox1=new Box(BoxLayout.Y_AXIS);
 for (int i = 0; i < N2; i++) {
  buttons[i] = new JButton("Кнопка " + Integer.toString(i+1));
  myBox1.add(Box.createVerticalGlue());
  myBox1.add(buttons[i]);
}
fr.add(myBox1,BorderLayout.WEST);
 
ButtonGroup myGroup=new ButtonGroup();
JPanel myPanel3=new JPanel();
ArrayList<JRadioButton> masRB=new ArrayList<JRadioButton>();
myPanel3.setLayout(new GridLayout(9,1));
for (int i=0;i<9;i++){
masRB.add(new JRadioButton("Выбор "+Integer.toString(i+1)));
myGroup.add(masRB.get(i));
myPanel3.add(masRB.get(i));
}
masRB.get(6).setSelected(true);
fr.add(myPanel3,BorderLayout.EAST);
 
 Box myBox2=new Box(BoxLayout.Y_AXIS);
 Box myBox3=new Box(BoxLayout.X_AXIS);
 myBox3.add(Box.createHorizontalGlue()); 
 JButton mybutton1 = new JButton("Кнопка");
  JButton mybutton2 = new JButton("Кнопка");
  mybutton2.addMouseListener(new MyMouseAdapter());
 myBox3.add(mybutton1);
 myBox3.add(Box.createHorizontalStrut(70));
 myBox3.add(mybutton2);
 myBox3.add(Box.createHorizontalGlue());
 MyTextArea = new JTextArea("Область текста");
 MyTextArea.addKeyListener(new NumberKeyListener());
  myBox2.add(MyTextArea);
  myBox2.add(Box.createVerticalStrut(5));
  myBox2.add(myBox3);
  myBox2.add(myLabel);
   myBox2.add(PerenosArea);
  myBox2.add(Box.createVerticalStrut(150));
fr.add(myBox2,BorderLayout.CENTER);
 JPanel myPanel4=new JPanel(new FlowLayout(FlowLayout.RIGHT));
 JPasswordField password1 = new JPasswordField(10);
 myPanel4.add(new JPasswordField(10));
 JButton mybutton3 = new JButton("Кнопка");
 mybutton3.addActionListener( new ActionListener() { //добавляем к кнопке слушатель событий
//и тут же его и создаем в виде анонимного вложенного класса
 public void actionPerformed(ActionEvent e) {//описываем процедуру обработки cобытия 
 MyTextArea.setText("Вы нажали кнопку ввода"); //Вывод текста по нажатию кнопки
}
});
myPanel4.add(mybutton3);
fr.add(myPanel4,BorderLayout.SOUTH);
}
}
class MyMouseAdapter extends MouseAdapter{ //создаем свой класс-слушатель, наследуя его от //MouseAdapter, что позволяет нам переопределить только нужный нам метод
 public void mouseEntered(MouseEvent e) {
MyFrame1.myLabel.setText(e.getComponent().getClass().toString()); //Выводим класс компонента при наведении
 }
}

  class NumberKeyListener extends KeyAdapter {   // расширяем абстрактный класс KeyAdapter
        public void keyReleased(KeyEvent event) {  // переопределяем необходимые методы
        if(event.getKeyCode() == KeyEvent.VK_ENTER ) { //Переносим текст из одного поля в другое при нажатии Enter
                  MyFrame1.PerenosArea.setText(MyFrame1.MyTextArea.getText());
                }
            }
  }
       
    
