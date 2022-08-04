import java.awt.*;
import javax.swing.JPanel;
import java.awt.geom.RectangularShape;
import java.awt.geom.Ellipse2D;
public class JMyPanel extends JPanel{ // наш класс является наследником класса JPanel
//создаем перечисление используемых параметров 

public static enum Figure {SURNAME, CLEAR};
 private Figure vibor=Figure.CLEAR; //объявляем переменную типа созданного перечисления
//и присваиваем ей значение CLEAR
 public JMyPanel() { } //конструктор нашего класса
 public void ris(String s) {//метод, вызов которого приводит к перерисовке панели
vibor=Figure.valueOf(s); //устанавливаем, что нужно нарисовать 
repaint(); //перерисовываем нашу панель, т.е. вызываем метод paintComponent 
}
 public void paintComponent(Graphics gr){
super.paintComponent(gr);
 Graphics2D g = (Graphics2D)gr;
 BasicStroke pen;//создаем перо, параметры которого будут определять стиль линий
 g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
switch (vibor){
case SURNAME:
pen=new BasicStroke(5,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND); // Буква А
g.setStroke(pen);//делаем текущим пером созданное нами
g.setColor(Color.blue);//задаем цвет пера
g.drawLine(20, 100, 60, 20); 
g.drawLine(40, 60, 80, 60);
g.drawLine(60, 20, 100, 100); 
float[] dash1 = {1, 40};
pen=new BasicStroke(20,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND, 0, dash1, 0); // Буква Л
g.setStroke(pen);
g.setColor(Color.red);
g.drawLine(150, 100, 190, 20); 
g.drawLine(190, 25, 230, 100);
float[] dash2 = {2, 20};
pen=new BasicStroke(15,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_BEVEL, 0, dash2, 0); // Буква О
g.setStroke(pen);
g.setColor(Color.green);
g.drawArc(280, 20, 60, 85, 0, 360); 
float[] dash3 = {5, 12};
pen=new BasicStroke(10,BasicStroke.CAP_SQUARE, BasicStroke.JOIN_BEVEL, 0, dash3, 0); // Буква Е
g.setStroke(pen);
g.setColor(Color.black);
g.drawLine(390, 100, 440, 100);
g.drawLine(390, 100, 390, 20);
g.drawLine(390, 60, 440, 60);
g.drawLine(390, 20, 440, 20);
float[] dash4 = {2, 20};
pen=new BasicStroke(12,BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND); // Буква В
g.setStroke(pen);
g.setColor(Color.pink);
g.drawLine(490, 100, 490, 20);
g.drawLine(490, 20, 520, 20);
g.drawLine(490, 60, 520, 60);
g.drawLine(490, 100, 530, 100);
g.drawArc(500, 20, 35, 40, 0, 90);
g.drawArc(500, 20, 35, 40, 0, -90);
g.drawArc(510, 60, 35, 40, 0, -90);
g.drawArc(510, 60, 35, 40, 0, 90);










break; 
case CLEAR: g.clearRect(0, 0, getSize().width, getSize().height);break;
}
}
} 