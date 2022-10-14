import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
public static void main(String[] args)
{
	HashSet<Integer> hs= new HashSet<Integer>();
	hs.add(101);
	hs.add(102);
	hs.add(103);
	
	Iterator<Integer> itr= hs.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
