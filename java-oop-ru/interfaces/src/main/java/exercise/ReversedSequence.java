package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private final CharSequence original;

    public ReversedSequence(CharSequence original) {
        this.original = original;
    }

    @Override
    public int length() {
        return original.length();
    }

    @Override
    public char charAt(int index) {
        return original.charAt(original.length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        int reversedStart = original.length() - end;
        int reversedEnd = original.length() - start;
        return new ReversedSequence(original.subSequence(reversedStart, reversedEnd));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(length());
        for (int i = 0; i < length(); i++) {
            sb.append(charAt(i));
        }
        return sb.toString();
    }
}
// END
