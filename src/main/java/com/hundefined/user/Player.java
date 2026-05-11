package com.hundefined.user;

import java.util.List;

public class Player {

    String name;
    List<Attack> attacks;

    public void fromJSON(String json){

    }

    public String toJSON(){

        StringBuilder jsonString = new StringBuilder();
        jsonString.append("{");
        jsonString.append("\"name\":\""+name+"\",");

        jsonString.append("}");

        return "";
    }
}
