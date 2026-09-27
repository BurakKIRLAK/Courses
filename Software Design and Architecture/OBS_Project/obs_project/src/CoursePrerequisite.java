import java.util.UUID;

public class CoursePrerequisite {

    private UUID id;
    private UUID courseId;
    private UUID prerequisiteCourseId;
    public enum PrerequisiteType {MANDATORY, OPTIONAL};
    private PrerequisiteType type;
    private String minimumGrade;


    public CoursePrerequisite(UUID id, UUID courseId, UUID prerequisiteCourseId,PrerequisiteType type,String minimumGrade) {
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

    public PrerequisiteType getType() {
        return type;
    }
    public void setType(PrerequisiteType type) {
        this.type = type;
    }

    @Override 
    public String toString() {
        return "Course_Prerequisites{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", prerequisiteCourseId=" + prerequisiteCourseId +
                ", type=" + type +
                ", minimumGrade='" + minimumGrade + '\'' +
                '}';
    }

}
