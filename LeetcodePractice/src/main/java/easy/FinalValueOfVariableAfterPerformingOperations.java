package easy;

public class FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int value = 0;
        for (String operation : operations) {
            if (operation.contains("-")) value--;
            else value++;
        }
        return value;
    }
}
