// Implement a function to find the first bad version. Linear search not possible

package SortingSearching;

public class FirstBadVersion {

  // just an example of an API isBadVersion that returns true if a version is bad
  private boolean isBadVersion(int version) {
    if (version == 9 || version == 10) {
      return true;
    }
    return false;
  }


  public int firstBadVersion(int n) {
    int left = 1;
    int right = n;

    while (right > left) {
      int mid = left + (right - left) / 2;

      if (isBadVersion(mid)) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }

    return right;
  }

}
