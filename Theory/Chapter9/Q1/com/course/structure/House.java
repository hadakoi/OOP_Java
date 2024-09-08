package com.course.structure;

// Class representing a house that extends Building
public class House extends Building {
  private int bedrooms; // Number of bedrooms in the house
  private int baths; // Number of bathrooms in the house

  // Constructor to initialize House with square footage, stories, bedrooms, and baths
  public House(int squareFootage, int stories, int bedrooms, int baths) {
    super(squareFootage, stories); // Call the constructor of Building to initialize inherited fields
    this.bedrooms = bedrooms;
    this.baths = baths;
  }

  // Getter for the number of bedrooms
  public int getBedrooms() {
    return bedrooms;
  }

  // Setter for the number of bedrooms
  public void setBedrooms(int bedrooms) {
    this.bedrooms = bedrooms;
  }

  // Getter for the number of bathrooms
  public int getBaths() {
    return baths;
  }

  // Setter for the number of bathrooms
  public void setBaths(int baths) {
    this.baths = baths;
  }

  // Method to display details of the house
  public void displayHouseDetails() {
    displayBuildingDetails(); // Call method from Building class to display basic building details
    System.out.println("Bedrooms: " + bedrooms);
    System.out.println("Baths: " + baths);
  }
}
