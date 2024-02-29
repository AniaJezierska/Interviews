import java.util.*;

class RandomizedSet {
    Map<Integer, Integer> map;
    List<Integer> list;
    Random rand;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        rand = new Random();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (map.containsKey(val))
            return false;
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!map.containsKey(val))
            return false;
        int index = map.get(val);
        int lastElement = list.get(list.size() - 1);
        list.set(index, lastElement);
        map.put(lastElement, index);
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }

    /**
     * Your RandomizedSet object will be instantiated and called as such:
     * RandomizedSet obj = new RandomizedSet();
     * boolean param_1 = obj.insert(val);
     * boolean param_2 = obj.remove(val);
     * int param_3 = obj.getRandom();
     */

    public static void main(String[] args) {
        // Instantiate RandomizedSet object
        RandomizedSet obj = new RandomizedSet();

        // Insert elements and print if insertion was successful
        boolean param_1 = obj.insert(1);
        System.out.println(param_1); // true
        boolean param_2 = obj.remove(2);
        System.out.println(param_2); // false
        boolean param_3 = obj.insert(2);
        System.out.println(param_3); // true

        // Get a random element and print it
        int param_4 = obj.getRandom();
        System.out.println(param_4); // either 1 or 2

        // Remove an element and print if removal was successful
        boolean param_5 = obj.remove(1);
        System.out.println(param_5); // true

        // Insert an element and print if insertion was successful
        boolean param_6 = obj.insert(2);
        System.out.println(param_6); // false

        // Get a random element and print it
        int param_7 = obj.getRandom();
        System.out.println(param_7); // 2
    }
}

//Time complexity:
//Insert Operation (insert(int val)):
//Average case time complexity: O(1)
//Worst case time complexity (due to potential resizing of ArrayList): O(n), 
//but this is rare and amortized over multiple insertions.
//Remove Operation (remove(int val)):
//Average case time complexity: O(1)
//Worst case time complexity (due to potential resizing of ArrayList): O(n), 
//but this is rare and amortized over multiple removals.
//Get Random Operation (getRandom()):
//Average case time complexity: O(1)

//Space complexity: O(n) where n is the number of elements stored in the set
//we are storing each element in both a HashMap (map) and an ArrayList (list),
//both of which could potentially hold all the elements
