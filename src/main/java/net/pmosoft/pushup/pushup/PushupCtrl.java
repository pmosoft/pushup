package net.pmosoft.pushup.pushup;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4202")
public class PushupCtrl {

	@Autowired
	private PushupSrv pushupSrv;

    /**
     * [저장] 유저의 운동 수행 이력 정보
    */
    @RequestMapping(value = "/pushup/saveExerHis")
    public Map<String, Object> saveExerHis(@RequestBody PushupVo inVo) {
        return pushupSrv.saveExerHis(inVo);
    }
	
    /**
     * [저장] 유저의 운동 목표 횟수 이력 정보
    */
    @RequestMapping(value = "/pushup/saveExerGoalCntHis")
    public Map<String, Object> saveExerGoalCntHis(@RequestBody PushupVo inVo) {
        System.out.println("asfafaf");
        return pushupSrv.saveExerGoalCntHis(inVo);
    }
	
    /**
     * [조회] 유저의 운동 목표수 이력
    */
    @RequestMapping(value = "/pushup/selectExerGoalCntHis")
    public Map<String, Object> selectExerGoalCntHis(@RequestBody PushupVo inVo) {
        return pushupSrv.selectExerGoalCntHis(inVo);
    }
    
    /**
     * [조회] 유저의 운동이력 정보
    */
    @RequestMapping(value = "/pushup/selectExerHis")
    public Map<String, Object> selectExerHis(@RequestBody PushupVo inVo) {
        return pushupSrv.selectExerHis(inVo);
    }

}




















