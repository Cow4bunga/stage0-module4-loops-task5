package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int mid = sideLength / 2;
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (i != mid && j != mid) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
