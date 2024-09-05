package com.course.structure;

public class House extends Building {
  private int bedrooms;
  private int baths;

  public House(int squareFootage, int stories, int bedrooms, int baths) {
    super(squareFootage, stories); 
    this.bedrooms = bedrooms;
    this.baths = baths;
  }

  public int getBedrooms() {
    return bedrooms;
  }

  public void setBedrooms(int bedrooms) {
    this.bedrooms = bedrooms;
  }

  public int getBaths() {
    return baths;
  }

  public void setBaths(int baths) {
    this.baths = baths;
  }

  public void displayHouseDetails() {
    displayBuildingDetails(); 
    System.out.println("Bedrooms: " + bedrooms);
    System.out.println("Baths: " + baths);
  }
}
