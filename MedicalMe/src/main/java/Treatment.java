public class Treatment {

    private String category;
    private String name;

    public Treatment(String category, String name) {
        this.category = category;
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Treatment{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
