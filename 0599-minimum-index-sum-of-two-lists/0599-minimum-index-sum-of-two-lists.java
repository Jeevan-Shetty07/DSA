class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int index = 2000;
        int pos = 0;
        String w = "";
        ArrayList<String> al = new ArrayList<>(Arrays.asList(list2));
        ArrayList<String> res = new ArrayList<>();

        for (String word : list1) {
            if (al.contains(word)) {
                int sum = pos + al.indexOf(word);
                if (index > sum) {
                    index = sum;
                    res.clear();
                    res.add(word);
                } else if (index == sum)
                    res.add(word);
            }
            pos++;
        }
        return res.toArray(new String[0]);

    }
}