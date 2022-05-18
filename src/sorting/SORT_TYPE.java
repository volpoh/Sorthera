package sorting;

import org.apache.commons.lang.WordUtils;

/**
 * <h2>Enum for sorting types.</h2>
 * <p>{@code SORT_TYPE.getTypes()} returns all the
 * avaiable sorting methods.</p>
 *
 * @since 0.1.0
 * @author volpoh
 * @version 0.2.0
 */
public enum SORT_TYPE{
    SELECTION_SORT{
        public Object sort(){ return new SelectionSort(); }
    },
    BUBBLE_SORT{
        public Object sort(){ return new BubbleSort(); }
    },
    RECURSIVE_BUBBLE_SORT{
        public Object sort(){ return new RecursiveBubbleSort(); }
    },
    INSERTION_SORT{
        public Object sort(){ return new InsertionSort(); }
    },
    MERGE_SORT{
        public Object sort(){ return new MergeSort(); }
    },
    QUICK_SORT{
        public Object sort(){ return new QuickSort(); }
    },
    HEAP_SORT{
        public Object sort(){ return new HeapSort(); }
    },
    RECURSIVE_INSERTION_SORT{
        public Object sort(){ return new RecursiveInsertionSort(); }
    },
    ITERATIVE_MERGE_SORT{
        public Object sort(){ return new IterativeMergeSort(); }
    },
    ITERATIVE_QUICK_SORT{
        public Object sort(){ return new IterativeQuickSort(); }
    },
    COUNTING_SORT{
        public Object sort(){ return new CountingSort(); }
    },
    RADIX_SORT{
        public Object sort(){ return new RadixSort(); }
    },
    BUCKET_SORT{
        public Object sort(){ return new BucketSort(); }
    },
    SHELL_SORT{
        public Object sort(){ return new ShellSort(); }
    },
    TIM_SORT{
        public Object sort(){ return new TimSort(); }
    },
    COMB_SORT{
        public Object sort(){ return new CombSort(); }
    },
    PIGEONHOLE_SORT{
        public Object sort(){ return new PigeonholeSort(); }
    },
    CYCLE_SORT{
        public Object sort(){ return new CycleSort(); }
    },
    COCKTAIL_SORT{
        public Object sort(){ return new CocktailSort(); }
    },
    STRAND_SORT{
        public Object sort(){ return new StrandSort(); }
    },
    BITONIC_SORT{
        public Object sort(){ return new BitonicSort(); }
    },
    PANCAKE_SORTING{
        public Object sort(){ return new PancakeSorting(); }
    },
    BINARY_INSERTION_SORT{
        public Object sort(){ return new BinaryInsertionSort(); }
    },
    BOGO_SORT{
        public Object sort(){ return new BogoSort(); }
    },
    PERMUTATION_SORT{
        public Object sort(){ return new BogoSort(); }
    },
    SLEEP_SORT{
        public Object sort(){ return new SleepSort(); }
    },
    THE_KING_OF_LAZINESS{
        public Object sort(){ return new SleepSort(); }
    },
    SORTING_WHILE_SLEEPING{
        public Object sort(){ return new SleepSort(); }
    },
    GNOME_SORT{
        public Object sort(){ return new GnomeSort(); }
    },
    STOOGE_SORT{
        public Object sort(){ return new StoogeSort(); }
    },
    TAG_SORT{
        public Object sort(){ return new TagSort(); }
    },
    TREE_SORT{
        public Object sort(){ return new TreeSort(); }
    },
    CARTESIAN_TREE_SORTING{
        public Object sort(){ return new CartesianTreeSort(); }
    },
    BRICK_SORT{
        public Object sort(){ return new BrickSort(); }
    },
    ODD_EVEN_SORT{
        public Object sort(){ return new BrickSort(); }
    },
    THREE_WAY_QUICKSORT{
        public Object sort(){ return new ThreeWayQuickSort(); }
    },
    THREE_WAY_MERGE_SORT{
        public Object sort(){ return new ThreeWayMergeSort(); }
    };

    public static void getTypes(){
        System.out.println("Possible Types:");
        for(SORT_TYPE type : SORT_TYPE.values()){
            System.out.println(" - " + type.getName());
        }
    }

    public String getName(){
        return WordUtils.capitalizeFully(this.name().replace("_", " "));
    }

    public abstract Object sort();
}