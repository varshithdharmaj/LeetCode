class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int number=0;
        int l=0;int r=0;
        while(l!=g.length&&r!=s.length){
            if(g[l]<=s[r]){
                number++;
                l++;r++;
            }
            else if(g[l]>s[r]){r++;}
        }return number;
        
    }
}