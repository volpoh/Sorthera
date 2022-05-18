import sorting.*;

public class Main{
    public static void main(String[] args){
        SORT_TYPE.getTypes();
        System.out.println(SORT_TYPE.SELECTION_SORT.getName());
        SORT_TYPE.SELECTION_SORT.sort();
    }
}

