package com.CarmenWen.pojo;

public class GeneralPaperSystemClasses {
    private Integer Credit;
    private String PaperID;
    private String PW;
    private Boolean ReviewState;
    private Boolean ai;
    private Boolean arch;
    private Boolean dm;
    private Boolean edu;
    private Boolean inter;
    private Boolean net;
    private Boolean par;
    private Boolean secu;
    private Boolean ssy;
    private Boolean theo;
    private Boolean vr;

    public Integer getCredit(){
        return Credit;
    }
    public void Integer (Integer Credit){
        this.Credit=Credit;
    }

    public String getPaperID() {
        return PaperID;
    }
    public void setPaperID(String PaperID){
        this.PaperID=PaperID;
    }

    public String getPW(){
        return PW;
    }

    public void setPW(String PW) {
        this.PW = PW;
    }

    public Boolean getReviewState() {
        return ReviewState;
    }

    public void setReviewState(Boolean reviewState) {
        ReviewState = reviewState;
    }

    public Boolean getAi() {
        return ai;
    }

    public void setAi(Boolean ai) {
        this.ai = ai;
    }

    public Boolean getArch() {
        return arch;
    }

    public void setArch(Boolean arch) {
        this.arch = arch;
    }


    public Boolean getDm() {
        return dm;
    }

    public void setDm(Boolean dm) {
        this.dm = dm;
    }

    public Boolean getEdu() {
        return edu;
    }

    public void setEdu(Boolean edu) {
        this.edu = edu;
    }

    public Boolean getInter() {
        return inter;
    }

    public void setInter(Boolean inter) {
        this.inter = inter;
    }

    public Boolean getNet() {
        return net;
    }

    public void setNet(Boolean net) {
        this.net = net;
    }

    public Boolean getPar() {
        return par;
    }

    public void setPar(Boolean par) {
        this.par = par;
    }

    public Boolean getSecu() {
        return secu;
    }

    public void setSecu(Boolean secu) {
        this.secu = secu;
    }

    public Boolean getSsy() {
        return ssy;
    }

    public void setSsy(Boolean ssy) {
        this.ssy = ssy;
    }

    public Boolean getTheo() {
        return theo;
    }

    public void setTheo(Boolean theo) {
        this.theo = theo;
    }

    public Boolean getVr() {
        return vr;
    }

    public void setVr(Boolean vr) {
        this.vr = vr;
    }

    @Override
    public String toString() {
        return "GeneralChainCode{" +
                "PaperID='" + PaperID + '\'' +
                ", ReviewState='" + ReviewState + '\'' +
                ", ai='" + ai + '\'' +
                ", arch='" + arch + '\'' +
                ", dm='" + dm + '\'' +
                ", edu='" + edu + '\'' +
                ", inter='" + inter + '\'' +
                ", net='" + net + '\'' +
                ", par='" + par + '\'' +
                ", secu='" + secu + '\'' +
                ", ssy='" + ssy + '\'' +
                ", ssy='" + theo + '\'' +
                ", ssy='" + vr + '\'' +
                '}';
    }

}
