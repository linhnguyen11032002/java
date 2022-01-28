package view;

import java.util.ArrayList;

import model.*;

public class App {
  public static void main(String[] args) {
    ArrayList<Complex> complexs = new ArrayList<>();
    initComplexs(complexs);
    print(complexs);

    System.out.println("AVG = " + avg(complexs));
    System.out.println("MAX = " + maxModulus(complexs));
    System.out.println(countComplex(complexs));
  }

  public static void initComplexs(ArrayList<Complex> complexs) {
    complexs.add(new Complex(1, 1));
    complexs.add(new Complex(2, 2));
    complexs.add(new Complex(3, 3));
    complexs.add(new Complex(4, 4));
    complexs.add(new Complex(5, 5));
  }

  public static void print(ArrayList<Complex> complexs) {
    for (Complex i : complexs) {
      System.out.println(i);
    }
  }

  public static Complex avg(ArrayList<Complex> complexs) {
    Complex result = new Complex(0, 0);
    for (Complex i : complexs) {
      result = result.add(i);
    }
    result.setA(result.getA() / complexs.size());
    result.setB(result.getB() / complexs.size());
    return result;
  }

  public static double maxModulus(ArrayList<Complex> complexs) {
    double max = 0;
    for (Complex i : complexs) {
      if (i.mudulus() > max) {
        max = i.mudulus();
      }
    }
    return max;
  }

  public static int countComplex(ArrayList<Complex> complexs) {
    int count = 0;
    for (Complex i : complexs) {
      if (i.getB() == 0) {
        count++;
      }
    }
    return count;
  }
}
