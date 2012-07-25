package info1103;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import testprep.newtest;

public class MapEncode {
	public static void main(String[] args) {
		Map<Object, String> mp = new HashMap<Object, String>();
		String encoded = "";
		mp.put(new Integer(2),"Two");
		mp.put(new Integer(1), "One");
		mp.put(new Integer(3), "Three");
		mp.put(new Integer(4),"Four");
		Set s = mp.entrySet();
		Iterator it = s.iterator();
		while (it.hasNext()) {
			Map.Entry m = (Map.Entry)it.next();
			int key = (Integer)m.getKey();
			String value = (String)m.getValue();
			encoded += Integer.toString(key) + "=" + value + "&";
		}
		System.out.println(encoded);
	}
}