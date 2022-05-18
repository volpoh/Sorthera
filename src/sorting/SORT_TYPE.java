package sorting;

/**
 * Enum for sorting types.
 * Tip: SORT_TYPE.getTypes() returns all the
 * avaiable sorting methods.
 *
 * @since 0.1.0
 * @author volpoh
 * @version 0.2.0
 */
public enum SORT_TYPE{
    SELECTION_SORT{
        public String getName(){ return "Selection Sort"; }
        public Object sort(){ return new SelectionSort(); }
    },
    BUBBLE_SORT{
        public String getName(){ return "Bubble Sort"; }
        public Object sort(){ return new BubbleSort(); }
    },
    RECURSIVE_BUBBLE_SORT{
        public String getName(){ return "Recursive Bubble Sort"; }
        public Object sort(){ return new RecursiveBubbleSort(); }
    },
    INSERTION_SORT{
        public String getName(){ return "Insertion Sort"; }
        public Object sort(){ return new InsertionSort(); }
    },
    MERGE_SORT{
        public String getName(){ return "Merge Sort"; }
        public Object sort(){ return new MergeSort(); }
    },
    QUICK_SORT{
        public String getName(){ return "Quick Sort"; }
        public Object sort(){ return new QuickSort(); }
    },
    HEAP_SORT{
        public String getName(){ return "Heap Sort"; }
        public Object sort(){ return new HeapSort(); }
    },
    RECURSIVE_INSERTION_SORT{
        public String getName(){ return "Recursive Insertion Sort"; }
        public Object sort(){ return new RecursiveInsertionSort(); }
    },
    ITERATIVE_MERGE_SORT{
        public String getName(){ return "Iterative Merge Sort"; }
        public Object sort(){ return new IterativeMergeSort(); }
    },
    ITERATIVE_QUICK_SORT{
        public String getName(){ return "Iterative Quick Sort"; }
        public Object sort(){ return new IterativeQuickSort(); }
    },
    COUNTING_SORT{
        public String getName(){ return "Counting Sort"; }
        public Object sort(){ return new CountingSort(); }
    },
    RADIX_SORT{
        public String getName(){ return "Radix Sort"; }
        public Object sort(){ return new RadixSort(); }
    },
    BUCKET_SORT{
        public String getName(){ return "Bucket Sort"; }
        public Object sort(){ return new BucketSort(); }
    },
    SHELL_SORT{
        public String getName(){ return "Shell Sort"; }
        public Object sort(){ return new ShellSort(); }
    },
    TIM_SORT{
        public String getName(){ return "Tim Sort"; }
        public Object sort(){ return new TimSort(); }
    },
    COMB_SORT{
        public String getName(){ return "Comb Sort"; }
        public Object sort(){ return new CombSort(); }
    },
    PIGEONHOLE_SORT{
        public String getName(){ return "Pigeonhole Sort"; }
        public Object sort(){ return new PigeonholeSort(); }
    },
    CYCLE_SORT{
        public String getName(){ return "Cycle Sort"; }
        public Object sort(){ return new CycleSort(); }
    },
    COCKTAIL_SORT{
        public String getName(){ return "Cocktail Sort"; }
        public Object sort(){ return new CocktailSort(); }
    },
    STRAND_SORT{
        public String getName(){ return "Strand Sort"; }
        public Object sort(){ return new StrandSort(); }
    },
    BITONIC_SORT{
        public String getName(){ return "Bitonic Sort"; }
        public Object sort(){ return new BitonicSort(); }
    },
    PANCAKE_SORTING{
        public String getName(){ return "Pancake Sorting"; }
        public Object sort(){ return new PancakeSorting(); }
    },
    BINARY_INSERTION_SORT{
        public String getName(){ return "Binary Insertion Sort"; }
        public Object sort(){ return new BinaryInsertionSort(); }
    },
    BOGO_SORT{
        public String getName(){ return "Bogo Sort"; }
        public Object sort(){ return new BogoSort(); }
    },
    PERMUTATION_SORT{
        public String getName(){ return "Permutation Sort"; }
        public Object sort(){ return new BogoSort(); }
    },
    SLEEP_SORT{
        public String getName(){ return "Sleep Sort"; }
        public Object sort(){ return new SleepSort(); }
    },
    THE_KING_OF_LAZINESS{
        public String getName(){ return "The King of Laziness"; }
        public Object sort(){ return new SleepSort(); }
    },
    SORTING_WHILE_SLEEPING{
        public String getName(){ return "Sorting While Sleeping"; }
        public Object sort(){ return new SleepSort(); }
    },
    GNOME_SORT{
        public String getName(){ return "Gnome Sort"; }
        public Object sort(){ return new GnomeSort(); }
    },
    STOOGE_SORT{
        public String getName(){ return "Stooge Sort"; }
        public Object sort(){ return new StoogeSort(); }
    },
    TAG_SORT{
        public String getName(){ return "Tag Sort"; }
        public Object sort(){ return new TagSort(); }
    },
    TREE_SORT{
        public String getName(){  return "Tree Sort"; }
        public Object sort(){ return new TreeSort(); }
    },
    CARTESIAN_TREE_SORTING{
        public String getName(){ return "Cartesian Tree Sorting"; }
        public Object sort(){ return new CartesianTreeSort(); }
    },
    BRICK_SORT{
        public String getName(){ return "Brick Sort"; }
        public Object sort(){ return new BrickSort(); }
    },
    ODD_EVEN_SORT{
        public String getName(){ return "Odd-Even Sort"; }
        public Object sort(){ return new BrickSort(); }
    },
    THREE_WAY_QUICKSORT{
        public String getName(){ return "3-Way Quick Sort"; }
        public Object sort(){ return new ThreeWayQuickSort(); }
    },
    THREE_WAY_MERGE_SORT{
        public String getName(){ return "3-Way Merge Sort"; }
        public Object sort(){ return new ThreeWayMergeSort(); }
    };

    public static void getTypes(){
        System.out.println("Possible Types:");
        for(SORT_TYPE type : SORT_TYPE.values()){
            System.out.println(" - " + type.getName());
        }
    }

    public abstract String getName();
    public abstract Object sort();
}