package com.example.xiaojin20135.basemodule.retrofit.bean;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * Created by lixiaojin on 2018-07-12.
 * 功能描述：
 */

public class ResponseBean {
    private String[] actionErrors;
    private String[] actionMessages;
    private ActionResult actionResult;
    private int adminlevel;

    private List<Map> cityList;
    private List<Map> companycategoryList;
    private List<Map> companynatureList;
    private List<Map> countyList;
    private List<Map> enabledList;
    private List<Map> mapJson;
    private Map paraDataMap;
    private String[] permissionButton;
    private List<Map> provinceList;
    private Map queryParamMap;
    private List<Map> treeJson;

    private UserBean userBean;
    private Map dataMap;
    private String method;
    private List<Map> listDataMap;
    private List<Map> flowidList;
    private String records;//共有多少条记录
    private String total;//共有多少条页
    private String page; //当前页号
    //文件流
    private InputStream inputStream;

    public String[] getActionErrors() {
        return actionErrors;
    }

    public void setActionErrors(String[] actionErrors) {
        if(actionErrors != null)
            this.actionErrors = actionErrors;
    }

    public String[] getActionMessages() {
        return actionMessages;
    }

    public void setActionMessages(String[] actionMessages) {
        if(actionMessages != null)
            this.actionMessages = actionMessages;
    }

    public ActionResult getActionResult() {
        return actionResult;
    }

    public void setActionResult(ActionResult actionResult) {
        if(actionResult != null)
            this.actionResult = actionResult;
    }

    public int getAdminlevel() {
        return adminlevel;
    }

    public void setAdminlevel(int adminlevel) {
        this.adminlevel = adminlevel;
    }

    public UserBean getUserBean() {
        return userBean;
    }

    public void setUserBean(UserBean userBean) {
        if(userBean != null)
            this.userBean = userBean;
    }

    public Map getDataMap() {
        return dataMap;
    }

    public void setDataMap(Map dataMap) {
        if(dataMap != null)
            this.dataMap = dataMap;
    }

    public List<Map> getListDataMap() {
        return listDataMap;
    }

    public void setListDataMap(List<Map> listDataMap) {
        if(listDataMap != null)
            this.listDataMap = listDataMap;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        if(inputStream != null)
            this.inputStream = inputStream;
    }

    public String getRecords() {
        return records;
    }

    public void setRecords(String records) {
        this.records = records;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public List<Map> getFlowidList() {
        return flowidList;
    }

    public void setFlowidList(List<Map> flowidList) {
        this.flowidList = flowidList;
    }

    public String getMethod () {
        return method;
    }

    public void setMethod (String method) {
        this.method = method;
    }

    public List<Map> getCityList () {
        return cityList;
    }

    public void setCityList (List<Map> cityList) {
        this.cityList = cityList;
    }

    public List<Map> getCompanycategoryList () {
        return companycategoryList;
    }

    public void setCompanycategoryList (List<Map> companycategoryList) {
        this.companycategoryList = companycategoryList;
    }

    public List<Map> getCompanynatureList () {
        return companynatureList;
    }

    public void setCompanynatureList (List<Map> companynatureList) {
        this.companynatureList = companynatureList;
    }

    public List<Map> getCountyList () {
        return countyList;
    }

    public void setCountyList (List<Map> countyList) {
        this.countyList = countyList;
    }

    public List<Map> getEnabledList () {
        return enabledList;
    }

    public void setEnabledList (List<Map> enabledList) {
        this.enabledList = enabledList;
    }

    public List<Map> getMapJson () {
        return mapJson;
    }

    public void setMapJson (List<Map> mapJson) {
        this.mapJson = mapJson;
    }

    public Map getParaDataMap () {
        return paraDataMap;
    }

    public void setParaDataMap (Map paraDataMap) {
        this.paraDataMap = paraDataMap;
    }

    public String[] getPermissionButton () {
        return permissionButton;
    }

    public void setPermissionButton (String[] permissionButton) {
        this.permissionButton = permissionButton;
    }

    public List<Map> getProvinceList () {
        return provinceList;
    }

    public void setProvinceList (List<Map> provinceList) {
        this.provinceList = provinceList;
    }

    public Map getQueryParamMap () {
        return queryParamMap;
    }

    public void setQueryParamMap (Map queryParamMap) {
        this.queryParamMap = queryParamMap;
    }

    public List<Map> getTreeJson () {
        return treeJson;
    }

    public void setTreeJson (List<Map> treeJson) {
        this.treeJson = treeJson;
    }
}
