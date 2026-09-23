class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Set<String> supplie = new HashSet<>();
        for (String s : supplies) {
            supplie.add(s);
        }
        List<String> res = new ArrayList<>();
        boolean change = true;
        while (change) {
            change = false;
            for (int i = 0; i < recipes.length; i++) {
                String recipe = recipes[i];
                if(recipe=="") continue;
                boolean isThere = true;
                for (String ing : ingredients.get(i)) {
                    if (!supplie.contains(ing)) {
                        isThere = false;
                        break;
                    }
                }
                if (isThere) {
                    res.add(recipe);
                    supplie.add(recipe);
                    change = true;
                    recipes[i]="";
                }

            }
        }
        return res;
    }
}