package za.co.aeonsource.entity;

/**
 * Created by khayapro on 2017/10/24.
 */
public class Student {

    private Long id;
    private String name;
    private String course;

    protected Student(){
        super();
    }

    public Student(Long id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
