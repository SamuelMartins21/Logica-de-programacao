public class Main {
    public static void main(String[] args) throws Exception {
        String[] words = {"nail", "shoe", "horse"};
        Proverb testProverb = new Proverb(words);
        System.out.println(testProverb.recite());
        
        }
}
