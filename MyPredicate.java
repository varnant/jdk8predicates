import java.util.function.Predicate;

//using prdicate to test age using test method and also Lambda
public class MyPredicate implements Predicate<Integer> {
	@Override
//primary school admission may start from age 3 and upto 6  1 standard
	public boolean test(Integer t) {
		return t >= 3 && t < 6;
	}

	public static void main(String[] args) {
		MyPredicate agetestPredicate = new MyPredicate();

		System.out.println(agetestPredicate.test(1)); // false
		System.out.println(agetestPredicate .test(5)); // true

		// another way to use predicates is by lambda expressions-here I am trying                  //Lamda- no object required for the class use Interface Predicate
                 
		Predicate<Integer> greaterThan5 = x -> x > 5;
		System.out.println(greaterThan5.test(9)); // true
		System.out.println(greaterThan5.test(3)); // false
	}
}

