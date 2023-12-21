package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/search-suggestions-system/
 */
public class SearchSuggestionsSystem {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> suggestedProducts = new ArrayList<>();
        Arrays.sort(products);

        for (int i = 0; i < searchWord.length(); i++) {
            List<String> commonPrefixProducts = new ArrayList<>();
            for (String product : products) {
                if (commonPrefixProducts.size() == 3) break;
                if (product.startsWith(searchWord.substring(0, i + 1))) {
                    commonPrefixProducts.add(product);
                }
            }
            suggestedProducts.add(commonPrefixProducts);
        }
        return suggestedProducts;
    }
}
