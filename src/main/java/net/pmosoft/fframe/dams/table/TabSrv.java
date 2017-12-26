/*******************************************************************************
@title:테이블 컨트롤러 
@description-start
@description-end  
@developer:피승현
@progress-rate:80%
@update-history-start
-------------------------------------------------------------------------------
|   날짜   |수정자|내용
-------------------------------------------------------------------------------
|2017.11.01|피승현|최초개발
-------------------------------------------------------------------------------
@update-history-end
********************************************************************************/

package net.pmosoft.fframe.dams.table;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.pmosoft.fframe.dams.code.CodeDao;
import net.pmosoft.fframe.dams.table.dynamic.TabDaoFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Service
public class TabSrv {

    @Autowired
    private TabDao tabDao;

    @Autowired    
    private CodeDao codeDao;

    @Autowired
    private TabValidatorSrv tabValidatorSrv;

    /**********************************************************************************
    *
    *                                    Meta
    *
    **********************************************************************************/
    public Map<String, Object> selectMetaTabColList(Map<String,String> params){
        Map<String, Object> result = new HashMap<String, Object>();

        try{
            //TabDaoFactory tabDaoFactory = (TabDaoFactory) Class.forName("net.pmosoft.fframe.dams.table.dynamic.TabMariaDbDao").newInstance();
            TabDaoFactory tabDaoFactory = (TabDaoFactory) Class.forName( findDao(params) ).newInstance();            
            List<Map<String,Object>> list = tabDaoFactory.selectMetaTabColList(params);
            result.put("isSuccess", true);
            result.put("data", list);
        } catch (Exception e){
            result.put("isSuccess", false);
            result.put("errUsrMsg", "시스템 장애가 발생하였습니다");
            result.put("errSysrMsg", e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
    
    public Map<String, Object> selectMetaTabList(Map<String,String> params){
        
        Map<String, Object> result = new HashMap<String, Object>();
        
        try{
            //TabDaoFactory tabDaoFactory = (TabDaoFactory) Class.forName("net.pmosoft.fframe.dams.table.dynamic.TabMariaDbDao").newInstance();
            TabDaoFactory tabDaoFactory = (TabDaoFactory) Class.forName( findDao(params) ).newInstance();            
            List<Map<String,Object>> list = tabDaoFactory.selectMetaTabList(params);
           
            result.put("isSuccess", true);
            result.put("data", list);
        } catch (Exception e){
            result.put("isSuccess", false);
            result.put("errUsrMsg", "시스템 장애가 발생하였습니다");
            result.put("errSysrMsg", e.getMessage());
            e.printStackTrace();
        }
        return result;
    }


    public Map<String, Object> selectTabData(Map<String,String> params){
        
        Map<String, Object> result = new HashMap<String, Object>();
        System.out.println("paramsaaaaaaaaaaaaaaaaaaaaaaaaaa="+params);
        
        try{
            //TabDaoFactory tabDaoFactory = (TabDaoFactory) Class.forName("net.pmosoft.fframe.dams.table.dynamic.TabMariaDbDao").newInstance();
            TabDaoFactory tabDaoFactory = (TabDaoFactory) Class.forName( findDao(params) ).newInstance();            
            List<Map<String,Object>> list = tabDaoFactory.selectTabData(params);
           
            result.put("isSuccess", true);
            result.put("data", list);
        } catch (Exception e){
            result.put("isSuccess", false);
            result.put("errUsrMsg", "시스템 장애가 발생하였습니다");
            result.put("errSysrMsg", e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    public Map<String, Object> selectQryData(Map<String,String> params){
        
        Map<String, Object> result = new HashMap<String, Object>();
        
        
        try{
            //TabDaoFactory tabDaoFactory = (TabDaoFactory) Class.forName("net.pmosoft.fframe.dams.table.dynamic.TabMariaDbDao").newInstance();
            TabDaoFactory tabDaoFactory = (TabDaoFactory) Class.forName( findDao(params) ).newInstance();            
            List<Map<String,Object>> list = tabDaoFactory.selectQryData(params);
           
            result.put("isSuccess", true);
            result.put("data", list);
        } catch (Exception e){
            result.put("isSuccess", false);
            result.put("errUsrMsg", "시스템 장애가 발생하였습니다");
            result.put("errSysrMsg", e.getMessage());
            e.printStackTrace();
        }
        return result;
    }    
    
    /**********************************************************************************
    *
    *                               ExtractMetaTabCol
    *
    **********************************************************************************/
    public Map<String, Object> selectExtractMetaTabColList(Map<String,String> params){

        // params.put("CD_ID_NM", "DB_CONN_CD");        
        // params.put("CD", "01");        
        
        Map<String, Object> result = new HashMap<String, Object>();

        
//        List<Map<String,Object>> codeList = codeDao.selectCodeExt(params);;
//        String dbDriver   = (String) codeList.get(0).get("CD_PARAM2");
//        String dbConn     = (String) codeList.get(0).get("CD_PARAM3");
//        String dbUser     = (String) codeList.get(0).get("CD_PARAM4");
//        String dbPassword = (String) codeList.get(0).get("CD_PARAM5");
//        //conn.getConnection(dbDriver, dbConn, dbUser, dbPassword);
        
        try{
            
            List<Map<String,Object>> list = null;
                
            // 1.1단계 : DB 메타 테이블컬럼정보 조회
            //TabDaoFactory tabDaoFactory = (TabDaoFactory) Class.forName("net.pmosoft.fframe.dams.table.dynamic.TabMariaDbDao").newInstance();
            TabDaoFactory tabDaoFactory = (TabDaoFactory) Class.forName( findDao(params) ).newInstance();            
            List<Map<String,Object>> listMeta = tabDaoFactory.selectMetaTabColList(params);

            // 1.2단계 : 메타테이블컬럼정보 삭제                
            tabDao.deleteMetaTabCol(params);

            
            // 1.3단계 : 메타테이블컬럼정보 삽입                
            for (int i = 0; i  < listMeta.size(); i++) {
                tabDao.insertMetaTabCol(listMeta.get(i));
            }

            // 2.1단계 : 메타테이블정보 삭제                
            tabDao.deleteMetaTab(params);

            // 2.2단계 : 메타테이블정보 조회                
            List<Map<String,Object>> listMeta2 = tabDaoFactory.selectMetaTabList(params);

            // 2.3단계 : 메타테이블정보 삽입                
            for (int i = 0; i  < listMeta2.size(); i++) {
                tabDao.insertMetaTab(listMeta2.get(i));
            }
            
            // 3단계 : 메타테이블컬럼정보 조회                
            list = tabDao.selectMetaTabColList(params);
            
            result.put("isSuccess", true);
            result.put("data", list);
        } catch (Exception e){
            result.put("isSuccess", false);
            result.put("errUsrMsg", "시스템 장애가 발생하였습니다");
            result.put("errSysrMsg", e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
    
//  public Map<String, Object> selectMetaTabColList(Map<String,String> params){
//
//      Map<String, Object> result = new HashMap<String, Object>();
//      
//      try {
//          String step = params.get("step");
//          List<Map<String,Object>> list = null;
//          
//          if(step.equals("1")) {
//              tabDao.deleteMetaTabCol(params);
//              tabDao.insertMetaTabColList(params);
//              list = tabDao.selectMetaTabColList(params);;
//          } else if(step.equals("2")){
//              list = tabDao.selectCmpTabColList(params);;
//          }    
//          result.put("isSuccess", true);           
//          result.put("data", list);
//      } catch (Exception e){
//          result.put("isSuccess", false);
//          result.put("errUsrMsg", "시스템 장애가 발생하였습니다");
//          result.put("errSysrMsg", e.getMessage());
//          e.printStackTrace();
//      }
//      return result;
//  }     
    
    private String findDao(Map<String,String> params){

        String daoClassPath = "";
        Map<String,String> params2 = new HashMap<String,String>();
        
        params2.put("CD_ID_NM","DYN_DAO_CD");
        params2.put("CD_NM",params.get("dbType"));
        List<Map<String,Object>> codeList = codeDao.selectCodeExt(params2);            
        daoClassPath = (String) codeList.get(0).get("CD_PARAM1");
         
        return daoClassPath;
    }
    
    public Map<String, Object> selectCmpTabColList(@RequestParam Map<String,String> params) {
 
        Map<String, Object> result = new HashMap<String, Object>();
 
        System.out.println("params="+params);
        try{
            List<Map<String,Object>> list = tabDao.selectCmpTabColList(params);;
            result.put("isSuccess", true);
            result.put("data", list);
        } catch (Exception e){
            result.put("isSuccess", false);
            result.put("errUsrMsg", "시스템 장애가 발생하였습니다");
            result.put("errSysrMsg", e.getMessage());
            e.printStackTrace();
        }
        return result;
    }    
 
    public Map<String, Object> insertCmpTabColList(Map<String,String> params){
 
        Map<String, Object> result = new HashMap<String, Object>();
        
        try{
            tabDao.insertCmpTabCol(params);
            tabDao.insertCmpTab(params);
            
            result.put("isSuccess", true);
            result.put("usrMsg", "입력 되었습니다");
        } catch (Exception e){
            result.put("isSuccess", false);
            result.put("errUsrMsg", "시스템 장애가 발생하였습니다");
            result.put("errSysrMsg", e.getMessage());
        }
        
        return result;
    }   

    

     
    
    /**********************************************************************************
    *
    *                                  Tab
    *
    **********************************************************************************/

    public Map<String, Object> selectTabColList(Map<String,String> params){

        Map<String, Object> result = new HashMap<String, Object>();

        try{
            List<Map<String,Object>> list = tabDao.selectTabColList(params);;
            result.put("isSuccess", true);
            result.put("data", list);
        } catch (Exception e){
            result.put("isSuccess", false);
            result.put("errUsrMsg", "시스템 장애가 발생하였습니다");
            result.put("errSysrMsg", e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    public Map<String, Object> saveTabCol(String params){

        Map<String, Object> result = new HashMap<String, Object>();
        return result;
        
    }

    public Map<String, Object> deleteTabCol(Map<String,String> params){

        Map<String, Object> result = new HashMap<String, Object>();
        
        try {
            String data = params.get("data");
            Gson gson = new Gson(); 
            Type type = new TypeToken<List<Map<String,String>>>() {}.getType();
            List<Map<String,String>> listParams  = gson.fromJson(data, type);
            
            Map<String, String> errors = new HashMap<String, String>();
            errors = tabValidatorSrv.validateDeleteTabCol(listParams);
            if(errors.size()>0){
                result.put("isSuccess", false);
                result.put("errUsrMsg", errors.get("errUsrMsg"));
            } else {
                for (int i = 0; i < listParams.size(); i++) {
                    tabDao.deleteTabCol(listParams.get(i));
                }
                result.put("isSuccess", true);
                result.put("usrMsg", "삭제 되었습니다.");
            }
        } catch (Exception e){
            result.put("isSuccess", false);
            result.put("errUsrMsg", "시스템 장애가 발생하였습니다");
            result.put("errSysrMsg", e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
    
    
    /**********************************************************************************
    *
    *                                   Tab
    *
    **********************************************************************************/

    public Map<String, Object> selectTabList(Map<String,String> params){

        Map<String, Object> result = new HashMap<String, Object>();

        try{
            List<Map<String,Object>> list = tabDao.selectTabList(params);;
            result.put("isSuccess", true);
            result.put("data", list);
        } catch (Exception e){
            result.put("isSuccess", false);
            result.put("errUsrMsg", "시스템 장애가 발생하였습니다");
            result.put("errSysrMsg", e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    public Map<String, Object> saveTab(Map<String,String> params){
        
        Map<String, Object> result = new HashMap<String, Object>();

        try{
            String data = params.get("data");
            Gson gson = new Gson(); 
            Type type = new TypeToken<List<Map<String,String>>>() {}.getType();
            List<Map<String,String>> listParams  = gson.fromJson(data, type);
    
            Map<String, String> errors = new HashMap<String, String>();
            errors = tabValidatorSrv.validateSaveTab(params);
            if(errors.size()>0){ 
                result.put("isSuccess", false);
                result.put("errUsrMsg", errors.get("errUsrMsg"));
            } else {
                for (int i = 0; i  < listParams.size(); i++) {
                    if  (tabDao.selectTabCnt(params)==0) {
                        tabDao.insertTab(params);
                    } else {
                        tabDao.updateTab(params);
                    }
                }
                result.put("isSuccess", true);
                result.put("usrMsg", "저장 되었습니다");
            }
        } catch (Exception e){
            result.put("isSuccess", false);
            result.put("errUsrMsg", "시스템 장애가 발생되었습니다.");
            result.put("errSysMsg", e.getMessage());
            e.printStackTrace();
        }            
        return result;      
    }

    public Map<String, Object> deleteTab(Map<String,String> params){
        Map<String, Object> result = new HashMap<String, Object>();
        return result;
    }

}
