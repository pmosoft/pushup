package net.pmosoft.pushup.pushup;

public class PushupVo {

    // 운동이력 
    String usrId      ; // 유저아이디
    String execDtm    ; // 운동일시
    String execCd     ; // 운동코드 -- 01:pushup
    String execDt     ; // 운동일자
    int    execCnt    ; // 운동횟수
    
    // 운동목표이력 
    String startDt    ; // 시작일자
    String endDt      ; // 종료일자 -- 종료일자 >= 시작일자, 99991231는 하나만 존재하고, 신규 시작일자생성시 이전 종료일자을 반드시 세팅
    int    execGoalCnt; // 운동목표횟수

    // 공통 
    String regDtm     ; // 등록일시
    String regUsrId   ; // 등록자
    String updDtm     ; // 변경일시
    String updUsrId   ; // 변경자
    
    public String getUsrId() {
        return usrId;
    }
    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }
    public String getExecDtm() {
        return execDtm;
    }
    public void setExecDtm(String execDtm) {
        this.execDtm = execDtm;
    }
    public String getExecCd() {
        return execCd;
    }
    public void setExecCd(String execCd) {
        this.execCd = execCd;
    }
    public String getExecDt() {
        return execDt;
    }
    public void setExecDt(String execDt) {
        this.execDt = execDt;
    }
    public int getExecCnt() {
        return execCnt;
    }
    public void setExecCnt(int execCnt) {
        this.execCnt = execCnt;
    }
    public String getStartDt() {
        return startDt;
    }
    public void setStartDt(String startDt) {
        this.startDt = startDt;
    }
    public String getEndDt() {
        return endDt;
    }
    public void setEndDt(String endDt) {
        this.endDt = endDt;
    }
    public int getExecGoalCnt() {
        return execGoalCnt;
    }
    public void setExecGoalCnt(int execGoalCnt) {
        this.execGoalCnt = execGoalCnt;
    }
    public String getRegDtm() {
        return regDtm;
    }
    public void setRegDtm(String regDtm) {
        this.regDtm = regDtm;
    }
    public String getRegUsrId() {
        return regUsrId;
    }
    public void setRegUsrId(String regUsrId) {
        this.regUsrId = regUsrId;
    }
    public String getUpdDtm() {
        return updDtm;
    }
    public void setUpdDtm(String updDtm) {
        this.updDtm = updDtm;
    }
    public String getUpdUsrId() {
        return updUsrId;
    }
    public void setUpdUsrId(String updUsrId) {
        this.updUsrId = updUsrId;
    }

    
}
