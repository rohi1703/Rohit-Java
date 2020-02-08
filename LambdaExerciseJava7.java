package io.rohit;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExerciseJava7 {

	public static void main(String[] args) {
		List<Person> person = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carrol", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlatte", "Bronte", 45),
				new Person("Mathew", "Arnold", 39)
				);
		
		Collections.sort(person);
		
		//create a method that prints all elements in the list
		printAll(person);
		
		System.out.println("method that prints all people with last name starting with c");
		//print for any person with last name starts with 'C'
		printConditionally(person, new Condition() {

			@Override
			public void test(Person person) {
				if (person.getLastName().startsWith("C"))
				{
					System.out.println(person);
				}
			}
		});
		
		System.out.println("method that prints all people with first name starting with C");
		//print for any person with last name starts with 'D'
		printConditionally(person, new Condition() {

			@Override
			public void test(Person person) {
				if (person.getFirstName().startsWith("C"))
				{
					System.out.println(person);
				}
			}
		});
	}

	private static void printConditionally(List<Person> person, Condition condition) {
		for(Person p: person)
		{
			condition.test(p);
		}
		
	}

	private static void printAll(List<Person> person) {
		for(Person person1:person)
		{
			System.out.println(person1.toString());
		}
		
	}

}
