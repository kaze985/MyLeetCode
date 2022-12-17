class  Solution_1662{
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            builder.append(word1[i]);
        }
        String s1 = builder.toString();
        builder.delete(0, builder.length());
        for (int i = 0; i < word2.length; i++) {
            builder.append(word2[i]);
        }
        String s2 = builder.toString();
        return s1.equals(s2);
    }
}
