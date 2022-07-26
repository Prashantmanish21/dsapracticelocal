package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class IsomophiceStrings {
	
	public static void main(String[]args) {
		String s="foo";
		String t="bar";
		String newString="";
		HashMap<Character,Character>map=new HashMap();
		if(s.length()==t.length()) {
		    for(int i=0,j=0;i<s.length();) {
		       if(!map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(j))) {
		    	map.put(s.charAt(i),t.charAt(j));
		    	newString=newString + map.get(s.charAt(i));
				   i++;j++;
		       }else {
		    	   newString=newString + map.get(s.charAt(i));
			       i++;j++;
		       }
		      
			     
		    }
		  
		    
		}
		if(newString.equals(t)) {
			 System.out.println(newString +","+t );
			    System.out.println(true);
		}else {
			System.out.println(newString +","+ t );
			 System.out.println(false);
		}
		
		
	}

}
