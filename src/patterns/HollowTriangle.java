package patterns;

public class HollowTriangle {


    public static void main(String[] args) {
        // size of the pyramid
        int size = 5;
        for (int  i = 0; i < size; i++) {
            // print spaces eita hoche left side reverse triangle logic
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print("Q");
            }
            // print stars for every line from 2nd row there are always 2 stars left side and right side
            for (int k = 0; k < 2 * i + 1; k++) {
                if (i == 0 || i == size - 1) { // eita hoche first and last row "*" print korche
                    System.out.print("*");
                }
                else {
                    if (k == 0 || k == 2 * i) {
                        System.out.print("*"); // eita te middle rows er line 2 "*" each row te print korche
                    }
                    else {
                        System.out.print("H"); // inner spaces print korchi
                    }
                }
            }
            System.out.println(); // eita hoche next line
        }
    }
}
