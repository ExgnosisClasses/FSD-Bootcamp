import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImperativeRunner {

	public static void main(String[] args) {
		List<String> randomValues = Arrays.asList(
				"E11", "D12", "A13", "F14", "C15", "A16", 
				"B11", "B12", "C13", "B14",	"B15", "B16", 
				"F12", "E13", "C11", "C14", "A15", "C16", 
				"F11", "C12", "D13", "E14", "D15", "D16");
		
		List<String> finalValues = new ArrayList<>();


		for(String value: randomValues) {
			if (value.startsWith("C")) {
				finalValues.add(value);
			}	
		}
		
		finalValues.sort((String value1, String value2) -> value1.compareTo(value2));
		finalValues.forEach((String value) -> System.out.println(value));

	}

}


//});
