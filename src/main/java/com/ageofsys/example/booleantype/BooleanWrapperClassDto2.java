package com.ageofsys.example.booleantype;

public class BooleanWrapperClassDto2 {
    private Boolean admin = false;
    private Boolean member = false;

    private Boolean isSuperAdmin = false;
    private Boolean isSuperMember = false;

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public void setSuperAdmin(boolean superAdmin) {
        isSuperAdmin = superAdmin;
    }

    public void setSuperMember(boolean superMember) {
        isSuperMember = superMember;
    }

    public boolean isAdmin() {
        return admin;
    }

    public boolean isMember() {
        return member;
    }

    public boolean isSuperAdmin() {
        return isSuperAdmin;
    }

    public boolean isSuperMember() {
        return isSuperMember;
    }
}
