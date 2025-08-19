public class Test {

    public int maximum69Number(int num) {
        int arr[] = new int[4];
        int i = 3;
        while (num > 0) {
            arr[i--] = num % 10;
            num = num / 10;
        }
        int result = 0;
        for (i = 0; i < 4; i++) {
            if (arr[i] == 6) {
                arr[i] = 9;
                break;
            }
        }
        for (i = 0; i < 4; i++) {
            result = result * 10 + arr[i];
        }
        return result;

    }

    public boolean isPowerOfFour(int n) {
        return (n & (n - 1)) == 0 && n % 3 == 1;
    }

    public String largestGoodInteger(String num) {
        String possibles[] = { "999", "888", "777", "666", "555", "444", "333", "222", "111", "000" };
        for (String s : possibles) {
            if (num.contains(s)) {
                return s;
            }
        }
        return "";

    }

}
