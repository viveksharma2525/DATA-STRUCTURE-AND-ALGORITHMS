
/*
 Q:1 Every element occurs twice except for one. Find unique element
 note: Duplicates on adjacent to each other
 */
public class uniqueElement {
    public static void main(String[] args) {
        int[] array = {3,3,1,1,8,8,10,10,19,6,6,2,2,4,4};

        int result = noDuplicate(array);
        System.out.println(result);
    }
    private static int noDuplicate(int[] array){
        //initalize the search space
        int n = array.length;
        int low = 0;
        int high = n-1;

        if (n==1){
            return 0;
        }
        else if(array[0]<array[1]){
            return 0;
        }
        else if(array[n-1]<array[n-2]){
            return -1;
        }

        while(low<=high){
            int mid = (low+high)/2;

            if(array[mid-1]!=array[mid] && array[mid+1]!=array[mid]){
                return array[mid];
            }

            //If mid is even unique element is lie on right side
            if (mid % 2 == 0){
                if(mid+1<n && array[mid] == array[mid+1]){
                    low = mid +2;
                }
                else{
                    high = mid -1;
                }
            }
            else{
                if (mid>0 && array[mid] == array[mid-1]){
                    low = mid+1;
                }
                else{
                    high = mid;
                }
            }
        }

        return -1;
    }
}
