package 정렬;

public class Quick {

    public static void main(String[] args) {

        /**
         * Quick 정렬
         * - 기준을 설정한 후 다음 큰 수와 작은 수를 교환한 후 리스트를 반으로 나누는 방식으로 동작함
         *
         */
        int array[] = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};

        quickSort(array, 0, array.length-1);


    }

    public static void quickSort(int array[], int start, int end){

        if(start>=end){
            return;
        }

        int pivot = start;
        int left = start+1;
        int right = end;

        while(left <= right){

            // pivot 보다 큰 데이터 찾는 경우


        }
    }

}
