package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public int addDigits(String input) {
        int result = 0;
        if(input == null || input.equals("")) {
            return -1;
        }
        String numbers = input.replaceAll("[^0-9.]", "");
        for (int i = 0; i < numbers.length(); i++) {
            result += Integer.parseInt(String.valueOf(numbers.charAt(i)));
        }
        return result;
    }
}
