// Given two integer array sorted in non-decreasing order and their sizes, merge the two in the first one
// (Merge Sort, merge portion principle)

package SortingSearching1;

public class MergeSortedArray {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int left[] = new int[m];

    // copy the m portion of nums1 to left[]
    for (int i = 0; i < m; ++i)
      left[i] = nums1[i];

    int i = 0;
    int j = 0;
    int k = 0;

    while (i < m && j < n) {
      if (left[i] <= nums2[j]) {
        nums1[k] = left[i];
        i++;
      } else {
        nums1[k] = nums2[j];
        j++;
      }
      k++;
    }

    // copy remaining elements of left[]
    while (i < m) {
      nums1[k] = left[i];
      i++;
      k++;
    }

    // copy remaining elements of nums2[]
    while (j < n) {
      nums1[k] = nums2[j];
      j++;
      k++;
    }
  }


  public static void main (String[] args) {
//    int[] nums1 = {1,2,3,0,0,0};
//    int m = 3;
//
//    int[] nums2 = {2,5,6};
//    int n = 3;

    int[] nums1 = {0};
    int m = 0;

    int[] nums2 = {1};
    int n = 1;

    new MergeSortedArray().merge(nums1, m, nums2, n);

    for (int i : nums1) {
      System.out.println(i);
    }
  }

}
