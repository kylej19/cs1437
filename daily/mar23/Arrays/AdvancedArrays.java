package Arrays;

import java.util.ArrayList;

public class AdvancedArrays {

    public static void main(String[] args) {
        // immutable, cannot add or remove elements
        int[] numsI = new int[5];
        // ArrayLists are mutable
        ArrayList<String> names = new ArrayList<>();
        // can be changed later
        names.add("James");
        names.add("Catherine");
        names.add("Bill");
        // error
        // System.out.println(names[0]);
        System.out.println("names[0]: " + names.get(0));
        System.out.println("size: " + names.size());

        var nums = new ArrayList<Integer>(5);

        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(1);
        nums.add(0);

        for (int i : nums) {
            System.out.println(i);
        }

        System.out.println("remove(0): ");

        // remove(int) prioritizes the method that uses index to remove
        nums.remove(0);
        
        for (int i : nums) {
            System.out.println(i);
        }

        System.out.println("remove(Integer.valueOf(0): ");

        // remove(Object) is only called if the wrapper class for Integer wraps the integer value
        nums.remove(Integer.valueOf(0));

        for (int i : nums) {
            System.out.println(i);
        }

        System.out.println("----");
        System.out.println("----");
        System.out.println("----");

        ArrayList<Computer> dataCenter = new ArrayList<Computer>();

        dataCenter.add(new Computer("Nvidia","Vulcan",2021,450000.00));
        dataCenter.add(new Computer("Dell","Umbriel",2025,650000.00));
        
        System.out.println(dataCenter);

    }

}
