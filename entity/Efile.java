package com.lab.thelab.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Efile {
    private String efid;
    private String efname;
    private String aconent;
    private String applytime;
    private String atype;
    private String apply;
    private String applicant;
    private String eapplicant;
    private String email;
    private String ecall;

    public String getEfid() {
        return efid;
    }

    public void setEfid(String efid) {
        this.efid = efid;
    }

    public String getEfname() {
        return efname;
    }

    public void setEfname(String efname) {
        this.efname = efname;
    }

    public String getAconent() {
        return aconent;
    }

    public void setAconent(String aconent) {
        this.aconent = aconent;
    }

    public String getApplytime() {
        return applytime;
    }

    public void setApplytime(String applytime) {
        this.applytime = applytime;
    }

    public String getAtype() {
        return atype;
    }

    public void setAtype(String atype) {
        this.atype = atype;
    }

    public String getApply() {
        return apply;
    }

    public void setApply(String apply) {
        this.apply = apply;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getEapplicant() {
        return eapplicant;
    }

    public void setEapplicant(String eapplicant) {
        this.eapplicant = eapplicant;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEcall() {
        return ecall;
    }

    public void setEcall(String ecall) {
        this.ecall = ecall;
    }
}
