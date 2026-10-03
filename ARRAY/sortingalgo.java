import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortingalgo {
    public static void main(String[]args ){
        int [] nums ={5,6,3,8,2};
        Arrays.sort(nums);
        System.out.println("sorted array"+ Arrays.toString(nums));
       List<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 8, 1));
        Collections.sort(list);
        System.out.println("sorted arry"+ list);


    }
    
}
