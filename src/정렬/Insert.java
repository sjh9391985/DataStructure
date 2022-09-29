package 정렬;

import java.util.Arrays;

public class Insert {

    public static void main(String[] args) {

        /**
         * 삽입정렬
         * - 데이터를 하나씩 확인하며, 각 데이터를 적절한 위치에 삽입
         * - 선택정렬에 비해 실행시간 측면에서 효율적, 필요할 대만 위치를 변경하기에 데이터가 거의 정렬되어 있을때 효과적
         * - 항상 오름차순을 유지하는 특징이 있음.
         * - 시간복잡도: O(N²)
         */

        int []arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        /**
         * 1. 5, 7, 9, 0, 3, 1, 6, 2, 4, 8
         * 2. PASS
         * 3. 0, 5, 7, 9, 3, 1, 6, 2, 4, 8
         * 4. 0, 3, 5, 7, 9, 1, 6, 2, 4, 8
         */
        for(int i = 1; i < arr.length; i++){
            for(int j = i; j >= 1; j--){

                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
