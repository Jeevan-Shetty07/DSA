class Solution {
    public int countPoints(String rings) {
        int count=0;
      
        for (int i = 0; i < 10; i++) {
              boolean r = false, b = false, g = false;
            for (int j = rings.length() - 1; j > 0; j -= 2) {
               char pole=rings.charAt(j),col=rings.charAt(j-1);
                if (pole == (char)i+'0') {
                    if (col == 'B')
                        b = true;
                    else if (col == 'G')
                        g = true;
                    else if (col== 'R')
                        r = true;

                }
            }
            // System.out.println(r+" "+g+" "+b);
            if(r && g && b){
                count++;
            }
               
           
        }
        return count;

    }
}