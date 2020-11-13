package examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class RegularExpressionTest {
	private final static String ALLOWED_PATTERN = "^[a-zA-Z\\u0621-\\u064A0-9\\u0660-\\u0669&@_\\-,.: ]{0,}$";

	public static void main(String[] arg) {

		Map<String, List<String>> paramMap = new HashMap<>();

		put(paramMap, "1", "abcd&");
		put(paramMap, "2", "afadfdf,afadf");

		paramMap.forEach((parameter, values) -> {
			System.out.println(parameter);
			values.forEach(value -> { //
				if (Pattern.matches(ALLOWED_PATTERN, value)) {
					System.out.println("matched");
				}else {
					System.out.println("Not matched");
				}
			});
		});

	}

	private static void put(Map<String, List<String>> map, String key, String... strings) {
		ArrayList<String> arrayList = new ArrayList<>();
		for (String string : strings) {
			arrayList.add(string);
		}
		
		map.put(key, arrayList);

	}

}
