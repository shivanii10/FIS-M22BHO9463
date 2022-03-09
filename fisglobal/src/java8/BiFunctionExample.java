package java8;
import java.util.function.*;
public class BiFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<Integer,Integer,Integer> f = (a,b)->a+b;
		System.out.println(f.apply(10, 20));
		
		BiPredicate<Integer,Integer> p1= (a,b)-> (a+b)%2==0;
		System.out.println(p1.test(1, 2));
		
		BiConsumer<Integer,String> c= (a,b)-> {
			System.out.println(b.charAt(a));
		};
		
		c.accept(3, "Program");
		
	}

}
