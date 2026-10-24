package edu.cvtc.java;

public class Shape {
  public static double volumeSphere(double radius) {
    if (radius < 0) {
      System.out.println("Error: Number cannot be negative.");
      return -1;
    }

    return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
  }

  public static double volumeBox(double length, double width, double height) {
    if (length < 0 || width < 0 || height < 0) {
      System.out.println("Error: Number cannot be negative.");
      return -1;
    }
    return length * width * height;
  }

  public static double volumePyramid(double length, double width, double height) {
    if (length < 0 || width < 0 || height < 0) {
      System.out.println("Error: Number cannot be negative.");
      return -1;
    }
    return (length * width * height) / 3.0;
  }
}