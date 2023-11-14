public class Excute {
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();

        int[] randomArray = getArrray();

        stopwatch.start();

        selectionSort(randomArray);

        stopwatch.stop();

        System.out.println("The execution time of sorting 100,000 " +
                "numbers using selection sort: " + stopwatch.getElapsedTime() +
                " milliseconds");
    }

    public static int[] getArrray() {
        int[] array = new int[100000];

        for (int i =  0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100000);
        }

        return array;
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                array[minIndex] = array[i];
                array[i] = min;
            }
        }
    }
}
