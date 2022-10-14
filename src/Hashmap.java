import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args)
{
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
        
		hm.put(501,"Shreyaskar");
		hm.put(502,"Ram");
		hm.put(503,"Ravan");
		System.out.println(hm.get(502));
}
}

