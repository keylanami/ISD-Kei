// ORIGINALLY CODED BY KEYLA NAMIRA JOHAN 607062400065 D3IF-48-02
public class pojo implements Comparable {
    private int priority;
    private String description;


    public pojo(int aPriority, String aDescription) {
        priority = aPriority;
        description = aDescription;
    }


    public String toString(){
        return description;
    }

    public int compareTo(Object otherObject) {
        pojo other = (pojo) otherObject;

        if (priority < other.priority) return -1;
        if (priority > other.priority) return 1;
        return 0;
    }

}
