package testapp1.leet;

/**
 * Created by bao on 2018/6/6.
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        if(len == 1){
            if(digits[0] ==9){
                return new int[]{1,0};
            }else{
                int[] a = new int[1];
                a[0] = digits[0]+1;
                return a;
            }
        }

        int index = len -1;

        while(index >= 0 && digits[index] == 9){
            index --;
        }

        int[] newArr;
        if(index == -1){
            newArr = new int[len + 1];
            for(int i = 1; i< len+1;i++){
                newArr[i] = 0;
            }
            newArr[0] = 1;
        }else{
            newArr = new int[len];
            for(int i = 0;i < index;i++){
                newArr[i] = digits[i];
            }
            newArr[index] = digits[index]+1;
            for(int j = index+1; j < len; j++){
                newArr[j] = 0;
            }

        }

        return newArr;
    }

    public int[] plusOne2(int[] digits) {

        boolean allNine = true;
        int length =digits.length;

        for(int i=digits.length-1; i >=0; i--){
            if(digits[i]!=9){
                digits[i]++;
                allNine = false;
                break;
            }else{
                digits[i]=0;
            }





        }

        if(allNine){
            int[] result = new int[length+1];
            result[0]=1;
            for(int i=1;i<=length;i++){
                result[i]=0;
            }
            return result;
        }



        return digits;

    }
}
