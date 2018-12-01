package net.pmosoft.pushup.pushup;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PushupCtrl {

	@Autowired
	private PushupSrv pushupSrv;

    /**
     * [저장] 유저의 운동 수행 이력 정보
    */
    @RequestMapping(value = "/pushup/insertExeHis")
    public Map<String, Object> insertExeHis(@RequestBody PushupVo inVo) {
        return pushupSrv.insertExeHis(inVo);
    }
	
    /**
     * [저장] 유저의 운동 목표 횟수 이력 정보
    */
    @RequestMapping(value = "/pushup/insertExeGoalCntHis")
    public Map<String, Object> insertExeGoalCntHis(@RequestBody PushupVo inVo) {
        return pushupSrv.insertExeGoalCntHis(inVo);
    }
	
    /** 
     * [조회] 유저의 최근 운동 목표수
    */
    @RequestMapping(value = "/pushup/selectExeGoalCnt")
    public Map<String, Object> selectExeGoalCnt(@RequestBody PushupVo inVo) {
        return pushupSrv.selectExeGoalCnt(inVo);
    }

    /**
     * [조회] 유저의 운동 목표수 이력
    */
    @RequestMapping(value = "/pushup/selectExeGoalCntHis")
    public Map<String, Object> selectExeGoalCntHis(@RequestBody PushupVo inVo) {
        return pushupSrv.selectExeGoalCntHis(inVo);
    }
    
    /**
     * [조회] 유저의 당일 운동 정보
    */
    @RequestMapping(value = "/pushup/selectExeInfo")
    public Map<String, Object> selectExeInfo(@RequestBody PushupVo inVo) {
        return pushupSrv.selectExeInfo(inVo);
    }
    
    /**
     * [조회] 유저의 운동이력 정보
    */
    @RequestMapping(value = "/pushup/selectExeHis")
    public Map<String, Object> selectExeHis(@RequestBody PushupVo inVo) {
        return pushupSrv.selectExeHis(inVo);
    }

}
