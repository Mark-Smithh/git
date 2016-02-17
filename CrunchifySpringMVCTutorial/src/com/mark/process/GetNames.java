package com.mark.process;

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
		nameMap.put("name1","Ya");
		nameMap.put("name2","Yo");
		nameMap.put("name3","Joe");
		nameMap.put("name4","Doe");		
		this.nameMap = nameMap;
	}

	public List<String> getNameList() {
		return nameList;
	}

	public void setNameList(List<String> nameList) {
		nameList = new ArrayList<String>();
		nameList.add("Ya");
		nameList.add("Yo");
		nameList.add("Joe");
		nameList.add("Doe");		
		this.nameList = nameList;
	}

	public void getThem(){
		String[] names = {"Ya","Yo","Joe","Doe"};		
		setNames(names);
	}
	
	private void setNames(String[] names){
		this.names = names;
	}
		
	public String[] getNames(){
		return names;
	}		
}
