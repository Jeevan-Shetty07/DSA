class Solution {
    public double angleClock(int hour, int minutes) {
          double minangle=((double)minutes/5d)*30;
          double hours=(double)hour*30d>=360d?360-(double)hour*30d:(double)hour*30d;
          double hourangle=hours+(minutes*0.5d);
          if(Math.abs(minangle-hourangle)<360d-Math.abs(minangle-hourangle)){
            return  Math.abs(minangle-hourangle);
          }else{
            return 360d-Math.abs(minangle-hourangle);
          }
        //  return 0;
    }
}