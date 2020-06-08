package com.hzit.mySpringMvc.req;

import java.util.ArrayList;
import java.util.List;

public class QueryVo {

   private List<Items> itemsList = new ArrayList<Items>();

    public List<Items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<Items> itemsList) {
        this.itemsList = itemsList;
    }
}
