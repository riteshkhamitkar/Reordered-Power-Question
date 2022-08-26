class Solution {
    public boolean reorderedPowerOf2(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);
        
        int check =1;
        for(int i=0;i<31;i++){
            char arr2[]=String.valueOf(check).toCharArray();
            Arrays.sort(arr2);
            
            if(String.valueOf(arr2).equals(String.valueOf(arr))==true){
                return true;
            }
            check *= 2;
        }
        return false;
    }
}
