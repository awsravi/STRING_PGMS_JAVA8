import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWord {
	public static void main(String[] args) {
		String str = "fubeus technology";
	System.out.println("O G "+str);
	List<String> listStr = Arrays.asList(str.split(" "));
	
	String	 output=listStr.stream().map(s -> new
	  StringBuilder(s).reverse()).collect(Collectors.joining(" ")); 
	System.out.println("N G "+output);
	 
		
		 String reverseStr = Arrays
	                .stream(str.split(" "))
	                .sorted(Comparator.reverseOrder())
	                .collect(Collectors.joining(" "));
		 System.out.println(reverseStr);
		 
		 
		
	}

}
//fubeus technology"
// suebuf ygolonhcet"