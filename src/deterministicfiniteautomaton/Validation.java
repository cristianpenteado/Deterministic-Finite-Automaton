package deterministicfiniteautomaton;

public class Validation {

    public boolean validateAlphabet(String value) {

        boolean returnValue = true;
        char[] fragmentedValue = value.toCharArray();

        for (int i = 0; i < fragmentedValue.length; i++) {
            if (fragmentedValue[i] != '0' && fragmentedValue[i] != '1') {
                returnValue = false;
                break;
            }
        }
        return returnValue;
    }
}
