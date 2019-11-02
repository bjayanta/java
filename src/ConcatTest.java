public class ConcatTest {

    public static void main(String[] args) {
        // string variable
        String firstName = "Jayanta",
                lastName = " Biswas";

        // concat two string
        System.out.println(firstName + lastName);

        // concat two string using StringBuilder
        String fullname = (new StringBuilder()).append(firstName).append(lastName).toString();
        System.out.println(fullname);

        // using concat
        String testName = firstName.concat(lastName);
        System.out.println(testName);

    }

}
