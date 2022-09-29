package 정렬;

import java.util.Arrays;

public class Selection {

    public static void main(String[] args) {

        /**
         *
         * 정렬 알고리즘
         * - 데이터 무작위로 있을 경우
         * - 가장 작은 데이터를 선택해 맨 앞의 데이터와 변경
         * - 그 다음 작은 데이터를 선택해 앞에서 두 번째 데이터와 바꾸는 과정을 반복
         */

        int [] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        int minIndex = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){

                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }

}
