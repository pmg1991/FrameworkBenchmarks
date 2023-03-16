package pmg.model;

/**
 * @author noear 2023/2/13 created
 */
public final class Fortune {
    public int id;
    public String message;

    public Fortune(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
