package com.tullika.arraylist;

import java.util.*;

/**
 * Created on 1/18/2015.
 */

public class ArrayListExamples {
    public static void main(String args[]) {
        //listExamples();
        mapExamples();
    }

    private static void mapExamples() {
        Map<String, Integer> integerMap = new HashMap<String, Integer>();
        Map<String, List<String>> listMap = new HashMap<String, List<String>>();

        // Put elements to the hashMap
        integerMap.put("USA", new Integer(1));
        integerMap.put("UK", new Integer(2));
        integerMap.put("China", new Integer(3));
        integerMap.put("India", new Integer(4));

        // take a value of a specific key
        System.out.println("Simple HashMap: Key 'UK' has value = " + integerMap.get("UK"));

        // see if a specific value or key is into the hashMap
        System.out.println("Simple HashMap containes value '1' - " + integerMap.containsValue(1));
        System.out.println("Simple HashMap containes key 'Greece' - "
                + integerMap.containsKey("Greece"));

        // create an arrayList to store values
        List<String> listOne = new LinkedList<String>();
        listOne.add("Blue");
        listOne.add("Black");
        listOne.add("Brown");

        // create list two and store values
        List<String> listTwo = new LinkedList<String>();
        listTwo.add("Pink");
        listTwo.add("Purple");

        // put values into map
        listMap.put("B color", listOne);
        listMap.put("P color", listTwo);

        // Get a set of the entries
        Set<Map.Entry<String,Integer>> setOfEntries = integerMap.entrySet();
        Set<Map.Entry<String,List<String>>> setOfListEntries  = listMap.entrySet();

        Set<String> keySet = integerMap.keySet();
        Set<Map.Entry<String,Integer>> SetTwo = integerMap.entrySet();

        //integerMap keySet
        for (String str : integerMap.keySet()) {
            System.out.println(str + " -- " + integerMap.get(str));
        }

        //integerMap entrySet
        for (Map.Entry<String,Integer> mapEntry : integerMap.entrySet()) {
            System.out.println(mapEntry.getKey() + " -- " + mapEntry.getValue());
        }

        //integerMap iterator
//        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
//            System.out.println("Item is: " + it.next());
//        }
//
        for (Iterator<String> it = integerMap.keySet().iterator();it.hasNext();) {
            String currentKey = it.next();
            System.out.println("Iterator: " + currentKey + " -Value: " + integerMap.get(currentKey));
        }

        for(Iterator<Map.Entry<String,Integer>> it = integerMap.entrySet().iterator(); it.hasNext();) {
            Map.Entry<String,Integer> currentEntry = it.next();
            System.out.println("Iterator EntrySet :" + currentEntry.getKey() + " : " + currentEntry.getValue());
        }

        // for each loop listMap (keySet)
        for (String keyValue : listMap.keySet()){
            System.out.println("listMap foreach keySet: " + keyValue + " : " + listMap.get(keyValue));
        }

        // for each loop listMap (EntrySet)
        for (Map.Entry<String,List<String>> entry : listMap.entrySet()){
            System.out.println("listMap foreach entrySet:" + entry.getKey() + " : " + entry.getValue());
        }

        // iterator listMap keySet
        for (Iterator<String> it = listMap.keySet().iterator(); it.hasNext();) {
            String currentKey = it.next();
            System.out.println("iterator keySet: " + currentKey + " : " + listMap.get(currentKey));

        }

        //iterator listMap entrySet
        for (Iterator<Map.Entry<String,List<String>>> it = listMap.entrySet().iterator(); it.hasNext();) {
            Map.Entry<String,List<String>> currentEntry = it.next();
            System.out.println("Iterator entrySet: " + currentEntry.getKey() + " : " + currentEntry.getValue());
        }



        Set<Map.Entry<String, List<String>>> setMap = listMap.entrySet();
        // Get an iterator
        Iterator<Map.Entry<String, List<String>>> iteratorMap = setMap.iterator();

        System.out.println("\nHashMap with Multiple Values");
        // display all the elements
        while (iteratorMap.hasNext()) {
            Map.Entry<String, List<String>> entry = iteratorMap.next();
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key = '" + key + "' has values: " + values);
        }

    }

    private static void listExamples() {
        List<String> list = new LinkedList<String>();
        list.add("Item1");
        list.add("Item2");
        list.add(2, "Item3"); // it will add Item3 to the third position of
        list.add("Item4");
        // Display the contents of the array list
        System.out.println("The arraylist contains the following elements: " + list);
        // Checking index of an item
        int pos = list.indexOf("Item2");
        System.out.println("The index of Item2 is: " + pos);
        // Checking if array list is empty
        boolean check = list.isEmpty();
        System.out.println("Checking if the arraylist is empty: " + check);
        // Getting the size of the list
        int size = list.size();
        System.out.println("The size of the list is: " + size);
        // Checking if an element is included to the list
        boolean element = list.contains("Item5");
        System.out.println("Checking if the arraylist contains the object Item5: " + element);
        // Getting the element in a specific position
        String item = list.get(0);
        System.out.println("The item is the index 0 is: " + item);
        // Retrieve elements from the arraylist
        // 1st way: loop using index and size list
        System.out
                .println("Retrieving items with loop using index and size list");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index: " + i + " - Item: " + list.get(i));
        }

        // 2nd way:using foreach loop
        System.out.println("Retrieving items using foreach loop");
        for (String str : list) {
            System.out.println("Item is: " + str);
        }

        // 3rd way:using iterator
        // hasNext(): returns true if there are more elements
        // next(): returns the next element
        System.out.println("Retrieving items using iterator");
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            System.out.println("Item is: " + it.next());
        }

        // Replacing an element
        list.set(1, "NewItem");
        System.out.println("The arraylist after the replacement is: " + list);

        // Removing items
        // removing the item in index 0
        list.remove(0);

        // removing the first occurrence of item "Item3"
        list.remove("Item3");

        System.out.println("The final contents of the arraylist are: " + list);

        // Converting ArrayList to Array
        //String[] simpleArray = list.toArray(new String[list.size()]);
        String[] simpleArray = new String[list.size()];
        list.toArray(simpleArray);

        System.out.println("The array created after the conversion of our arraylist is: "
                + Arrays.toString(simpleArray));

    }
}
