package net.pmosoft.pushup.pushup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PushupSrv {

    private static Logger logger = LoggerFactory.getLogger(PushupSrv.class);
    
	@Autowired
	private PushupDao pushupDao;

	@Autowired
	private PushupValidatorSrv pushupValidatorSrv;
 
	/* *************************************************************
	 *                            SAVE
	 * *************************************************************/
    public Map<String, Object> saveExerHis(PushupVo inVo){
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            PushupVo pushupVo = null;
            pushupVo = pushupDao.selectSaveExerCntYn(inVo);
            if(pushupVo.getSaveExerCntYn().contains("Y")){
                pushupDao.insertExerHis(inVo);
            } else {
            }
            result.put("isSuccess", true);
        } catch (Exception e){
            result.put("isSuccess", false);
            result.put("errUsrMsg", "시스템 장애가 발생하였습니다");
            result.put("errSysMsg", e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    public Map<String, Object> saveExerGoalCntHis(PushupVo inVo){
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            PushupVo pushupVo = null;
            pushupVo = pushupDao.selectExerGoalTodayYn(inVo);
            if(pushupVo.getExerGoalTodayYn().contains("N")){
                pushupDao.insertExerGoalCntHis(inVo);
            } else {
                pushupDao.updateExerGoalCntHis(inVo);
            }
            result.put("isSuccess", true);
        } catch (Exception e){
            result.put("isSuccess", false);
            result.put("errUsrMsg", "시스템 장애가 발생하였습니다");
            result.put("errSysMsg", e.getMessage());
            e.printStackTrace();
        }
        return result;
     }
    
    /* *************************************************************
     *                            SELECT
     * *************************************************************/
	
    public Map<String, Object> selectExerGoalCntHis(PushupVo inVo){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            List<PushupVo> pushupOutVoList = null;
            pushupOutVoList = pushupDao.selectExerGoalCntHis(inVo);
            result.put("isSuccess", true);
            result.put("pushupOutVoList", pushupOutVoList);
        } catch (Exception e){
            result.put("isSuccess", false);
            result.put("errUsrMsg", "시스템 장애가 발생하였습니다");
            result.put("errSysMsg", e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
        
    public Map<String, Object> selectExerHis(PushupVo inVo){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            List<PushupVo> pushupOutVoList = null;
            pushupOutVoList = pushupDao.selectExerHis(inVo);
            result.put("isSuccess", true);
            result.put("pushupOutVoList", pushupOutVoList);
        } catch (Exception e){
            result.put("isSuccess", false);
            result.put("errUsrMsg", "시스템 장애가 발생하였습니다");
            result.put("errSysMsg", e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

	
}
