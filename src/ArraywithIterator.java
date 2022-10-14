import java.util.ArrayList;
import java.util.Iterator;

public class ArraywithIterator {
public static void main(String[] args)
{
	ArrayList<String> list=new ArrayList<String>();
	list.add("Ram");
	list.add("Laxman");
	list.add("Sita");
	
	Iterator<String> itr = list.iterator();
	
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
}
