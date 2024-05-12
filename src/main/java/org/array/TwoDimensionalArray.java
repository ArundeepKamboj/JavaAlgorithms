package org.array;

public class TwoDimensionalArray {
    int[][] arr;

    //Constructor
    public TwoDimensionalArray(int numberOfRows, int numberOfColumns){
        this.arr = new int[numberOfRows][numberOfColumns];
        for(int row = 0; row<numberOfRows;row++){
            for(int column=0; column<numberOfColumns; column++){
                this.arr[row][column] = Integer.MIN_VALUE;
            }
        }
    }

    //insert elements in the array
    public void insert(int rowIIndex, int columnIndex, int value){
        try{
            if(this.arr[rowIIndex][columnIndex] == Integer.MIN_VALUE){
                this.arr[rowIIndex][columnIndex] = value;
                System.out.println("Value is inserted at row " + rowIIndex + " and column " + columnIndex);
            } else{
                System.out.println("The cell is already occupied");
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array.");
        }
    }

    //access a cell value in Array
    void accessCell(int rowIndex, int columnIndex){
        System.out.println("Access row# " + rowIndex + " and column# " + columnIndex);
        try{
            System.out.println("Cell value is : " + this.arr[rowIndex][columnIndex]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for the 2d Array.");
        }
    }

    //traverse array
    void traverse2DArray(){
        for(int row=0;row<this.arr.length; row++){
            for(int column=0; column<this.arr[0].length; column++){
                System.out.print(this.arr[row][column] + " ");
            }
            System.out.println(" ");
        }
    }

    //Searching in 2d array
    void search(int value){
        for(int row=0; row < this.arr.length; row++){
            for(int column=0; column<this.arr[0].length; column++){
                if(this.arr[row][column] == value){
                    System.out.println(value + " is found at row index " + row + " and column index " + column);
                    return;
                }
            }
        }
        System.out.println("Value not found in array.");
    }

    //Deleting a value in 2d array
    void delete(int rowIndex, int columnIndex){
        try{
            this.arr[rowIndex][columnIndex] = Integer.MIN_VALUE;
            System.out.println("Value deleted from row index : " + rowIndex + " and column index " + columnIndex);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index for the array");
        }
    }
}
