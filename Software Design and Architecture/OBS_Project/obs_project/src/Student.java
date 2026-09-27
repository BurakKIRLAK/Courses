import java.util.Date;
import java.util.UUID;
import java.time.LocalDateTime;


public class Student {
    private UUID id;
    private String studentNo;
    private String nationalId;
    private String firstName;
    private String lastName;
    private Date birthDate;
    public enum Gender{
        MALE,
        FEMALE
    };
    private Gender gender;
    private String eMail;
    private String phone;
    private String address;
    private UUID programId;
    private int enrollmentYear;
    private int classYear;
    public enum Status{
        ACTIVE,
        GRADUATED,
        SUSPENDED,
        LEFT
    };
    private Status status;
    private String photoURL;
    private LocalDateTime createdAt;


    public Student(UUID id,String studentNo,String nationalId, String firstName, String lastName, Date birthDate, Gender gender, String eMail, String phone, String address,UUID programId,
                    int enrollmentYear,int classYear, Status status,String photoURL,LocalDateTime createdAt ) {

        this.id = id;
        this.studentNo = studentNo;
        this.nationalId = nationalId;
        this.firstName = firstName;
        this.lastName =  lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.eMail = eMail;
        this.phone = phone;
        this.address = address;
        this.programId = programId;
        this.enrollmentYear = enrollmentYear;
        this.classYear = classYear;
        this.status = status;
        this.photoURL = photoURL;
        this.createdAt = createdAt;
    }

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }


    public String getStudentNo() {
        return studentNo;
    }
    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
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


    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }


    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }


    public String geteMail() {
        return eMail;
    }
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }


    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    public UUID getProgramId() {
        return programId;
    }
    public void setProgramId(UUID programId) {
        this.programId = programId;
    }


    public int getEnrollmentYear() {
        return enrollmentYear;
    }
    public void setEnrollmentYear(int enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }


    public int getClassYear() {
        return classYear;
    }
    public void setClassYear(int classYear) {
        this.classYear = classYear;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }


    public String getPhotoURL() {
        return photoURL;
    }
    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }


    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override 
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", studentNo='" + studentNo + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                ", eMail='" + eMail + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", programId=" + programId +
                ", enrollmentYear=" + enrollmentYear +
                ", classYear=" + classYear +
                ", status=" + status +
                ", photoURL='" + photoURL + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
    


}


