package com.ageofsys.example.accessor;

public class GetterSampleDto {
    public String noGetterButPublicAccessor = "hello1";
    private String publicAccessor = "hello2";
    private String protectedAccessor = "hello3";
    private String packageAccessor = "hello4";

    public String getPublicAccessor() {
        return publicAccessor;
    }

    protected String getProtectedAccessor() {
        return protectedAccessor;
    }

    String getPackageAccessor() {
        return packageAccessor;
    }
}
