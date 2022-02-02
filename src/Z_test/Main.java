package Z_test;

import java.util.List;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

    	System.out.println("incrementBy5 = " + incrementBy5.apply(3));
    	System.out.println("multiplyBy2 = " + incrementBy5.apply(5));
    	System.out.println("addThenMultiply = " + addThenMultiply.apply(4));
    	
    	System.out.println("BiFunction : " + biFunction.apply(3,10));
    	
    	Person mabastObj = new Person("Mabast", Gender.MALE);
    	System.out.println("Consumer ");
    	consumerFunction.accept(mabastObj);
    	
    	System.out.println("BiConsumer : ");
    	biConsumerFunction.accept(mabastObj, false);
    	
    	System.out.println(testName.test(mabastObj.name));
    	String num1 = "07707896644";
    	String num2 = "7506787733";
    	System.out.println(num1 + " is isStartsWith0750: " + isStartsWith0750.test(num1));
    	System.out.println(num2 + " is isStartsWith0750: " + isStartsWith0750.test(num2));
    	
    	System.out.println(supplierExample.get());
    	
    	
    	List<Person> people = List.of(
                new Person("Alice", Gender.FEMALE),
                new Person("Mabast", Gender.MALE),
                new Person("Ahmed", Gender.MALE),
                new Person("Mohammed", Gender.MALE),
                new Person("Maria", Gender.FEMALE)
        		);
    	
//    	Function<Person, String> personStringFunction = person -> person.name;
//    	ToIntFunction<String> length = String::length;
//    	IntConsumer println = System.out::println;
    	
    	// The above commented lines is equal to bellow next few lines. !!!
   
    	people.stream()
    	.map(person -> person.name)
    	.mapToInt(String::length)
    	.forEach(System.out::println);
    	
    }
    
    static Supplier<String> supplierExample = () -> "Anything that you want it can return for you!";
    
    static Predicate<String> isStartsWith0750 = numberString ->
    ( numberString.startsWith("0750") || numberString.startsWith("750") ) && (numberString.length() == 11 || numberString.length() == 10);
    
    static Predicate<String> testName = name -> name.toLowerCase().equals("mabast");
    
    static BiConsumer<Person, Boolean> biConsumerFunction = (customer, showGender) ->
    System.out.println("Customer is : "+customer.name +" and Gender is : "+ (showGender? customer.gender : " *** ") );

    static Consumer<Person> consumerFunction = customer -> System.out.println("Customer is : "+customer.name +" and Gender is : "+customer.gender);
    
    static BiFunction<Integer, Integer, Integer> biFunction = (incNum, multNum) ->
    (incNum +3) * multNum;
    
    static Function<Integer, Integer> incrementBy5 = num -> num + 5;
    
    static Function<Integer, Integer> multiplyBy2 = num -> num * 2;
    
    static Function<Integer, Integer> addThenMultiply = incrementBy5.andThen(multiplyBy2);
    
    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }

    enum Gender{
        FEMALE, MALE
    }
    
    
       /*
    	List<Person> people = List.of(
                new Person("Alice", Gender.FEMALE),
                new Person("Mabast", Gender.MALE),
                new Person("Ahmed", Gender.MALE),
                new Person("Mohammed", Gender.MALE),
                new Person("Maria", Gender.FEMALE)
        		);

        System.out.println("// Imperative Approach ");
        // Imperative Approach
        List<Person> females = new ArrayList<Person>();
        
        for (Person person : people)
        {
        	if ((person.gender).equals(Gender.FEMALE))
        		females.add(person);
        }
        for (Person female : females)
        	System.out.println(female.name);
        
        System.out.println("// Declarative Approach ");
        // Declarative Approach 
        people.stream().filter(p -> (p.gender).equals(Gender.FEMALE))
        		.collect(Collectors.toList())
        		.forEach(e -> System.out.println(e.name));
        
        
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }

    enum Gender{
        FEMALE, MALE
    }
*/
    	
}
