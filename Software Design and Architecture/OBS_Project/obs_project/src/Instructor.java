import java.util.Date;
import java.util.UUID;

public class Instructor {
    private UUID id;
    private String employeeNo;
    private String nationalId;
    private String firstName;
    private String lastName;
    private String email;
    private UUID departmentId;
    public enum Title {
        LECTURER,
        DOCTOR,
        ASSISTANT_PROFESSOR ,
        ASSOCIATE_PROFESSOR,
        PROFESSOR
    }
    private Title title;
    private String specialization;
    private Date hireDate;
    private boolean isActive;

    public Instructor(UUID id,String employeeNo,String nationalId,String firstName,String lastName,String email,UUID departmentId,Title title,String specialization,Date hireDate,boolean isActive) {
        this.id = id;
        this.employeeNo = employeeNo;
        this.nationalId = nationalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.departmentId = departmentId;
        this.title = title;
        this.specialization = specialization;
        this.hireDate = hireDate;
        this.isActive = isActive;
    }

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }


    public String getEmployeeNo() {
        return employeeNo;
    }
    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }


    public String getNationalId() {
        return nationalId;
    }
    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public UUID getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(UUID departmentId) {
        this.departmentId = departmentId;
    }


    public Title getTitle() {
        return title;
    }
    public void setTitle(Title title) {
        this.title = title;
    }


    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }


    public Date getHireDate() {
        return hireDate;
    }
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }


    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean active) {
        isActive = active;
    }



    @Override 
    public String toString() {
        return "Instructors{" +
                "id=" + id +
                ", employeeNo='" + employeeNo + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", departmentId=" + departmentId +
                ", title=" + title +
                ", specialization='" + specialization + '\'' +
                ", hireDate=" + hireDate +
                ", isActive=" + isActive +
                '}';
    }
    
}
