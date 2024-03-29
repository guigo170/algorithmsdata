import java.util.Arrays;

public class TwoSumFast {
  
  // print distinct pairs (i, j) such that a[i] + a[j] = 0
  public static void printAll(int[] a) {
    int N = a.length;
    Arrays.sort(a);
    for (int i = 0; i < N; i++) {
      int j = Arrays.binarySearch(a, -a[i]);
      if (j > i) StdOut.println(a[i] + " " + a[j]);
    }
  } 
  
  // return number of distinct pairs (i, j) such that a[i] + a[j] = 0
  public static int count(int[] a) {
    int N = a.length;
    Arrays.sort(a);
    int cnt = 0;
    for (int i = 0; i < N; i++) {
      int j = Arrays.binarySearch(a, -a[i]);
      if (j > i) cnt++;
    }
    return cnt;
  } 
  
  public static void main(String[] args)  { 
    In in = new In(args[0]);
    int[] a = in.readAllInts();
    int cnt = count(a);
    StdOut.println(cnt);
  } 
} 