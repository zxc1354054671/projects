package p1;
import java.awt.*;  
import java.awt.event.*;  
public class input {  
    public static void main(String[] args) {  
        new TFFrame();  
    }  
}  
  
class TFFrame extends Frame  {  
    TFFrame(){  
        TextField tf = new TextField();  
        add(tf);  
        //TextField����Ӽ�����  
        tf.addActionListener(new TFActionListener());  
        pack();  
        setVisible(true);  
    }  
}  
  
class TFActionListener implements ActionListener  {  
    public void actionPerformed(ActionEvent e)  {  
        //(TextField)e.getSource()ǿ�ƽ�����ת��ΪTextField  
        TextField tf = (TextField)e.getSource();  
        System.out.println(tf.getText());  
    }  
}  





