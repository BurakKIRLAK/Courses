import java.util.UUID;
import java.util.Date;

public class Academic_Terms {

    private UUID id;
    private String code;
    private String name;
    private String academicYear;
    private enum semester {
        FALL,
        SPRING,
        SUMMER
    }
    private semester semester;
    private Date startDate;
    private Date endDate;
    private Date registrationStartDate;
    private Date registrationEndDate;
    private Date addDropEndDate;
    private boolean isActive;


    public Academic_Terms(UUID id,String code, String name,String academicYear,semester semester,Date registrationStartDate, Date registrationEndDate, Date addDropEndDate, Date startDate, Date endDate, boolean isActive) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.academicYear = academicYear;
        this.semester = semester;
        this.registrationStartDate = registrationStartDate;
        this.registrationEndDate = registrationEndDate;
        this.addDropEndDate = addDropEndDate;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public String getAcademicYear() {
        return academicYear;
    }
    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public semester getSemester() {
        return semester;
    }
    public void setSemester(semester semester) {
        this.semester = semester;
    }

    public Date getRegistrationStartDate() {
        return registrationStartDate;
    }
    public void setRegistrationStartDate(Date registrationStartDate) {
        this.registrationStartDate = registrationStartDate;
    }

    public Date getRegistrationEndDate() {
        return registrationEndDate;
    }
    public void setRegistrationEndDate(Date registrationEndDate) {
        this.registrationEndDate = registrationEndDate;
    }

    public Date getAddDropEndDate() {
        return addDropEndDate;
    }
    public void setAddDropEndDate(Date addDropEndDate) {
        this.addDropEndDate = addDropEndDate;
    }


    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}
