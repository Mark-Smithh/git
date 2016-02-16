package com.crunchify.process;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GetNames {

	private String[] names;
	private List<String> nameList;
	private Map<String,String> nameMap;
	
	public Map<String, String> getNameMap() {
		return nameMap;
	}

	public void setNameMap(Map<String, String> nameMap) {
		nameMap.put("name1","Mark");
		nameMap.put("name2","Pam");
		nameMap.put("name3","Nia");
		nameMap.put("name4","Jayda");		
		this.nameMap = nameMap;
	}

	public List<String> getNameList() {
		return nameList;
	}

	public void setNameList(List<String> nameList) {
		nameList = new ArrayList<String>();
		nameList.add("Mark");
		nameList.add("Pam");
		nameList.add("Nia");
		nameList.add("Jayda");		
		this.nameList = nameList;
	}

	public void getThem(){
		String[] names = {"Mark","Pam","Nia","Jayda"};		
		setNames(names);
	}
	
	private void setNames(String[] names){
		this.names = names;
	}
		
	public String[] getNames(){
		return names;
	}		
}
