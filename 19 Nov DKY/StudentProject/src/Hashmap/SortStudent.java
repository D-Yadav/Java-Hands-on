package Hashmap;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortStudent {
public static void main(String[] args) {
	SortedSet<Student> students=new TreeSet<Student>();
	students.add(new Student(1, "Sowyma", "Nellore", 7.5));
	students.add(new Student(2, "Karika", "Nellore", 7.8));
	students.add(new Student(3, "Sooparna", "chennai", 7.9));
	students.add(new Student(4, "Deepak", "Delhi", 7.56));
	for (Student student : students) {
		System.out.println(student);
	}
}
}
