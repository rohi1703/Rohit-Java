package io.rohit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExerciseJava8 {

	public static void main(String[] args) {
		List<Person> person = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carrol", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlatte", "Bronte", 45),
				new Person("Mathew", "Arnold", 39)
				);
		
		
		
		//sort the list by last name
		/*List<ForLambda> lambdaPersonList = Arrays.asList(
				(String name, String last, int age)-> System.out.printf("Charles", "Dickens", 60),
				(String name, String last, int age)-> System.out.printf("Lewis", "Carrol", 42),
				(String name, String last, int age)-> System.out.printf("Thomas", "Carlyle", 51),
				(String name, String last, int age)-> System.out.printf("Charlatte", "Bronte", 45),
				(String name, String last, int age)-> System.out.printf("Mathew", "Arnold", 39));
*/				/*new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carrol", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlatte", "Bronte", 45),
				new Person("Mathew", "Arnold", 39)*/
				//);
		//Arrays.sort(lambdaPersonList);
		Collections.sort(person);
		
		//create a method that prints all elements in the list
		printAll(person);
		
		System.out.println("method that prints all people with last name starting with c");
		//print for any person with last name starts with 'C'
		Condition printWithLastNameStartWithC = (Person person1)-> {
				if (person1.getLastName().startsWith("C"))
			{
				System.out.println(person1);
			}
		};
	
		printConditionally(person, printWithLastNameStartWithC);
		
		System.out.println("method that prints all people with first name starting with C");
		//print for any person with last name starts with 'D'
		
		Condition printWithFirstNameStartWithC = (Person person1)-> {
			if (person1.getFirstName().startsWith("C"))
		{
			System.out.println(person1);
		}
	};
	
		printConditionally(person, printWithFirstNameStartWithC);
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

