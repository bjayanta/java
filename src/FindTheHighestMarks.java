public class FindTheHighestMarks {

    public static void main(String[] args) {
        String[] name = {"Piyal", "Adnan", "Shahin", "Joy", "Sadik"};
        int[] bangla = {40, 42, 33, 0, 50};
        int[] english = {50, 45, 35, 49, 45};
        int[] math = {45, 50, 35, 0, 0};

        int max = 0;
        int maxIndex = 0;
        int min = 0;
        int minIndex = 0;

        for (int i = 0; i < name.length; i++) {

            int totalMarks = bangla[i] + english[i] + math[i];

            if(totalMarks >= max){
                max = totalMarks;
                maxIndex = i;
            }

            if(i == 0 || totalMarks <= min){
                min = totalMarks;
                minIndex = i;
            }

            System.out.println(name[i] + "'s total marks is " + totalMarks);
        }

        System.out.println("\n===============================\n");

        System.out.println(name[maxIndex] + " got highest mark (" + max + ")");

        System.out.println("\n===============================\n");

        System.out.println(name[minIndex] + " got lowest mark (" + min + ")");

    }
}
