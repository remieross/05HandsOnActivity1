import java.util.Scanner;

public class BloodBank {
    // Private instance variables
    private String bloodType;
    private String rhFactor;

    // Setter method for blood type
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
    
    // Setter method for Rh factor
    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    // Getter method for blood type
    public String getBloodType() {
        return bloodType;
    }

    // Getter method for Rh factor
    public String getRhFactor() {
        return rhFactor;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        BloodBank bloodBank = new BloodBank();
        
        // Accept user input for blood type
        System.out.print("Enter blood type of patient (A, B, AB, O): ");
        String bloodType = input.nextLine().trim();
        bloodBank.setBloodType(bloodType);
        
        // Accept user input for Rhesus factor
        System.out.print("Enter the Rhesus factor (+ or -): ");
        String rhFactor = input.nextLine().trim();
        bloodBank.setRhFactor(rhFactor); 
        
        // Display the values using getter methods
        System.out.println(bloodBank.getBloodType() + " " + bloodBank.getRhFactor() + " is added to the blood bank.");

        input.close();
    }
}
