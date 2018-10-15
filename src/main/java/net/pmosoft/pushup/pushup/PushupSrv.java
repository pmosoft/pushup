package net.pmosoft.pushup.pushup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PushupSrv {

	@Autowired
	private PushupDao pushupDao;

	@Autowired
	private PushupValidatorSrv pushupValidatorSrv;

	public Map<String, Object> selectPushupList(Map<String,String> params){

		Map<String, Object> result = new HashMap<String, Object>();

		List<Map<String,Object>> list = null;
		try{
			list = pushupDao.selectPushupList(params);;
			result.put("isSuccess", true);
			result.put("data", list);
		} catch (Exception e){
			result.put("isSuccess", false);
			result.put("errUserMsg", "시스템 장애가 발생하였습니다");
			result.put("errSysrMsg", e.getMessage());
			e.printStackTrace();
		}
		return result;
	}

	public Map<String, Object> savePushup(Map<String,String> params){


		System.out.println(pushupDao.selectPushupCnt(params));

		Map<String, Object> result = new HashMap<String, Object>();

		Map<String, String> errors = new HashMap<String, String>();
		errors = pushupValidatorSrv.validateSavePushup(params);

		if(errors.size()>0){
			result.put("isSuccess", false);
			result.put("errUserMsg", errors.get("errUserMsg"));
			return result;
		} else {
			try{
		    	result.put("isSuccess", true);

			    if  (pushupDao.selectPushupCnt(params)==0) {
			    	pushupDao.insertPushup(params);
			    	result.put("msg", "입력 되었습니다");
			    } else {
			    	pushupDao.updatePushup(params);
			    	result.put("msg", "갱신 되었습니다");
			    }
			} catch (Exception e){
				e.printStackTrace();
				result.put("errUserMsg", "시스템 장애가 발생되었습니다.");
			}
			return result;
		}
	}

	public Map<String, Object> deletePushup(Map<String,String> params){

		Map<String, Object> result = new HashMap<String, Object>();

		Map<String, String> errors = new HashMap<String, String>();
		errors = pushupValidatorSrv.validateDeletePushup(params);
		if(errors.size()>0){
			//model.addAttribute("tbPushup", tbPushup);
			result.put("isSuccess", false);
			result.put("errUserMsg", errors.get("errUserMsg"));
			System.out.println(result);
			return result;
		} else {
			pushupDao.deletePushup(params);
			result.put("isSuccess", true);
			result.put("msg", "삭제 되었습니다");
			return result;
		}
	}

	
}
