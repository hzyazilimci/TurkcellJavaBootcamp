public class Instructor {
    private int id;
    private String name;
    private Course[] course;
    private String image;

    public Instructor() {
        super();
    }

    public Instructor(int id, String name, String image) {
        super();
        this.id = id;
        this.name = name;
        this.image = image;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Course[] getKurs() {
        return course;
    }
    public void setKurs(Course[] kurs) {
        this.course = kurs;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
}
