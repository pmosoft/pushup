package net.pmosoft.pushup.pushup;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PushupDao {

	void insertExerHis(PushupVo inVo);
    void insertExerGoalCntHis(PushupVo inVo);

    List<PushupVo> selectExerHis(PushupVo inVo);
    PushupVo selectSaveExerCntYn(PushupVo inVo);
    
    List<PushupVo> selectExerGoalCntHis(PushupVo inVo);
    PushupVo selectExerGoalTodayYn(PushupVo inVo);
    
    void updateExerGoalCntHis(PushupVo inVo);

}


