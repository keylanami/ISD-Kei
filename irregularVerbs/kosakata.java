package irregularVerbs;

public class kosakata {

    private String verb;

    public kosakata(String verb) {
        this.verb = verb;
    }

    public String getVerb() {
        return verb;
    }


    @Override
    public String toString() {
        return verb;
    }
}