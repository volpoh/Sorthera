package sorting;

import sorting.*;

public enum SORT_TYPE{
    SELECTION_SORT{ public Object sorter(){ return new SelectionSort(); } },
    BUBBLE_SORT{ public Object sorter(){ return new BubbleSort(); } },
    RECURSIVE_BUBBLE_SORT{ public Object sorter(){ return new RecursiveBubbleSort(); } },
    INSERTION_SORT{ public Object sorter(){ return new InsertionSort(); } },
    MERGE_SORT{ public Object sorter(){ return new MergeSort(); } },
    QUICK_SORT{ public Object sorter(){ return new QuickSort(); } },
    HEAP_SORT{ public Object sorter(){ return new HeapSort(); } },
    RECURSIVE_INSERTION_SORT{ public Object sorter(){ return new RecursiveInsertionSort(); } },
    ITERATIVE_MERGE_SORT{ public Object sorter(){ return new IterativeMergeSort(); } },
    ITERATIVE_QUICK_SORT{ public Object sorter(){ return new IterativeQuickSort(); } },
    COUNTING_SORT{ public Object sorter(){ return new CountingSort(); } },
    RADIX_SORT{ public Object sorter(){ return new RadixSort(); } },
    BUCKET_SORT{ public Object sorter(){ return new BucketSort(); } },
    SHELLSORT{ public Object sorter(){ return new ShellSort(); } },
    TIMSORT{ public Object sorter(){ return new TimSort(); } },
    COMB_SORT{ public Object sorter(){ return new CombSort(); } },
    PIGEONHOLE_SORT{ public Object sorter(){ return new PigeonholeSort(); } },
    CYCLE_SORT{ public Object sorter(){ return new CycleSort(); } },
    COCKTAIL_SORT{ public Object sorter(){ return new CocktailSort(); } },
    STRAND_SORT{ public Object sorter(){ return new StrandSort(); } },
    BITONIC_SORT{ public Object sorter(){ return new BitonicSort(); } },
    PANCAKE_SORTING{ public Object sorter(){ return new PancakeSorting(); } },
    BINARY_INSERTION_SORT{ public Object sorter(){ return new BinaryInsertionSort(); } },
    BOGOSORT{ public Object sorter(){ return new BogoSort(); } },
    PERMUTATION_SORT{ public Object sorter(){ return new BogoSort(); } },
    SLEEP_SORT{ public Object sorter(){ return new SleepSort(); } },
    THE_KING_OF_LAZINESS{ public Object sorter(){ return new SleepSort(); } },
    SORTING_WHILE_SLEEPING{ public Object sorter(){ return new SleepSort(); } },
    GNOME_SORT{ public Object sorter(){ return new GnomeSort(); } },
    STOOGE_SORT{ public Object sorter(){ return new StoogeSort(); } },
    TAG_SORT{ public Object sorter(){ return new TagSort(); } },
    TREE_SORT{ public Object sorter(){ return new TreeSort(); } },
    CARTESIAN_TREE_SORTING{ public Object sorter(){ return new CartesianTreeSort(); } },
    BRICK_SORT { public Object sorter(){ return new BrickSort(); } },
    ODD_EVEN_SORT{ public Object sorter(){ return new BrickSort(); } },
    THREE_WAY_QUICKSORT{ public Object sorter(){ return new ThreeWayQuickSort(); } },
    THREE_WAY_MERGE_SORT{ public Object sorter(){ return new ThreeWayMergeSort(); } };

    public abstract Object sorter();
}