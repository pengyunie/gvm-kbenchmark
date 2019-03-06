// This program bubble sorts an array passed as input from the standard
// console (first its length, then its elements).  It reads and prints
// each elements, then it prints the entire array sorted.

import java.util.*;

class main {
  Scanner scanner = new Scanner(System.in);
  int[] v = new int[30];

  void bubbleSort(int n) {
    int t;
    boolean sorted = false;
    while(!sorted) {
      sorted = true;
      for (int y = 0; y < n - 1; ++y) {
        if (v[y] > v[y+1]) {
          t = v[y];
          v[y] = v[y+1];
          v[y+1] = t;
          sorted = false;
        }
      }
    }
  }

  main(String[] args) {
    System.out.print("Length of array = ");
    int x = scanner.nextInt();
    System.out.print("Input each of the "); System.out.print(x); System.out.println(" elements of the array");
    for (int y = 0; y<x; ++y) {
      System.out.print("Element "); System.out.print(y); System.out.print(" = ");
      v[y] = scanner.nextInt();
    }
    System.out.print("Sorting the array using bubble sort ... ");
    bubbleSort(x);
    System.out.println("Done!");
    System.out.println("Below is the sorted sequence:");
    for (int y = 0; y<x; ++y) {
      System.out.print("Element "); System.out.print(y); System.out.print(" = "); System.out.println( v[y]);
    }
    System.out.println("Done!");
  }
}

public class bubble {
  public static void main(String[] args) {
    new main(args);
  }
}

