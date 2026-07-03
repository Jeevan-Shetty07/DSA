class Solution {
    public int countPoints(String rings) {
        int count=0;
        boolean r = false, b = false, g = false;
        for (int i = 0; i < 10; i++) {
            for (int j = rings.length() - 1; j > 0; j -= 2) {
                //  System.out.println(rings.charAt(j-1)+" "+rings.charAt(j)+" "+i);
                if (rings.charAt(j) == (char)i+'0') {
                    if (rings.charAt(j - 1) == 'B')
                        b = true;
                    else if (rings.charAt(j - 1) == 'G')
                        g = true;
                    else if (rings.charAt(j - 1) == 'R')
                        r = true;

                }
            }
            // System.out.println(r+" "+g+" "+b);
            if(r && g && b){
                count++;
            }
                r=false;
                g=false;
                b=false;
           
        }
        return count;

    }
}