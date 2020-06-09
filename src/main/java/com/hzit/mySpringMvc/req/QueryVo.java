package com.hzit.mySpringMvc.req;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueryVo {

    private List<Items> itemList;//商品列表


    public Map<String, Object> getItemInfo() {
        return itemInfo;
    }

    public void setItemInfo(Map<String, Object> itemInfo) {
        this.itemInfo = itemInfo;
    }

    private Map<String, Object> itemInfo = new HashMap<String, Object>();


    public List<Items> getItemList() {
        return itemList;
    }

    public void setItemList(List<Items> itemList) {
        this.itemList = itemList;
    }
}
