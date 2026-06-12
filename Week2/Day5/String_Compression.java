package Week2.Day5;

public class String_Compression {
    public int compress(char[] chars) {
        int n = chars.length;
        int index = 0;
        int i = 0;

        while (i < n) {
            char curr = chars[i];
            int count = 0;

            while (i < n && chars[i] == curr) {
                count++;
                i++;
            }

            chars[index++] = curr;

            if (count > 1) {
                String cnt = String.valueOf(count);

                for (char c : cnt.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
}
