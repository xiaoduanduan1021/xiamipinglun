package com;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class test {

	public static void main(String[] args) throws InterruptedException, IOException {
		
//		for (int i = 0; i < 20; i++) {
//			System.out.println(i%3);
//		}
		
		new test().fabuyige();
	}
	
	
	//测试发布1个
	
	public void fabuyige () throws IOException{

		System.out.println("开始");
		
		
		
		
		
		
		String content = "  -843-首-抖//-音-音-乐-下-载-  http://250xyz.xyz/douyin/jihe4ban.html?a=xiao ";
		String oid = "360511724";
		String xiamitoken = "fd2eaf10c4be745ffb4c19408498f8d6";
		String cookie = "gid=152997932279965; _xiamitoken=fd2eaf10c4be745ffb4c19408498f8d6; _unsign_token=6d3914d8fc8f98bbd0e5159fb0c5f343; user_from=1; cna=vI+4E+zPIjoCAXoOJ+CTzTYk; UM_distinctid=16439e01220271-014290d7042441-454c092b-140000-16439e01221387; xmgid=ba6a624f-3294-49e4-b53c-b93da0f2ce10; _m_h5_tk=688809ff12e05ff7762b1eb6ba3ae29b_1529987933875; _m_h5_tk_enc=4ada2c0d6ca50a32bbf70b041d03fa86; uidXM=376828102; CNZZDATA921634=cnzz_eid%3D360374184-1529974107-https%253A%252F%252Fwww.baidu.com%252F%26ntime%3D1530057202; CNZZDATA2629111=cnzz_eid%3D1553856013-1529975217-https%253A%252F%252Fwww.baidu.com%252F%26ntime%3D1530061154; xm_token=ebb2c9a075490f1e3dc34fd658e9c13b; member_auth=2TDLG4ZPum1u0aiWT4w2e3VN5e3USTXVlttWjb8otVZ2IIlcNYCtx6uSRQ1A2iiSqFomVuzVgmMK; user=376828102%22rayoht%22images%2Favatar_new%2F750052319_1529982542.jpg%220%22151%22%3Ca+href%3D%27http%3A%2F%2Fwww.xiami.com%2Fwebsitehelp%23help9_3%27+%3ELv3%3C%2Fa%3E%220%220%220%225d47a2c085%221530061716; t_sign_auth=0; isg=";
		
		
		
		
		
		
		
		
		
		System.out.println("组织完成数据");
		
		
		
		String url = "https://www.xiami.com/commentlist/add?type=2&oid=OID&relids=&mode=ajax&_xiamitoken=XIAMITOKEN";
		content = Math.random()+content+"     "+Math.random();
	 	url = url.replaceAll("OID", ""+oid);
	 	url = url.replaceAll("XIAMITOKEN", ""+xiamitoken);
		
		Map<String, String> datamap = new HashMap<String, String>();
		datamap.put("type", "2");
		datamap.put("content", content);
		
		
		Map<String, String> headermap = new HashMap<String, String>();
		
  		headermap.put("referer", "https://www.xiami.com/collect/"+oid);
  		headermap.put("accept-language", "zh-CN,zh;q=0.8");
  		headermap.put("accept-encoding", "gzip, deflate, sdch, br");
  		
		String jieguo = new HttpGetPost().httpPost(url, datamap, cookie,headermap);
		jieguo = new com.unicode.UnicodeToUtf8().decodeUnicode(jieguo);
		
		System.out.println(jieguo);
		
		if (jieguo.indexOf("\"status\":\"ok\"")>-1) {
			System.out.println("ok");
		}else{
			System.out.println(jieguo);
		}
		
	}
}
