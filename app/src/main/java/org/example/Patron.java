public class Patron {
    private String name;
    private String patronID;

    //patron constructor
    public Patron(String name, String patronID) {
        this.name = name;
        this.patronID = patronID;
    }

    //assigning getters
    public String getName() {
        return name;
    }
    
    public String getPatronID() {
        return patronID;
    }
}