package com.CarmenWen.pojo;

public class GeneralVerify {

    public String thisUsername;
    private String thisPassword;

    public String getThisUsername() {
        return thisUsername;
    }
    public void setThisUsername(String thisUsername){
        this.thisUsername=thisUsername;
    }

    public String getThisPassword() {
        return thisPassword;
    }
    public void setThisPassword(String thisPassword){
        this.thisPassword=thisPassword;
    }
    @Override
    public String toString() {
        return "GeneralVerify{" +
                "thisUsername='" + thisUsername + '\'' +
                ", thisPassword='" + thisPassword + '\'' +
                '}';
    }
}
