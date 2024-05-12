package org.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(numbers);
        numbers.add(6);
        System.out.println(numbers);
        numbers.add(2,8);
        System.out.println(numbers);
        int i = numbers.get(2);
        System.out.println(i);
        //traverse
        Main.traverse_for(numbers);
        Main.traverse_for_each(numbers);
        Main.traverse_iterator(numbers);
        //searching
        Main.search(numbers,3);
        Main.search(numbers,10);
        //delete
        System.out.println(numbers);
        Main.remove(numbers,8);
        System.out.println(numbers);

        ArrayList<String> al_string = new ArrayList<>(Arrays.asList("A","B","C","D","E"));
        System.out.println(al_string);
        Main.search(al_string,"F");
        Main.search(al_string,"D");
        Main.remove(al_string,"F");
        System.out.println(al_string);

    }

    //traverse using for loop
    static void traverse_for(ArrayList<Integer> al){
        System.out.println("Traversing using traverse_for");
        for(int i=0; i<al.size();i++){
            System.out.print(al.get(i) + " ");
        }
        System.out.println(" ");
    }

    //traverse using for each
    static void traverse_for_each(ArrayList<Integer> al){
        System.out.println("Traversing the array list using traverse_for_each.");
        for(int number:al){
            System.out.print(number + " ");
        }
        System.out.println(" ");
    }

    //traverse using iterator
    static void traverse_iterator(ArrayList<Integer> al){
        System.out.println("Traversing array list using traverse_iterator");
        Iterator<Integer> iter = al.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
        System.out.println(" ");
    }

    static void search(ArrayList<Integer> al, int target){
        System.out.println("Searching for number : " + target);
        Iterator<Integer> iter = al.iterator();
        while(iter.hasNext()){
            if(iter.next()==target){
                System.out.println("The element is found in array list");
                return;
            }
        }
        System.out.println("the element is not found in Array list");
    }

    static void search(ArrayList<String> al_string, String target){
        System.out.println("Searching for element : " + target);
        int index;
        index = al_string.indexOf(target);
        System.out.println("Index of elemnt in array list is : " + index);
        for(String s:al_string){
            if(s.equals(target)){
                System.out.println("The element is found in the array list.");
                return;
            }
        }
        System.out.println("The element is not found in array list");
    }

    //remove elements from array list
    static void remove(ArrayList<Integer> al, int index){
        try{
            al.remove(index);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index is out of array list length");
        }
    }

    static void remove(ArrayList<String> al_string, String s){
        al_string.remove(s);
    }

}
