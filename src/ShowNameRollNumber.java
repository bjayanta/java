public class ShowNameRollNumber {
    public static void main(String[] args) {
        String[] names = {"Shibbir", "Joy", "Baky", "Adnan", "Piyal", "Sadik"};
        int[] rolls = {1, 2, 3, 4, 5, 6};
        int[] marks = {200, 300, 150, 140, 140, 160};

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i] + "'s roll number is " + rolls[i] + " and marks is " + marks[i]);
        }
    }
}