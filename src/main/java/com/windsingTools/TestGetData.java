package com.windsingTools;

import java.util.ArrayList;
import java.util.HashMap;

public class TestGetData {
    public static void main(String[] args) throws Exception {
        GetCaseData getCaseData = new GetCaseData();
        ArrayList<HashMap<String, String>> sheet1 = getCaseData.getData("\\", "TestData.xlsx", "Sheet1");
        System.out.println(sheet1);
        String name = sheet1.get(0).get("name");
        System.out.println(name);
    }
}
