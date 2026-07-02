class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        char [] S = s.toCharArray();
        char[] T = t.toCharArray();
        Arrays.sort(S);
        Arrays.sort(T);

        int i = 0 , j = 0 ;

        while( i < S.length && j< T.length ){
            if(S[i] != T[j]) return false;
            i++;
            j++;
        }
        return true;

    }
}
