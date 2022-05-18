package com.ageofsys.example.booleantype;

public class BooleanWrapperClass {
    private Boolean admin = true;
    private Boolean member = true;

    private Boolean isSuperAdmin = true;
    private Boolean isSuperMember = true;

    public Boolean isAdmin() {
        return admin;
    }

    public Boolean getMember() {
        return member;
    }

    public Boolean isSuperAdmin() {
        return isSuperAdmin;
    }

    public Boolean getSuperMember() {
        return isSuperMember;
    }
}
