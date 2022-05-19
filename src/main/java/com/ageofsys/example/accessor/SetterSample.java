package com.ageofsys.example.accessor;

public class SetterSample {
    public String noSetterButPublicAccessor;
    private String publicAccessor;
    private String protectedAccessor;
    private String packageAccessor;

    public void setPublicAccessor(String publicAccessor) {
        this.publicAccessor = publicAccessor;
    }

    protected void setProtectedAccessor(String protectedAccessor) {
        this.protectedAccessor = protectedAccessor;
    }

    void setPackageAccessor(String packageAccessor) {
        this.packageAccessor = packageAccessor;
    }

    public String getPublicAccessor() {
        return publicAccessor;
    }

    public String getProtectedAccessor() {
        return protectedAccessor;
    }

    public String getPackageAccessor() {
        return packageAccessor;
    }
}
