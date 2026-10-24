package edu.cvtc.java;

import java.util.Scanner;

public class ShapeCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int choice = 0;
    while (choice != 4) {
      System.out.println();
      System.out.println("Shape Calculator");
      System.out.println("1. Calculate the Volume of a Sphere");
      System.out.println("2. Calculate the Volume of a Box");
      System.out.println("3. Calculate the Volume of a Pyramid");
      System.out.println("4. Exit");
      System.out.println("Enter your choice (1-4):");
      choice = input.nextInt();
      if (choice == 1) {
        System.out.println("Enter the radius of the sphere:");
        double radius = input.nextDouble();
        double sphereVolume = Shape.volumeSphere(radius);
        if (sphereVolume != -1) {
          System.out.println("The volume of the sphere is " + sphereVolume);
        }
      } else if (choice == 2) {
        System.out.println("Enter the length of the box:");
        double boxLength = input.nextDouble();
        System.out.println("Enter the width of the box:");
        double boxWidth = input.nextDouble();
        System.out.println("Enter the height of the box:");
        double boxHeight = input.nextDouble();
        double boxVolume = Shape.volumeBox(boxLength, boxWidth, boxHeight);
        if (boxVolume != -1) {
          System.out.println("The volume of the box is " + boxVolume);
        }
      } else if (choice == 3) {
        System.out.println("Enter the length of the pyramid base:");
        double pyramidLength = input.nextDouble();
        System.out.println("Enter the width of the pyramid base:");
        double pyramidWidth = input.nextDouble();
        System.out.println("Enter the height of the pyramid:");
        double pyramidHeight = input.nextDouble();
        double pyramidVolume = Shape.volumePyramid(pyramidLength, pyramidWidth, pyramidHeight);
        if (pyramidVolume != -1) {
          System.out.println("The volume of the pyramid is " + pyramidVolume);
        }
      } else if (choice == 4) {
        System.out.println("Exiting Shape Calculator.");
      } else {
        System.out.println("Error: Please enter a number from 1 through 4.");
      }
    }
    input.close();
  }
}