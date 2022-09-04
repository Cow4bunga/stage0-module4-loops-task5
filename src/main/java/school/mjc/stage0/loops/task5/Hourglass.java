package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int counter = height;
        int mid = height / 2;
        for (int i = 0; i < mid; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < counter; k++) {
                System.out.print(8);
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            counter -= 2;
            System.out.println();
        }

        if(height%2==0){
            counter+=2;
            for (int i = mid; i < height; i++) {
                for (int j = height - i - 1; j > 0; j--) {
                    System.out.print(" ");
                }

                for (int k = 0; k < counter; k++) {
                    System.out.print(8);
                }

                for (int j = height - i - 1; j > 0; j--) {
                    System.out.print(" ");
                }

                counter += 2;
                System.out.println();
            }
        }else {
            for (int i = mid; i < height; i++) {
                for (int j = height - i - 1; j > 0; j--) {
                    System.out.print(" ");
                }

                for (int k = 0; k < counter; k++) {
                    System.out.print(8);
                }

                for (int j = height - i - 1; j > 0; j--) {
                    System.out.print(" ");
                }

                counter += 2;
                System.out.println();
            }
        }

    }
}
