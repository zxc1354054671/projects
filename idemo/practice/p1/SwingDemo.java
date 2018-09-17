package p1;
import javax.swing.*;
public class SwingDemo extends JFrame {
  /*构造方法*/
  public SwingDemo() {
	  this.setTitle("swing");
	  this.setSize(500, 300);
	  this.setVisible(true);
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    this.setTitle(“GUI程序”);  //设置窗体的标题
//    this.setSize(300, 200);       //设置窗体的大小
//    this. setVisible (true);         //将窗体显示
//    this.setDefaultCloseOperation
//                     (JFrame.EXIT_ON_CLOSE);  
  }
  public static void main(String[] args){
    //创建窗体的实例，匿名对象
    new SwingDemo();
  }
}