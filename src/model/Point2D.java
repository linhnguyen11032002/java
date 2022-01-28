package model;

public class Point2D {
  private double x;
  private double y;

  public Point2D() {
    x = 0;
    y = 0;
  }

  public Point2D(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  @Override
  public String toString() {
    return "Point2D{x=" + x + ", y=" + y + "}";
  }

  public double distance(Point2D point2d) {
    return Math.sqrt(Math.pow(point2d.x - x, 2) + Math.pow(point2d.y - y, 2));
  }

  public Point2D opposite() {
    return new Point2D(-x, -y);
  }

  public void inc(double deltaX, double deltaY) {
    x += deltaX;
    y += deltaY;
  }
}