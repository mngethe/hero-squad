package ke.co.safaricom;

public class hero {
    public hero(String name, int age, String power, String weakness, int id) {
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        this.id = id;
    }

    private String name;
    private int age;
    private String power;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String weakness;
    private int id;
}
