package com;

import java.io.IOException;
import java.util.Date;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class sendMsg {

	
	//间隔时间，每发一次消息最少间隔多少分钟
	static double jiange = 20;
	
	
	//上次发消息时间毫秒，默认0就可以
	static long upTime = 0;
	
	//发消息到手机
	public String sendmsg(String con){
		
			
		
		
		//如果距离上次发布时间间隔大于指定时间则发送
		if (new Date().getTime() - upTime  >= 1000*60*jiange) {
			
			upTime = new Date().getTime();
			System.out.println("可以发送");
		
		}else{
			System.out.println("距离上次时间太近不能发送");
			return "";
		}
		
		
		
		
		
			Document doc = null;
			String jieguo = "";
			try {
				doc = Jsoup.connect("http://121.42.226.90:9001/sendMsgTest.action?content="+con).timeout(1000 * 10).get();
				System.out.println(new Date().toGMTString());
				System.out.println("发送成功");
			} catch (IOException e) {
				System.out.println("dyno1超时");
			}
		
			
			
			
			
		return "";
	}
	
	
	public static void main(String[] args) {
		new sendMsg().sendmsg("128");
	}
}
