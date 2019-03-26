package deterministicfiniteautomaton;

public class Validation {

    public boolean validateAlphabet(String valor) {

        boolean returnValue = true;
        char[] fragmentedValue = valor.toCharArray();

        for (int i = 0; i < fragmentedValue.length; i++) {
            if (fragmentedValue[i] != '0' && fragmentedValue[i] != '1') {
                returnValue = false;
                break;
            }
        }
        return returnValue;
    }
}
