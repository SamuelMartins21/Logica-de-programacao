public class Proverb {
        private String[] words;
        private final String frase1 = "For want of a ";
        private final String frase2 = " the ";
        private final String frase3 = " was lost.";
        private final String frase4 = "And all for the want of a ";

        public Proverb(String[] words) {
            this.words = words;
        }

        public String recite() {
            String frasefinal = "";
            int cc = 0;
            for (int i = 0; i < this.words.length; i++) {
                cc = i;
                if (cc < this.words.length - 1 == true) {
                    frasefinal += frase1 + this.words[i];
                    frasefinal += frase2 + this.words[++cc] + frase3 + "\n";
                } else {
                    frasefinal += frase4 + this.words[0] + ".";
                }
            }
            return frasefinal;
        }

        public String[] getWords() {
            return words;
        }

        public void setWords(String[] words) {
            this.words = words;
        }

        public String getFrase1() {
            return frase1;
        }

        public String getFrase2() {
            return frase2;
        }

        public String getFrase3() {
            return frase3;
        }

        public String getFrase4() {
            return frase4;
        }

}
