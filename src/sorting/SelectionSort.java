package sorting;

public class SelectionSort{
    public SelectionSort(){
        start();
    }

    public void start(){
        long startTime = System.nanoTime();

        long endTime = System.nanoTime();
        float duration = (endTime - startTime) / 1000000;

        System.out.println("duration in ms: " + duration);
    }
}
