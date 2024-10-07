
public class Indigo {
    String id;
    String name;
    String source;
    String destination;

    Indigo(String id, String name, String source, String destination) {
        this.id = id;
        this.name = name;
        this.source = source;
        this.destination = destination;
    }

    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", source=" + this.source + ", destination="
                + this.destination + " ]";
    }

}
