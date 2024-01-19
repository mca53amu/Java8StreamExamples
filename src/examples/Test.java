package examples;

import examples.data.Employee;
import examples.data.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Optional<Employee> empty = Optional.empty();
		Employee orElseGet = empty.orElseGet(()->new Employee());
		System.out.println(orElseGet);
		
		
		System.out.println("Hi");
		
		if(empty.isPresent()) {
			System.out.println("hello");
		}
		
		Stream<Integer> takeWhile = Stream.of(1,2,3,4,5,6,7,8,9,10).takeWhile(i -> i < 5 );
		
		takeWhile.forEach(data->System.out.println(data));
		
		Integer orElse = Stream.of(1,2,3,4,5,6,7,8,9,10).max((a,b)->a-b).orElse(1);
		System.out.println(orElse);
		
		String s="1,2,3";
		String[] split = s.split(",");
		List<String> asList = Arrays.asList(split);
		List<Integer> collect = asList.stream().map(a->Integer.parseInt(a)).takeWhile(i->i<3).collect(Collectors.toList()
				);
		System.out.println(collect);
		
		int a=1234567;
		int pall=0;
		
		do {
			int rem=a%10;
			pall=pall*10+rem;
			a=a/10;
		}while(a>0);
		System.out.println(pall);
		
		List<String> asList2 = Arrays.asList("a","a","s");
		List<Student> collect2 = asList2.stream().map(aa->new Student()).collect(Collectors.toList());
		Map<String, Student> collect3 = collect2.stream().collect(Collectors.toSet()).stream().collect(Collectors.toMap(Student::getName, Function.identity()));
		System.out.println(collect3);
		
		
		
		
		
	}

}
