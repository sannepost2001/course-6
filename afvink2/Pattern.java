package afvink2;

public class Pattern {

    private String   name;
    private String[] pattern;

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String[] getPattern() {
        return pattern;
    }

    public void setPattern(String[] pattern) {
        this.pattern = pattern;
    }

    public Pattern(String name, String[] pattern) {
        this.name = name;
        this.pattern = pattern;
    }

    public String toString() {
        return name;
    }

    //loads the example Pattern
    public static Pattern[] setPattern() {
        Pattern[] pattern = new Pattern[1];
        pattern[0] = new Pattern("Worm", new String[]{"0#0", "0##", "#0#"});
        return pattern;
    }
}