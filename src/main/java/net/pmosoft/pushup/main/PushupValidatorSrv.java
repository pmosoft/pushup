package net.pmosoft.pushup.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

@WebAppConfiguration // 웹 컨텍스트 테스트 활성화

@Service
public class PushupValidatorSrv {

	public Map<String, String> validateSavePushup(Map<String, String> target) {

		System.out.println("validateSavePushup");

		Map<String, String> errors = new HashMap<String, String>();
		System.out.println("validateSavePushup11");

//		if (target.get("Pushup_ID").length() < 5 || target.get("Pushup_ID").length() > 15) {
//			errors.put("errUserMsg", "유저아이디를 5자리에서 14자리로 입력해 주시기 바랍니다.");
//		} else if  (target.get("Pushup_EMAIL").length() < 5 || target.get("Pushup_EMAIL").length() > 15) {
//			errors.put("errUserMsg", "이메일 형식이 아닙니다.");
//		} else if  (target.get("Pushup_PW").length() < 5 || target.get("Pushup_PW").length() > 15) {
//			errors.put("errUserMsg", "유저암호를 5자리에서 14자리로 입력해 주시기 바랍니다.");
//		} else if  (!target.get("Pushup_PW").equals(target.get("Pushup_PW2"))) {
//			errors.put("errUserMsg", "암호와 암호확인을 일치시켜 주십시요.");
//		} else if  (target.get("Pushup_NM").length() < 5 || target.get("Pushup_NM").length() > 15) {
//			errors.put("errUserMsg", "성명을 5자리에서 14자리로 입력해 주시기 바랍니다.");
//		}
		System.out.println("validateSavePushup55");

		return errors;
	}


	public Map<String, String> validateDeletePushup(Map<String, String> target) {

		Map<String, String> errors = new HashMap<String, String>();
//		if (target.get("Pushup_ID").length() < 5 || target.get("Pushup_ID").length() > 15) {
//			errors.put("errUserMsg", "유저아이디를 5자리에서 14자리로 입력해 주시기 바랍니다.");
//		} else if  (PushupDao.selectPushupCnt(target)==0) {
//			errors.put("errUserMsg", "아이디가 미존재합니다.");
//		}

		return errors;
	}

	
    public Map<String, String> validateSavePushupInfo(Map<String, String> target) {

        System.out.println("validateSavePushupInfo");
        
        Map<String, String> errors = new HashMap<String, String>();
        System.out.println("validateSavePushupInfo11");
        
//      if (target.get("PushupInfo_ID").length() < 5 || target.get("PushupInfo_ID").length() > 15) {
//          errors.put("errUserMsg", "유저아이디를 5자리에서 14자리로 입력해 주시기 바랍니다.");
//      } else if  (target.get("PushupInfo_EMAIL").length() < 5 || target.get("PushupInfo_EMAIL").length() > 15) {
//          errors.put("errUserMsg", "이메일 형식이 아닙니다.");
//      } else if  (target.get("PushupInfo_PW").length() < 5 || target.get("PushupInfo_PW").length() > 15) {
//          errors.put("errUserMsg", "유저암호를 5자리에서 14자리로 입력해 주시기 바랍니다.");
//      } else if  (!target.get("PushupInfo_PW").equals(target.get("PushupInfo_PW2"))) {
//          errors.put("errUserMsg", "암호와 암호확인을 일치시켜 주십시요.");
//      } else if  (target.get("PushupInfo_NM").length() < 5 || target.get("PushupInfo_NM").length() > 15) {
//          errors.put("errUserMsg", "성명을 5자리에서 14자리로 입력해 주시기 바랍니다.");
//      }
        System.out.println("validateSavePushupInfo55");
        
        return errors;
    }
    
    
    public Map<String, String> validateDeletePushupInfo(Map<String, String> target) {
        
        Map<String, String> errors = new HashMap<String, String>();
//      if (target.get("PushupInfo_ID").length() < 5 || target.get("PushupInfo_ID").length() > 15) {
//          errors.put("errUserMsg", "유저아이디를 5자리에서 14자리로 입력해 주시기 바랍니다.");
//      } else if  (PushupInfoDao.selectPushupInfoCnt(target)==0) {
//          errors.put("errUserMsg", "아이디가 미존재합니다.");
//      }   
            
        return errors;
    }
    	
	
	
}
