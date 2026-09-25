import java.util.UUID;

public class Course_Prerequisites {

    private UUID id;
    private UUID courseId;
    private UUID prerequisiteCourseId;
    private enum prerequisiteType {MANDATORY, OPTIONAL};
    private prerequisiteType type;
    private String minimumGrade;


    public Course_Prerequisites(UUID id, UUID courseId, UUID prerequisiteCourseId,prerequisiteType type,String minimumGrade) {
        this.id = id;
        this.courseId = courseId;
        this.prerequisiteCourseId = prerequisiteCourseId;
        this.type = type;
        this.minimumGrade = minimumGrade;
    }

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getCourseId() {
        return courseId;
    }
    public void setCourseId(UUID courseId) {
        this.courseId = courseId;
    }

    public UUID getPrerequisiteCourseId() {
        return prerequisiteCourseId;
    }
    public void setPrerequisiteCourseId(UUID prerequisiteCourseId) {
        this.prerequisiteCourseId = prerequisiteCourseId;
    }

    public String getMinimumGrade() {
        return minimumGrade;
    }
    public void setMinimumGrade(String minimumGrade) {
        this.minimumGrade = minimumGrade;
    }

    public prerequisiteType getType() {
        return type;
    }
    public void setType(prerequisiteType type) {
        this.type = type;
    }

}
