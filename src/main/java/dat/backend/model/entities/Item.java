package dat.backend.model.entities;

import java.sql.Timestamp;

public class Item {

    private int ID;
    private String name;
    private boolean done;
    private Timestamp created;
    private String username;


    public Item(int ID, String name, boolean done, Timestamp created, String username) {
        this.ID = ID;
        this.name = name;
        this.done = done;
        this.created = created;
        this.username = username;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public boolean isDone() {
        return done;
    }

    public Timestamp getCreated() {
        return created;
    }

    public String getUsername() {
        return username;
    }
}
