package com.course.structure;

// Class representing a generic building with basic attributes
public class Building {
  private int squareFootage; // Square footage of the building
  private int stories; // Number of stories (floors) in the building

  // Constructor to initialize Building object with square footage and number of stories
  public Building(int squareFootage, int stories) {
    this.squareFootage = squareFootage;
    this.stories = stories;
  }

  // Getter for square footage
  public int getSquareFootage() {
    return squareFootage;
  }

  // Setter for square footage
  public void setSquareFootage(int squareFootage) {
    this.squareFootage = squareFootage;
  }

  // Getter for the number of stories
  public int getStories() {
    return stories;
  }

  // Setter for the number of stories
  public void setStories(int stories) {
    this.stories = stories;
  }

  // Method to display details of the building
  public void displayBuildingDetails() {
    System.out.println("Square Footage: " + squareFootage);
    System.out.println("Stories: " + stories);
  }
}
