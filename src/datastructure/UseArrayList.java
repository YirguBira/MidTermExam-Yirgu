package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(40);
		list.add(30);
		list.add(50);
		list.add(20);

		//looping list with for loop
		System.out.println("Elements of list retrieved with for loop:");
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		//looping list with iterator
		System.out.println("elements of list as retrieved with iterator:");
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		//get size of list
		System.out.println("Size of elements of list: "+list.size());

		//remove element from list
		list.remove(2);

		//get modified size
		System.out.println("elements of list after an element is removed: "+list.size());

		//Sorting list
		for(int i=0; i<list.size(); i++){
            int alist2 = list.get(i);
			for(int j=i+1; j<list.size(); j++){
                int alist1 = list.get(j);
				if(alist1<alist2){
					int temp = alist1;
					alist1 = alist2;
					alist2 = temp;
				}
			}
		}

        for(int n=0; n<list.size(); n++){
            System.out.println(list.get(n));
        }
	}
}
