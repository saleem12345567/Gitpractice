package Practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.collections4.map.LinkedMap;

public class MaximumCharacter {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String x = "God bless you";
    Map<String, Integer> map=new LinkedHashMap<>();
    String[]arr=x.split("");
    for(String s:arr)
    {
    	
		if(!map.containsKey(s)){
    		map.put( s, 1);
    	}else{
    		int count=map.get(s);
    		map.put(s, count+1);
    	}
    }
     Set<Entry<String, java.lang.Integer>> lhmap = map.entrySet();
    	 String maxkey="";
    	int  maxval=0;
    	
    	
		for(Map.Entry<String, Integer> data:lhmap){
    	
			if(data.getValue()>maxval)
			{
				maxval=data.getValue();
				maxkey=data.getKey();
			}
    		}
    		System.out.println(maxkey);
    		System.out.println(maxval);
    	}
    		
    	}
    

	


