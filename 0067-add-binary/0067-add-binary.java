import java.math.BigInteger; //length maximum 10000 -> over int, long

class Solution {
    public String addBinary(String a, String b) {
        BigInteger A = new BigInteger(a, 2); //binary 명시
        BigInteger B = new BigInteger(b, 2);
        return A.add(B).toString(2); //add로 sum 만들어 결과값의 이진수 반환
    }
}