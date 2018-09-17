package p1;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class TestMouse{

	public static void main(String[] args){
		// 创建窗口
		Fm f1 = new Fm(100,100,800,600);
		// 创建画布
		Lb l1 = new Lb(80,60,640,480);
		
		l1.addMouseMotionListener(new MouseMonitor());

		f1.add(l1);
	}

}

class Fm extends Frame{

	Fm(int x,int y,int w,int h){
		this.setBounds(x,y,w,h);
		this.setTitle("画图");
		this.setBackground(new Color(233,233,233));
		this.setVisible(true);
		this.setLayout(null);
	}

}

class Lb extends Label{
	ArrayList<Point> pointList = new ArrayList<Point>();

	Lb(int x,int y,int w,int h){
		this.setBounds(x,y,w,h);
		this.setBackground(new Color(255,255,255));
	}

	public void paint(Graphics g){

		Iterator it = this.pointList.iterator();

		while(it.hasNext()){
			Point p = (Point)it.next();

			g.fillOval(p.x,p.y,5,5);

		}

	}

	// 添加一个点
	public void addPoint(Point p){
		this.pointList.add(p);
	}

}

class MouseMonitor extends MouseAdapter{

	public static int sum = 0;

	public void mouseDragged(MouseEvent e){

		Lb f1 = (Lb)e.getSource();
		f1.addPoint(new Point(e.getX(),e.getY()));
		f1.repaint();
		// sum++;
		// System.out.println(1);
		// System.out.println(sum);
	} 

	// public void mouseMoved(MouseEvent e){
	// 	System.out.println(3);
	// }
 
	// public void mouseClicked(MouseEvent e){

	// 	System.out.println(2);

	// } 
}