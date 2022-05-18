package com.ageofsys.example.booleantype;

public class BooleanPrimitiveTypeDto {
    private boolean admin = false;
    private boolean member = false;

    private boolean isSuperAdmin = false;
    private boolean isSuperMember = false;

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
