class Solution {
    public boolean isEven(int num){
        return num % 2 == 0;
    }

    public int numberOfSteps(int num) {
        int temp = num;
        int count = 0;

        while(temp != 0){
            if(isEven(temp)){
                temp /= 2;
            }
            else{
                temp -= 1;
            }
            count++;
        }

        return count;
    }
}