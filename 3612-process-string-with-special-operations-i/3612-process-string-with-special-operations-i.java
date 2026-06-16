class Solution {
    public String processStr(String s) {
  
    StringBuilder result=new StringBuilder();
    
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c=='*'){
            if(result.length()>0){
             result.deleteCharAt(result.length()-1);
        }}
        else if(c=='#'){
            result.append(result.toString());
        }
        else if(c=='%'){
            result.reverse();
        }
        else{
            result.append(c);
        }
    }    
    return result.toString();
    }

    private String reverse(String str){ 
        char[] arr =str.toCharArray();
        
        int l=0;int r=arr.length-1;
        while(l<r){
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;r--;
        }
        return new String(arr);
    }
}
    