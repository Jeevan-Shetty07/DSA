/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int first=1,end=n,bd=-1;
        while(first<=end){
           int mid = first + (end - first) / 2;

            if(isBadVersion(mid)){
                 bd=mid;
                 end=mid-1;
            }else{
                first=mid+1;
            }
        }
        return bd;
    }
}