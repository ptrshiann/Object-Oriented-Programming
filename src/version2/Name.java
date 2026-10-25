/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

public class Name {

    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;

 
    public Name() {
        this.firstName = "N/A";
        this.middleName = "N/A";
        this.lastName = "N/A";
        this.suffix = "";
    }


    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.middleName = "";
        this.lastName = lastName;
        this.suffix = "";
    }

 
    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = "";
    }

  
    public Name(String firstName, String middleName,
                String lastName, String suffix) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

  
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSuffix() {
        return suffix;
    }


    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.trim().isEmpty()) {
            this.firstName = firstName;
        }
    }

    public void setMiddleName(String middleName) {
        if (middleName != null) {
            this.middleName = middleName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null && !lastName.trim().isEmpty()) {
            this.lastName = lastName;
        }
    }

    public void setSuffix(String suffix) {
        if (suffix != null) {
            this.suffix = suffix;
        }
    }


    public void displayName() {
        System.out.println("Name: " + toString());
    }

    
    @Override
    public String toString() {

        String result = lastName + ", " + firstName;

        if (middleName != null && !middleName.trim().isEmpty()
                && !middleName.equals("N/A")) {

            result += " " + middleName.charAt(0) + ".";
        }

        if (suffix != null && !suffix.trim().isEmpty()) {
            result += " " + suffix;
        }

        return result;
    }
}
