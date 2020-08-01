package com.example.cassandraassignment.Model;


import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.Table;


@Table()
public class Employee {

    @Id
    @Column()
    private Integer emp_id;

//    @Size(min = 3,message = "Name should contain more than 3 characters")
    @Column()
    private String emp_dept;

    @Column()
    private String emp_mail;
    @Column()
    private int emp_no;
    @Column()
    private String emp_name;
    public Employee() {
    }

    public Employee(Integer emp_id, String emp_dept, String emp_mail, int emp_no, String emp_name) {
        this.emp_id = emp_id;
        this.emp_dept = emp_dept;
        this.emp_mail = emp_mail;
        this.emp_name = emp_name;
    }

    public Integer getEmpId() {
        return emp_id;
    }

    public void setEmpId(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmpDept() {
        return emp_dept;
    }

    public void setEmpDept(String emp_dept) {
        this.emp_dept = emp_dept;
    }

    public String getEmpEmail() {
        return emp_mail;
    }

    public void setEmpEmail(String emp_email) {
        this.emp_mail = emp_email;
    }



    public long getEmpPhone() {
        return emp_no;
    }

    public void setEmpPhone(int emp_no) {
        this.emp_no = emp_no;
    }

    public String getEmpName() {
        return emp_name;
    }

    public void setEmpName(String emp_name) {
        this.emp_name = emp_name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_dept='" + emp_dept + '\'' +
                ", emp_email='" + emp_mail + '\'' +
                ", emp_no='" + emp_no + '\'' +
                ", emp_name=" + emp_name +
                '}';
    }
}