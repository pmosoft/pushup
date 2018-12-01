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

    public Map<String, Object> insertExeHis(PushupVo inVo){
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            pushupDao.insertExeHis(inVo);
            result.put("isSuccess", true);
        } catch (Exception e){
            result.put("isSuccess", false);
            result.put("errUsrMsg", "시스템 장애가 발생하였습니다");
            result.put("errSysMsg", e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    public Map<String, Object> insertExeGoalCntHis(PushupVo inVo){
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            pushupDao.insertExeGoalCntHis(inVo);
            result.put("isSuccess", true);
        } catch (Exception e){
            result.put("isSuccess", false);
            result.put("errUsrMsg", "시스템 장애가 발생하였습니다");
            result.put("errSysMsg", e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
    
    public Map<String, Object> selectExeGoalCnt(PushupVo inVo){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            List<PushupVo> pushupVoList = null;
            pushupVoList = pushupDao.selectExeGoalCnt(inVo);
            result.put("isSuccess", true);
            result.put("pushupVoList", pushupVoList);
        } catch (Exception e){
            result.put("isSuccess", false);
            result.put("errUsrMsg", "시스템 장애가 발생하였습니다");
            result.put("errSysMsg", e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
    	
    public Map<String, Object> selectExeGoalCntHis(PushupVo inVo){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            List<PushupVo> pushupVoList = null;
            pushupVoList = pushupDao.selectExeGoalCntHis(inVo);
            result.put("isSuccess", true);
            result.put("pushupVoList", pushupVoList);
        } catch (Exception e){
            result.put("isSuccess", false);
            result.put("errUsrMsg", "시스템 장애가 발생하였습니다");
            result.put("errSysMsg", e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
        
    public Map<String, Object> selectExeInfo(PushupVo inVo){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            List<PushupVo> pushupVoList = null;
            pushupVoList = pushupDao.selectExeInfo(inVo);
            result.put("isSuccess", true);
            result.put("pushupVoList", pushupVoList);
        } catch (Exception e){
            result.put("isSuccess", false);
            result.put("errUsrMsg", "시스템 장애가 발생하였습니다");
            result.put("errSysMsg", e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    public Map<String, Object> selectExeHis(PushupVo inVo){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            List<PushupVo> pushupVoList = null;
            pushupVoList = pushupDao.selectExeHis(inVo);
            result.put("isSuccess", true);
            result.put("pushupVoList", pushupVoList);
        } catch (Exception e){
            result.put("isSuccess", false);
            result.put("errUsrMsg", "시스템 장애가 발생하였습니다");
            result.put("errSysMsg", e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

	
}
