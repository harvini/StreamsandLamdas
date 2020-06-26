import java.util.*;
import java.util.stream.IntStream;
public class AverageOfList{
public static void main(String []args){
IntStream listStream= IntStream.range(15,30);
OptionalDouble optDouble=listStream.average();
if(optDouble.isPresent()){
System.out.println("Average is: "+optDouble.getAsDouble());
}
else
System.out.println("Try Again!");
}
}