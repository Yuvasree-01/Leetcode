class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int m =Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            m = Math.max(m,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            if(extraCandies+candies[i]>=m){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}