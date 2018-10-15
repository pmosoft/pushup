package net.pmosoft.pushup.pushup;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PushupDao {

	List<Map<String, Object>> selectPushupList(Map<String,String> params);
	int selectPushupCnt(Map<String,String> params);
	void insertPushup(Map<String,String> params);
	void deletePushup(Map<String,String> params);
	void updatePushup(Map<String,String> params);

}

