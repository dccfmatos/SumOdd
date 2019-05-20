public class SumOdd {

    public static boolean isOdd(int number){


        if (number <= 0){
            return false;
        } else if (number % 2 != 0){
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end){

        int sum = 0;

        if(end < 0 || end <start || start < 0){

            return -1;
        }

        for (start = start; start <= end; start++) {
            if (isOdd(start)) {
                sum = sum + start;
            }
        }

        return sum;
    }
}
