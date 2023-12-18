package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * https://leetcode.com/problems/subdomain-visit-count/
 */
public class SubdomainVisitCount {
    public static List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> subdomainVisits = new HashMap<>();

        for (String cpdomain : cpdomains) {
            String[] cpdomainInfo = cpdomain.split(" ");
            StringBuilder subdomainBuilder = new StringBuilder(cpdomainInfo[1]);

            while (subdomainBuilder.length() != 0) {
                int dotIndex = subdomainBuilder.indexOf(".");
                String currentSubdomain = subdomainBuilder.toString();
                subdomainVisits.put(currentSubdomain,
                        subdomainVisits.getOrDefault(currentSubdomain, 0)
                                + Integer.valueOf(cpdomainInfo[0]));
                if (dotIndex == -1) break;
                subdomainBuilder.delete(0, dotIndex + 1);
            }
        }

        List<String> listOfSubdomainVisits = new ArrayList<>();
        for (String subdomain : subdomainVisits.keySet()) {
            StringBuilder subdomainVisitsBuilder = new StringBuilder();
            subdomainVisitsBuilder.append(subdomainVisits.get(subdomain));
            subdomainVisitsBuilder.append(" ");
            subdomainVisitsBuilder.append(subdomain);
            listOfSubdomainVisits.add(subdomainVisitsBuilder.toString());
        }

        return listOfSubdomainVisits;
    }

}
