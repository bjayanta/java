public class ConcatStringArray {

    public static void main(String[] args) {

        String[] firstNameArray = {"Shibbir", "Sadik", "Mubarak", "Sagor"};
        String[] lastNameArray = {"Ahmed", "Hasan", "Hossain", "Biswas"};

        for(int i = 0; i < firstNameArray.length; i++){
            System.out.println(firstNameArray[i] + " " + lastNameArray[i]);
        }
    }
}
