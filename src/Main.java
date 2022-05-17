import sorting.*;

public class Main {
    public static void main(String[] args) {
        SORT_TYPE.BITONIC_SORT.sorter();

        grave(SORT_TYPE.BITONIC_SORT);
    }

    public static void grave(SORT_TYPE t){
        t.sorter();
    }
}

