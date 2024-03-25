package pckg_arrays;

import java.util.Arrays;

public class TestArr {


    public static void main(String[] args) {

        int[] arr = AUX_CLS.populateArrayRand(5);
        System.out.println(Arrays.toString(arr));
        AUX_CLS.listIntArray(arr);
//        int[] arrNew = AUX_CLS.userPopulatedArray(5);
//        AUX_CLS.listIntArray(arrNew);
//        String[] strArr = {"Vasa", "vasa plurimum", "sonant"};
//        String linked = AUX_CLS.linkStringsUsingJoin(strArr);
//        System.out.println(linked);
//        String sbLinked = AUX_CLS.linkUsingStringBuilder(strArr);
//        System.out.println(sbLinked);
//        String con = AUX_CLS.concatenateArrayElements(strArr);
//        System.out.println(con);
        int [][] arr2d = AUX_CLS.gen2dIntArray(3,4);
        System.out.println(Arrays.deepToString(arr2d));
        AUX_CLS.list2dArray(arr2d);
    }


}
