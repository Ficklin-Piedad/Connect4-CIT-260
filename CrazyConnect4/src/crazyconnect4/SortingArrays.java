package crazyconnect4;

/**
 *
 * @author henrydiazlds
 */
public class SortingArrays {

    public void AlgorithmQuickSort(int[] array) {
        array = quicksort1(array);
    }//end AlgorithmQuickSort

    public int[] quicksort1(int nums[]) {
        return quicksort2(nums, 0, nums.length - 1);
    }// end quicksort1

    public int[] quicksort2(int nums[], int izq, int der) {
        if (izq >= der) {
            return nums;
        }
        int i = izq, d = der;

        if (izq != der) {
            int pivot;
            int aux;
            pivot = izq;
            while (izq != der) {
                while (nums[der] >= nums[pivot] && izq < der) {
                    der--;
                }
                while (nums[izq] < nums[pivot] && izq < der) {
                    izq++;
                }

                if (der != izq) {
                    aux = nums[der];
                    nums[der] = nums[izq];
                    nums[izq] = aux;
                }
            }
            if (izq == der) {
                quicksort2(nums, i, izq - 1);
                quicksort2(nums, izq + 1, d);
            }
        } else {
            return nums;
        }
        return nums;

    }
}
