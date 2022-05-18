package com.ageofsys.example.booleantype;

public class BooleanPrimitiveType {
    private boolean admin = true;
    private boolean member = true;

    private boolean isSuperAdmin = true;
    private boolean isSuperMember = true;

    public boolean isAdmin() {
        return admin;
    }

    public boolean getMember() {
        return member;
    }

    public boolean isSuperAdmin() {
        return isSuperAdmin;
    }

    public boolean getSuperMember() {
        return isSuperMember;
    }
}
