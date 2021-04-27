package CoreJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class collectionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> names= new ArrayList<String>();
//		names.add("seleniu");
//		names.add("java");
//		names.add("junit");
//		names.add("testng");
//		names.add("mavan");
//		names.addAll(names);
//		names.addAll(2, names);
//		names.remove("mavan");
		
//		for(int i=0;i<names.size();i++) {
//			System.out.println(names.get(i));
//		}
//		Iterator it=names.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
		 
//		Set<String> names=new HashSet<String>();
//		names.add("seleniu");
//		names.add("java");
//		names.add("junit");
//		names.add("testng");
//		names.add("mavan");
//		
//		for(String name:names) {
//			System.out.println(name);
		
		Map<String,String> map=new HashMap<String,String>();
		map.put("course","java");
		map.put("course2","python");
		map.put("course3","c");
		map.put("course4","corejava");
		
		Iterator it=map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		
			
		
		
		
		
		
		
		
		
		
		}
		
	}

}
