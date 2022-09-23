package Day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListAssignmentProblems {
    public static void main(String[] args) {

        // 1. Make a ArrayList of Colors
        ArrayList<String> colorsList = new ArrayList<>();

        colorsList.add("Red");
        colorsList.add("Black");
        colorsList.add("White");

        // 2. Iterate through ArrayList

        Iterator<String> color = colorsList.iterator();

        while (color.hasNext()){
            System.out.println(color.next());
        }

        // 3. Insert an element in ArrayList at first index

        colorsList.set(0, "Yellow");

        // 4. 4. Retrieve an element (at a specified index) from a given array list.

        colorsList.get(1);

        //5. Update specific array element by given element.

        colorsList.set(2, "Brown");

        //6. Remove the third element from an array list.

        colorsList.remove(2);

        //7. Search for an element in an array list.

        boolean isYellowPresent = colorsList.contains("Yellow");

        //8. Sort a given array list.

        Collections.sort(colorsList);

        //9. Copy one array list into another.


        //10. Shuffle elements in an array list.

        Collections.shuffle(colorsList);

        //11. Reverse elements in an array list.


        //12. Extract a portion of an array list.


        //13. Compare two array lists.
        //14. Swap two elements in an array list.
        //15. Join two array lists.
        //16. Clone an array list to another array list.

        //17. Empty an array list.

        colorsList.removeAll(colorsList);

        //18. Test whether an array list is empty or not.
        //19. Trim the capacity of an array list the current list size.
        //20. Increase the size of an array list.
        //21. Replace the second element of an ArrayList with the specified element.



        //22. Print all the ArrayList elements using the position of the elements

        int length = colorsList.size();

        for(int i=0; i<length; i++){
            System.out.println(colorsList.get(i));
        }

    }
}
