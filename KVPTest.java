package KeyValuePair;

public class Test {
	public static void main(String[] args) {
		KeyValueStore keyvalue=new KeyValueStore();
		keyvalue.newKVP("No01", "Marry");
		String value01=keyvalue.getKVP("No01");
		System.out.println(value01);
		
		keyvalue.newKVP("No02", "Peter");
		keyvalue.updateKVP("No02", "Jack");
		String value02=keyvalue.getKVP("No02");
		System.out.println(value02);
		
		//keyvalue.deleteKVP("No02");
		
	}

}
