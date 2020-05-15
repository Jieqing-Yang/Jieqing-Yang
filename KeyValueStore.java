//package KeyValuePair;

import java.util.ArrayList;

public class KeyValueStore 
{
	ArrayList<KeyValuePair> listarray =new ArrayList<KeyValuePair>();
	
	public void newKVP(String key, String value)
	{
		KeyValuePair keyvalue =new KeyValuePair(key, value);
		listarray.add(keyvalue);
		
		
	}
	
	public String getKVP(String key) 
	{
		String value="";
		for(KeyValuePair p:listarray) 
		{
			if(key==p.key) 
			{
				value=p.value;
			}
		}
		return value;
	}
	
	public void updateKVP(String key, String newValue) 
	{
		for(KeyValuePair p:listarray) 
		{
			if(key==p.key) 
			{
				p.value=newValue;
			}
		}
	}
	
	public void deleteKVP(String key)
	{
		for(KeyValuePair p:listarray)
		 {
			if(key==p.key) 
			{
				listarray.remove(p);
			}
		}
	}

}
