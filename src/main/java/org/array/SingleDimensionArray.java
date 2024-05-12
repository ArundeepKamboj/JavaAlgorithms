package org.array;

public class SingleDimensionArray {
    int[] arr;

    public SingleDimensionArray(int sizeOfArray){
        arr=new int[sizeOfArray];
        for(int i=0; i<sizeOfArray; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    //Insert in Array
    public void insert(int location, int valueToBeInserted){
        try{
            if(arr[location]==Integer.MIN_VALUE){
                arr[location]=valueToBeInserted;
                System.out.println("Value is successfully Inserted.");
            } else{
                System.out.println("The cell is already Occupied.");
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access the array!");
        }
    }

    //traverse Array
    void traverseArray(){
        try{
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }catch(Exception e){
            System.out.println("Array No longer exists!");
        }
    }

    //Search for an element in Array
    public void searchInArray(int valueToSearch){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == valueToSearch){
                System.out.println("Value has been successfully found at index : " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " Value doesn't exist in the Array.");
    }

    //delete a value from the Array at a given Index
    void delete(int valueToDeleteIndex){
        try{
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("Value at index " + valueToDeleteIndex + " has been successfully deleted.");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The index value provided is not in the range of the Array.");
        }
    }
}
