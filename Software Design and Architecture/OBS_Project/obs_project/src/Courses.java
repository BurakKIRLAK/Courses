
import java.util.UUID;

public class Courses {
    private UUID id;
    private String  code;
    private String name;
    private UUID departmentId;
    private int credits;
    private int theoryHours;
    private int labHours;
    private enum courseType {
        COMPULSORY,
        ELECTIVE,
        MAIN_FIELD
    }
    private courseType courseType;
    private String language;
    private String description;
    private boolean isActive;


    public Courses(UUID id,String  code,String name,UUID departmentId,int credits,int theoryHours,int labHours,courseType courseType,String language,String description,boolean isActive) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.departmentId = departmentId;
        this.credits = credits;
        this.theoryHours = theoryHours;
        this.labHours = labHours;
        this.courseType = courseType;
        this.language = language;
        this.description = description;
        this.isActive = isActive;
    }

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public UUID getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(UUID departmentId) {
        this.departmentId = departmentId;
    }

    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getTheoryHours() {
        return theoryHours;
    }
    public void setTheoryHours(int theoryHours) {
        this.theoryHours = theoryHours;
    }

    public int getLabHours() {
        return labHours;
    }
    public void setLabHours(int labHours) {
        this.labHours = labHours;
    }

    public courseType getCourseType() {
        return courseType;
    }
    public void setCourseType(courseType courseType) {
        this.courseType = courseType;
    }

    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }


}
