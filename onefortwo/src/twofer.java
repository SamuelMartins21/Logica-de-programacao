public class twofer {

    public String shareWith(String name) {
        if (name == null) {
            return "One for you, one for me.";
        } else {
            return "One for " + name + ", one for me.";
        }
    }
}
