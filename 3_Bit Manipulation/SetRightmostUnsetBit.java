public class SetRightmostUnsetBit {
    public static int setRightmostUnsetBit(int num) {
        return num | (num + 1);
    }

    public static void main(String[] args) {
        int num = 18; // 10010 → set rightmost unset bit → 10011 (19)
        System.out.println("After setting rightmost unset bit: " + setRightmostUnsetBit(num));
    }
}
