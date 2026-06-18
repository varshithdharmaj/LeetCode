class Solution {
    public double angleClock(int hour, int minutes) {
       
        double ans= Math.abs(angh(hour,minutes)%360-angle(minutes));

        return ans<180 ? ans:360-ans;
    }

    private double angle(int line){
        
        return (line*6)%360;
    }
    private double angh(int hr,int m){
        return(hr*30)+(m*0.5);
    }
}