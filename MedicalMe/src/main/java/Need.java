public class Need {

    private String need;
    private String category;

    public Need(String need, String category) {
        this.need = need;
        this.category = category;
    }

    public String getNeed() {
        return need;
    }

    public void setNeed(String need) {
        this.need = need;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Need{" +
                "need='" + need + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
