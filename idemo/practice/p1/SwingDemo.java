package p1;
import javax.swing.*;
public class SwingDemo extends JFrame {
  /*���췽��*/
  public SwingDemo() {
	  this.setTitle("swing");
	  this.setSize(500, 300);
	  this.setVisible(true);
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    this.setTitle(��GUI����);  //���ô���ı���
//    this.setSize(300, 200);       //���ô���Ĵ�С
//    this. setVisible (true);         //��������ʾ
//    this.setDefaultCloseOperation
//                     (JFrame.EXIT_ON_CLOSE);  
  }
  public static void main(String[] args){
    //���������ʵ������������
    new SwingDemo();
  }
}