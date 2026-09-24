import java.util.UUID;

public class Departments {

    private UUID id;
    private String code;
    private String name;
    private UUID facultyId;
    private UUID headInstructorId;
    private String phone;
    private String email;
    private boolean isActive;


    public Departments(UUID id, String code, String name, UUID facultyId, UUID headInstructorId, String phoneNumber, String emailAddress, boolean isActive) {

        this.id = id;
        this.code = code;
        this.name = name;
        this.facultyId = facultyId;
        this.headInstructorId = headInstructorId;
        this.phone = phone;
        this.email = email;
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

    public UUID getfacultyId() {
        return facultyId;
    }

    public void setfacultyId(UUID facultyId) {
        this.facultyId = facultyId;
    }

    public UUID getheadInstructorId() {
        return headInstructorId;
    }

    public void setheadInstructorId(UUID headInstructorId) {
        this.headInstructorId = headInstructorId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Departments{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", facultyId=" + facultyId +
                ", headInstructorId=" + headInstructorId +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}