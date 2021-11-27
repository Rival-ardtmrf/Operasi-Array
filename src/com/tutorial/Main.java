package com.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        //Sorting array terbalik (cara ke-1)
        int[] arrayAngka1 = {1,2,4,3,5,7,6};
        printArray(arrayAngka1);
        System.out.println("======================");
        System.out.println("Sorting array terbalik");
        Arrays.sort(arrayAngka1);
        for(int i=arrayAngka1.length-1; i>=0; i--){
            System.out.println(arrayAngka1[i]);
        }

        //Cara ke-2
        int[] newArray = new int[arrayAngka1.length];
        for(int a=0; a<arrayAngka1.length; a++){
            newArray[a] = arrayAngka1[(arrayAngka1.length-(a+1))];
        }
        printArray(newArray);
        System.out.println("\n");

        //Operasi tambah antara dua buah array
        System.out.println("Penjumlahan dua buah array");
        int[] arrayAngka2 = {2,3,4,5,6};
        int[] arrayAngka3 = {1,2,3,4,5};
        tambahArray(arrayAngka2,arrayAngka3);
        System.out.println("\n");

        //Menggabungkan dua buah array
        System.out.println("Menggabungkan dua buah array");
        int[] arrayAngka4 = {1,2,3,4,5};
        int[] arrayAngka5 = {6,7,8,9,10};
        gabungDuaArray(arrayAngka4,arrayAngka5);

    }
    private static void gabungDuaArray(int[] array1, int[] array2){
        int[] jumlahArray = new int[array1.length + array2.length];

        for(int i=0; i<(array1.length+array2.length); i++){
            if(i<array1.length){
                jumlahArray[i] = array1[i];
            }else if(i>=array2.length){
                jumlahArray[i] = array2[i- array2.length];
            }
        }
        System.out.println(Arrays.toString(jumlahArray));
    }
    private static void tambahArray(int[] dataArray1, int[] dataArray2){
        int[] hasil = new int[5];
        System.out.println(Arrays.toString(dataArray1));
        System.out.println(Arrays.toString(dataArray2));

        System.out.println("--------[+]--------");
        for(int i=0; i<dataArray1.length; i++){
            hasil[i] = dataArray1[i] + dataArray2[i];
        }

        System.out.println(Arrays.toString(hasil));
    }
    private static void printArray(int[] dataArray){
        System.out.println("arrays = "+Arrays.toString(dataArray));
    }
}
