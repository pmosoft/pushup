package net.pmosoft.pushup.pushup;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PushupCtrl {

	@Autowired
	private PushupSrv pushupSrv;

	/**
	 * select PushupList
	 */
	@RequestMapping(value = "/net/pmosoft/pushup/main/selectPushupList")
	public Map<String, Object> selectPushupList(@RequestParam Map<String,String> params) {
		return pushupSrv.selectPushupList(params);
	}

	/**
	 * savePushup
	 */
	@RequestMapping(value = "/net/pmosoft/pushup/main/savePushup")
	public Map<String, Object> savePushup(@RequestParam Map<String,String> params) {
		return pushupSrv.savePushup(params);
	}

	/**
	 * deletePushup
	 */
	@RequestMapping(value = "/net/pmosoft/pushup/main/deletePushup")
	public Map<String, Object> deletePushup(@RequestParam Map<String,String> params) {
		return pushupSrv.deletePushup(params);
	}

}
