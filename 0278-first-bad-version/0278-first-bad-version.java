/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int last = n;

        while (start < last) {
            int middle = start + (last - start) / 2; //(start+last)/2 > time limit exceeded(integer 범위 초과)

            if (isBadVersion(middle)) {
                last = middle;
            } else {
                start = middle + 1;
            }
        }

        return start;
    }
}