package ke.co.safaricom;

public class squad {
    private  String name;
    private int id;
    private int max_size;
    private String cause;

    public squad(String name, int id, int max_size, String cause) {
        this.name = name;
        this.id = id;
        this.max_size = max_size;
        this.cause = cause;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMax_size() {
        return max_size;
    }

    public void setMax_size(int max_size) {
        this.max_size = max_size;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }
}
