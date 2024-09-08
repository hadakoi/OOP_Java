package com.course.structure;

// Class representing a school that extends Building
public class School extends Building {
  private int classrooms; // Number of classrooms in the school
  private String gradeLevel; // Grade level of the school (e.g., Elementary, Middle)

  // Constructor to initialize School with square footage, stories, classrooms, and grade level
  public School(int squareFootage, int stories, int classrooms, String gradeLevel) {
    super(squareFootage, stories); // Call the constructor of Building to initialize inherited fields
    this.classrooms = classrooms;
    this.gradeLevel = gradeLevel;
  }

  // Getter for the number of classrooms
  public int getClassrooms() {
    return classrooms;
  }

  // Setter for the number of classrooms
  public void setClassrooms(int classrooms) {
    this.classrooms = classrooms;
  }

  // Getter for the grade level
  public String getGradeLevel() {
    return gradeLevel;
  }

  // Setter for the grade level
  public void setGradeLevel(String gradeLevel) {
    this.gradeLevel = gradeLevel;
  }

  // Method to display details of the school
  public void displaySchoolDetails() {
    displayBuildingDetails(); // Call method from Building class to display basic building details
    System.out.println("Classrooms: " + classrooms);
    System.out.println("Grade Level: " + gradeLevel);
  }
}
