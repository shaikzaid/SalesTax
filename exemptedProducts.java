package dsaProblems;

import java.util.Arrays;
import java.util.List;

public class exemptedProducts {
    private static final List<String> exemptedProducts = Arrays.asList(
            "book",
            "medicine",
            "food",
            "chocolates",
            "box of chocolate",
            "chocolate bar",
            "box of chocolates",
            "packet of headache pills"
    );

    public static boolean isExempted(String productName) {
        for (String exemptedProduct : exemptedProducts) {
            if (productName.contains(exemptedProduct)) {
                return true;
            }
        }
        return false;
    }
}
