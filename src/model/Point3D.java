package model;

public class Point3D extends Point2D {
  private double z;

  public Point3D() {
    super(0, 0);
    z = 0;
  }

  public Point3D(double x, double y, double z) {
    super(x, y);
    this.z = z;
  }

  public double getZ() {
    return z;
  }

  public void setZ(double z) {
    this.z = z;
  }

  public String toString() {
    return "Point3D{x=" + getX() + "y=" + getY() + "z=" + z + "}";
  }

  public double distance(Point3D point3d) {
    return Math
        .sqrt(Math.pow(super.distance(new Point2D(point3d.getX(), point3d.getY())), 2) + Math.pow(point3d.z - z, 2));
  }

  public Point3D opposite() {
    return new Point3D(-getX(), -getY(), -z);
  }

  public void inc(double deltaX, double deltaY, double deltaZ) {
    super.inc(deltaX, deltaY);
    z += deltaZ;
  }
}