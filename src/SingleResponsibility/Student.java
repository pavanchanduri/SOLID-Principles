package SingleResponsibility;

/**
 * There are multiple reasons for change here such as
 * 1. Change in the student profile
 * 2. Change in the database backend
 *
 * Having multiple reasons to change implies the probability of bugs increases
 *
 * To Implement SRP, it is therefore recommended to move the saveStudentRecord method
 * to another class and have only Student Profile updation including calling save record method
 * in this class
 */

public class Student {

    private String studentId;
    private String studentDOB;
    private String address;


    public void saveStudentRecord() {

        //Database code to save student profile information
    }

    public void calculateFees() {

        //code to calculate fees
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(String studentDOB) {
        this.studentDOB = studentDOB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
