package Hashmap;

import java.io.ObjectInputStream.GetField;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapDemo2 {
public static void main(String[] args) {
	Map<String, Double> m=new Hashtable<String, Double>();
	m.put("Poornesh", 67745.54);
	m.put("Deepak", 894841.481);
	m.put("laxmi", 94845.4894);
	m.put("Megha", 784691.461);
	String key;
	double sal;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the key...");
	key=sc.nextLine();
	sal=m.getOrDefault(key, 0.0);
	System.out.println("salary is  " + sal);
	
}

}
