package test.main;

import java.util.HashMap;
import java.util.Map;
/*
 * [ HashMap ]
 * 
 * - key : value 형태로 데이터를 관리하고자 할 때 사용한다
 * - Generic 클래스는 2개를 지정해야 한다
 *   key Generic, value Generic
 * - 데이터 저장 : .put(key,value)
 * - 데이터 참조 : .get(key)
 * - key 존재여부 확인 : .containsKey(key)
 * - 데이터 모두 삭제 : .clear()
 * - 특정 데이터 삭제 : .remove(key)
 */
public class MainClass09 {
	public static void main(String[] args) {
		//회원 한명의 정보를 HashMap 객체에 담기
		//HashMap<String, Object> map=new HashMap<>();
		Map<String, Object> map=new HashMap<>();
		map.put("num", 1);
		map.put("name", "김구라");
		map.put("addr", "노량진");
		map.put("isMan", true);
/*		map은 인덱스로 관리하지 않고 key값으로 정보를 관리함.
*		key값으로 쓰는 Data type은 String
*		대부분 String을 key값으로 씀. Object 관리~!
*		
*		여러개의 type을 key값으로 관리하고 싶으면 map!
*		하나의 type을 int(index)로 관리하고 싶으면 ArrayList!
*/		
		
		//HashMap 객체에 있는 데이터 참조
		int num=(int)map.get("num");
		String name=(String)map.get("name");
		String addr=(String)map.get("addr");
		boolean isMan=(boolean)map.get("isMan");
		//type 다 기억해서 테스팅 해야하는 게 약간 불편함
		
		//삭제
		map.remove("addr");
		
		//key 존재여부
		boolean result=map.containsKey("num");
		
		//모두 삭제
		map.clear();
		
	}
}
