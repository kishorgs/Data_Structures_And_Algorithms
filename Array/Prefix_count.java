class Prefix_count {
    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        String[] words = { "attend", "attachment", "approve", "remove" };
        String pref = "att";
        System.out.println(prefixCount(words, pref));
    }
}
