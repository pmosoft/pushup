package net.pmosoft.pushup.pushup;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PushupDao {

	void insertExeHis(PushupVo inVo);
    void insertExeGoalCntHis(PushupVo inVo);
    List<PushupVo> selectExeGoalCnt(PushupVo inVo);
    List<PushupVo> selectExeGoalCntHis(PushupVo inVo);
    List<PushupVo> selectExeInfo(PushupVo inVo);
    List<PushupVo> selectExeHis(PushupVo inVo);
	
}


