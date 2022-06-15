package Beytullah.hrms.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name = "employers")
public class Employers {


    public int getEmployerId() {
        return employerId;
    }

    public void setEmployerId(int employerId) {
        this.employerId = employerId;
    }

    @Id
    @GeneratedValue
    @Column(name="employer_id")
    private int employerId;


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Column(name="company_name")
    private String companyName;


    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    @Column(name = "web_site_url")
    private String websiteUrl;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "email")
    private String email;


    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    @Column(name = "tel_no")
    private String telNo;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "password")
    private String password;



}