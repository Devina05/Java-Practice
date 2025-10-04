import java.io.*;
import java.util.*;

class CollectionDemo{
	public static void main(String argd[])
	{
		int arr[] = new int[] {1,2,3,4};
		Vector v = new Vector();
		Hashtable h = new Hashtable();
		v.addElement(1);
		v.addElement(2);
		
		h.put(1,"geek");
		h.put(2,"geek");
		System.out.println(arr[0]);
		System.out.println(v.elementAt(0));
		System.out.println(h.get(1));
	}
}