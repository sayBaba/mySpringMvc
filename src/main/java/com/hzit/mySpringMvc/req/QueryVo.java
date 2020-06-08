package com.hzit.mySpringMvc.req;

import java.util.ArrayList;
import java.util.List;

public class QueryVo {

    private List<Items> itemList;//商品列表

    public List<Items> getItemList() {
        return itemList;
    }

    public void setItemList(List<Items> itemList) {
        this.itemList = itemList;
    }
}
