package p2;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;

public class List1 implements Externalizable{
	public static void main(String[] args) {
//		Vector<E>
//		HashMap<K, V>
		ArrayList<Object> al = new ArrayList<Object>();
		LinkedList<?> linkedList = new LinkedList();
		al.add(1);
		al.add(1);
		al.add(1);
		al.indexOf(2);
//		Integer.decode(nm)
//		for (Object a : al) {
//			al.remove(a);
//			
//		}
//		String s1="";
//		String s2="w";
//		String s3=null;
//		System.out.println(Integer.decode(s3));
//		System.out.println(Integer.getInteger(s2));
//		System.out.println(Integer.getInteger(s3));
//		Float
		
//		BigDecimal bd=new BigDecimal(3);
//		BigDecimal add = bd.divide(new BigDecimal(2));
//		System.out.println(add);
		String s1=null;
		String s2=null;
		System.out.println(s1.equals(s2));
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
}
