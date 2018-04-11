package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> MDCities = new ArrayList<String>();
		MDCities.add("Takoma Park");
		MDCities.add("Silver Spring");
		MDCities.add("Baltimore");


		List<String> PACities = new ArrayList<String>();
		PACities.add("Harrisburg");
		PACities.add("Lancaster");
		PACities.add("Philadelphia");
		PACities.add("Petersburg");

		Map<String, List<String>> MDPACities = new HashMap<>();
		MDPACities.put("MD", MDCities);
		MDPACities.put("PA", PACities);

		//using for each loop to iterate
		for (Map.Entry MDPA : MDPACities.entrySet())
		{
			System.out.println(MDPA.getKey()+" - "+MDPA.getValue());
		}

		//using iterator
		System.out.println("Using iterator to traverse map");
		Iterator iterator = MDPACities.entrySet().iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
