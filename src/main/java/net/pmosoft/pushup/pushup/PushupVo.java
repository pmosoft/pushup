package net.pmosoft.pushup.pushup;

public class PushupVo {

    // 운동이력 
    String usrId          ; // 유저아이디
    String exerDtm        ; // 운동일시
    String exerCd         ; // 운동코드 -- 01:pushup
    String exerDt         ; // 운동일자
    int    exerCnt        ; // 운동횟수
    String saveExerCntYn  ; // 운동횟수 저장 가능 여부    
    int    todayExerCnt   ; // 금일운동누적횟수
    String exerTm         ; // 운동시각
    
    // 운동목표이력             
    String startDt        ; // 시작일자
    int    exerGoalCnt    ; // 운동목표횟수
    String exerGoalTodayYn; // 운동목표등록일 당일여부 
    
    // 공통 
    String regDtm         ; // 등록일시
    String regUsrId       ; // 등록자
    String updDtm         ; // 변경일시
    String updUsrId       ; // 변경자
    
    public String getUsrId() {
        return usrId;
    }
    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }
    public String getExerDtm() {
        return exerDtm;
    }
    public void setExerDtm(String exerDtm) {
        this.exerDtm = exerDtm;
    }
    public String getExerCd() {
        return exerCd;
    }
    public void setExerCd(String exerCd) {
        this.exerCd = exerCd;
    }
    public String getExerDt() {
        return exerDt;
    }
    public void setExerDt(String exerDt) {
        this.exerDt = exerDt;
    }
    public int getExerCnt() {
        return exerCnt;
    }
    public void setExerCnt(int exerCnt) {
        this.exerCnt = exerCnt;
    }
    public String getSaveExerCntYn() {
        return saveExerCntYn;
    }
    public void setSaveExerCntYn(String saveExerCntYn) {
        this.saveExerCntYn = saveExerCntYn;
    }
    public int getTodayExerCnt() {
        return todayExerCnt;
    }
    public void setTodayExerCnt(int todayExerCnt) {
        this.todayExerCnt = todayExerCnt;
    }
    public String getExerTm() {
        return exerTm;
    }
    public void setExerTm(String exerTm) {
        this.exerTm = exerTm;
    }
    public String getStartDt() {
        return startDt;
    }
    public void setStartDt(String startDt) {
        this.startDt = startDt;
    }
    public int getExerGoalCnt() {
        return exerGoalCnt;
    }
    public void setExerGoalCnt(int exerGoalCnt) {
        this.exerGoalCnt = exerGoalCnt;
    }
    public String getExerGoalTodayYn() {
        return exerGoalTodayYn;
    }
    public void setExerGoalTodayYn(String exerGoalTodayYn) {
        this.exerGoalTodayYn = exerGoalTodayYn;
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
