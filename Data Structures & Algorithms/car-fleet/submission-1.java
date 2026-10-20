class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double [][]cars= new double[speed.length][2];
        for(int i = 0;i<speed.length;i++){
            cars[i][0] = position[i];
            cars[i][1] = (double)(target-position[i])/speed[i];
        }
        Arrays.sort(cars,(a,b)->Double.compare(b[0],a[0]));
        int count = 0; double max = 0;
        for(int i = 0;i<speed.length;i++){
            if(cars[i][1]>max){
                count++;
                max = cars[i][1];
            }
        }
        return count;
    }
}
