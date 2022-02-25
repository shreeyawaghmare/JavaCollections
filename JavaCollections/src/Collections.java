import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Collections {
     void Display(List<String> list) 
     {
    	 Iterator<String> obj = list.iterator();
    	 while(obj.hasNext()) 
    	 {
    		 System.out.println("Element is: "+ obj.next());
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String> oj = new 
    		  LinkedList<>();
      oj.add("Shreeya");
      oj.add("Pramod");
      oj.add("Samar");
      oj.add("Sahir");
      oj.add("Meera");
      		System.out.println("Element is:"+ oj);
      		Collections c= new Collections();
      		c.Display(oj);
	}

}
