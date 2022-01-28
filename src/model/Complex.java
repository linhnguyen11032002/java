package model;

public class Complex {
  private double a;
  private double b;

  public Complex() {
    a = 1;
    b = -1;
  }

  public Complex(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double getA() {
    return a;
  }

  public void setA(double a) {
    this.a = a;
  }

  public double getB() {
    return b;
  }

  public void setB(double b) {
    this.b = b;
  }

  public String toString() {
    return "Complex{" + a + " + " + b + "i}";
  }

  public Complex add(Complex complex) {
    return new Complex(a + complex.a, b + complex.b);
  }

  public double mudulus() {
    return Math.sqrt(a * a + b * b);
  }
}
