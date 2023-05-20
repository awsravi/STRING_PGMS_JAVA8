import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWord1 {

	public static void main(String[] args) {
		String str = "fubeus technology";
		//reverse chat
		List<String> lstr = Arrays.asList(str.split(" "));
		String output = lstr.stream().map(s -> new StringBuilder(s).reverse()).collect(Collectors.joining(" "));
		//System.out.println(output);
		//reverse word
		String list = Arrays.stream(str.split(" ")).sorted(Comparator.reverseOrder())
				.collect(Collectors.joining(" "));
		System.out.println(list);
	}

}
