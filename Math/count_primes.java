class Solution {
    public int countPrimes(int n) {
        boolean [] result = new boolean[n];
        int count=0;
            for(int i=2;i<n;i=i+1){
                if(! result[i]){
                    count ++;
                } 
                for(int j=0; i*j<n;j=j+1){
                    result[i*j]=true;
                }
        }
        return count;
        
    }
}
