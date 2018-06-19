package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass10 {
	public static void main(String[] args) {
		//Map<String,Object>를 저장할 ArrayLIst 객체를 생성
		//해서 참조값을 members라는 변수에 담에보세요
	
		List<Map<String,Object>> members=new ArrayList<>();
		
		//회원 3명의 정보를 담아보세요
		//map 하나당 회원정보 하나.
		Map<String, Object> map=new HashMap<>();
		map.put("num", 1);
		map.put("name", "김구라");
		map.put("addr", "노량진");
	
		Map<String, Object> map2=new HashMap<>();
		map2.put("num", 2);
		map2.put("name", "만두");
		map2.put("addr", "인천");
		
		Map<String, Object> map3=new HashMap<>();
		map3.put("num", 3);
		map3.put("name", "만두2");
		map3.put("addr", "인천2");
		
		//ArrayList 객체에 담기
		members.add(map);
		members.add(map2);
		members.add(map3);
		
		//데이터 참조
		List<Map<String,Object>> a=members;
		Map<String,Object> b=members.get(0);
		int c=(int)members.get(0).get("num");
		String d=(String)members.get(0).get("name");
		String e=(String)members.get(0).get("addr");
		
	}
}
