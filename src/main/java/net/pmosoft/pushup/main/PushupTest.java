//package net.pmosoft.pushup.main;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import net.pmosoft.fframe.AbstractTest;
//import net.pmosoft.fframe.FframeApplication;
//
//import org.junit.Before;
//import org.junit.Ignore;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = FframeApplication.class)
//public class PushupTest {
//
//	@Autowired
//	private PushupSrv pushupSrv;
//
//	@Autowired
//	private PushupDao pushupDao;
//
//
//    @Test
//    public void testPushupProcess() {
//        Map<String, String> params = new HashMap<String, String>();
//        params.put("PKG_FUL_NM", "user");
//        pushupDao.selectPushupList(params);
//        pushupSrv.selectPushupList(params);
//    }	
//	
//	@Test @Ignore
//	public void testPushupCnt() {
//		Map<String, String> params = new HashMap<String, String>();
//		//params.put("searchKeyCombo", ""); params.put("searchValue", "");
//		params.put("PKG_FUL_NM", "user");
//		pushupDao.selectPushupCnt(params);
//	}
//
//	@Test @Ignore
//	public void testPushupList() {
//		Map<String, String> params = new HashMap<String, String>();
//		//params.put("searchValue", "us");
//		//params.put("searchValue", "유저");
//		params.put("searchValue", "");
//		pushupSrv.selectPushupList(params);
//		//PushupDao.selectPushupList(params);
//	}
//
//	@Test @Ignore
//	public void testSavePushup() {
//
//		Map<String, String> params = new HashMap<String, String>();
//		params.put("PKG_FUL_NM", "package1");
//		params.put("PKG2_NM"   , "pk");
//		params.put("PKG3_NM"   , "pkg");
//		params.put("PKG4_NM"   , "pack");
//		params.put("PKG_HNM"   , "패키지");
//		params.put("PKG_DESC"  , "패키지4");
//		params.put("USE_YN"     , "Y");
//		params.put("REG_USR_ID", "admin");
//		params.put("UPD_USR_ID", "admin");
//
//		//PushupDao.deleteUser(params);
//
//		Map<String, Object> result = pushupSrv.savePushup(params);
//
//		System.out.println(result);
//		testPushupList();
//	}
//
//	@Test @Ignore
//	public void testDeletePushup() {
//		Map<String, String> params = new HashMap<String, String>();
//		params.put("PKG_FUL_NM", "package1");
//		pushupSrv.deletePushup(params);
//	}
//
//	@Test @Ignore
//	public void testInsertPushup() {
//
//		Map<String, String> params = new HashMap<String, String>();
//		//params.put("searchKeyCombo", ""); params.put("searchValue", "");
//		params.put("PKG_FUL_NM", "package");
//		params.put("PKG2_NM"   , "pk");
//		params.put("PKG3_NM"   , "pkg");
//		params.put("PKG4_NM"   , "pack");
//		params.put("PKG_HNM"   , "패키지");
//		params.put("PKG_DESC"  , "패키지");
//		params.put("USE_YN"     , "Y");
//		params.put("REG_USR_ID", "admin");
//		params.put("UPD_USR_ID", "admin");
//
//		pushupDao.deletePushup(params);
//
//		pushupDao.insertPushup(params);
//
//		testPushupList();
//	}
//
//	@Test @Ignore
//	public void testUpdatePushup() {
//
//		Map<String, String> params = new HashMap<String, String>();
//		//params.put("searchKeyCombo", ""); params.put("searchValue", "");
//		params.put("PKG_FUL_NM", "package");
//		params.put("PKG2_NM"   , "pk");
//		params.put("PKG3_NM"   , "pkg");
//		params.put("PKG4_NM"   , "pack");
//		params.put("PKG_HNM"   , "패키지");
//		params.put("PKG_DESC"  , "패키지2");
//		params.put("USE_YN"     , "Y");
//		params.put("REG_USR_ID", "admin");
//		params.put("UPD_USR_ID", "admin");
//
//		pushupDao.updatePushup(params);
//
//		testPushupList();
//	}
//
//}
//
