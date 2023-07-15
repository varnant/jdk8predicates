import java.util.function.Predicate;
class MarktestPredicate implements Predicate <Integer>{
@Override
public boolean test(Integer t){

return t > 39 && t <= 100;
}

public static void main(String[] arg){
MarktestPredicate  m1=new MarktestPredicate();
System.out.println(m1.test(25));
System.out.println(m1.test(100));
System.out.println(m1.test(101));
//using lamda expressions

Predicate<Integer> passmark=x-> x > 39 && x <= 100;
System.out.println(passmark.test(38));
System.out.println(passmark.test(83));
}
}