package com;

import java.io.IOException;



//这个类是只评论大单的
public class DaDanPingLun {

	
	
	

	
	
	
	
	//每分钟检测一次，如果不是则发送，如果是则输出是
	public static void main(String[] args) throws InterruptedException{
		System.out.println("大单");
		
		

		
		
		
//		----------------------
		
//		1
//3114754415----6c3x2pr4可以登陆
//		2
//3115665963----2u9a0g9s可以登录
//		3
//2681302524----b10tj30w可以登录
//		4
//3476456445----hrdnm261可以登录
		
		
		//这个是用的大列表内的因为需要经常换用户不然会被和谐几率比较大
		String list [][] = {
				{
					"gid=152997932279965; join_from=1zufSNtP6D010%2FjCCA; _xiamitoken=fd2eaf10c4be745ffb4c19408498f8d6; _unsign_token=6d3914d8fc8f98bbd0e5159fb0c5f343; user_from=1; cna=vI+4E+zPIjoCAXoOJ+CTzTYk; UM_distinctid=16439e01220271-014290d7042441-454c092b-140000-16439e01221387; xmgid=ba6a624f-3294-49e4-b53c-b93da0f2ce10; CNZZDATA921634=cnzz_eid%3D360374184-1529974107-https%253A%252F%252Fwww.baidu.com%252F%26ntime%3D1529979589; CNZZDATA2629111=cnzz_eid%3D1553856013-1529975217-https%253A%252F%252Fwww.baidu.com%252F%26ntime%3D1529980617; t_sign_auth=0; xm_token=387cec668139e12719fc0a9ca26383b8; uidXM=376828765; member_auth=hD%2FLGoxL6zhghqjAH4swdSZJ6baAHziPyN9Qj%2BMtt1R3IIsMYYL9x6uSRQ1A2iiUrl0mTuvdi2IQ; user=376828765%22jfqfin%22images%2Favatar_new%2F1765752091_1529983066.jpg%220%220%22%3Ca+href%3D%27http%3A%2F%2Fwww.xiami.com%2Fwebsitehelp%23help9_3%27+%3ELv1%3C%2Fa%3E%220%220%220%22a20cf69020%221529983068; isg=",
					"fd2eaf10c4be745ffb4c19408498f8d6"
				},
				{
					"gid=152997932279965; _unsign_token=6d3914d8fc8f98bbd0e5159fb0c5f343; cna=vI+4E+zPIjoCAXoOJ+CTzTYk; UM_distinctid=16439e01220271-014290d7042441-454c092b-140000-16439e01221387; xmgid=ba6a624f-3294-49e4-b53c-b93da0f2ce10; join_from=1zufSNtP6D010%2FjCCA; t_sign_auth=0; _m_h5_tk=23bc5ef0dea9e25bcc6097727f469068_1531123137854; _m_h5_tk_enc=285eb63b246fccb9f308c4f571f445a2; _xiamitoken=2f84f69067c4e0c3c47e7ad282bff286; CNZZDATA2629111=cnzz_eid%3D1553856013-1529975217-https%253A%252F%252Fwww.baidu.com%252F%26ntime%3D1531204494; CNZZDATA921634=cnzz_eid%3D360374184-1529974107-https%253A%252F%252Fwww.baidu.com%252F%26ntime%3D1531202412; xm_token=de55f5916a3e31ed8456882695b06d21; uidXM=376829207; member_auth=2TDNSNxL4jgy16HFHIw0diRLs7XRE2KFxIoFi7F%2BslMnI4tbZdb6x6uSRQ1A2imRqF8mwhEGCpTbyEry%2FGA5; user=376829207%22%E6%9C%AA%E7%9F%A5%E7%94%9F%E7%89%A9%22images%2Favatar_new%2F1097151297_1529983399.jpg%220%225731%22%3Ca+href%3D%27http%3A%2F%2Fwww.xiami.com%2Fwebsitehelp%23help9_3%27+%3ELv7%3C%2Fa%3E%220%220%220%22ab16277e10%221531205847; user_from=1; isg=",
					"2f84f69067c4e0c3c47e7ad282bff286"
				},
				{
					"gid=152997932279965; _unsign_token=6d3914d8fc8f98bbd0e5159fb0c5f343; cna=vI+4E+zPIjoCAXoOJ+CTzTYk; UM_distinctid=16439e01220271-014290d7042441-454c092b-140000-16439e01221387; xmgid=ba6a624f-3294-49e4-b53c-b93da0f2ce10; join_from=1zufSNtP6D010%2FjCCA; t_sign_auth=0; _m_h5_tk=23bc5ef0dea9e25bcc6097727f469068_1531123137854; _m_h5_tk_enc=285eb63b246fccb9f308c4f571f445a2; _xiamitoken=2f84f69067c4e0c3c47e7ad282bff286; CNZZDATA2629111=cnzz_eid%3D1553856013-1529975217-https%253A%252F%252Fwww.baidu.com%252F%26ntime%3D1531204494; CNZZDATA921634=cnzz_eid%3D360374184-1529974107-https%253A%252F%252Fwww.baidu.com%252F%26ntime%3D1531202412; user_from=1; xm_token=930e426576828f3832f37951806ab553; uidXM=376856842; member_auth=hD2fGIYd7mkzhKeUG4hhdy1OsLCFSGKPx4sEh%2BUutQB3dt1dMNL6xquSRQ1A3SabrFomzRgaCL7yy2PN%2FHMUHyoR; user=376856842%22%E9%95%B6%E5%B5%8C%E4%BD%A0%E7%9A%84%E6%B3%AA%22images%2Favatar_new%2F1216207498_1530003754.jpg%220%225598%22%3Ca+href%3D%27http%3A%2F%2Fwww.xiami.com%2Fwebsitehelp%23help9_3%27+%3ELv7%3C%2Fa%3E%220%220%220%226a981b21f6%221531206010; isg=",
					"2f84f69067c4e0c3c47e7ad282bff286"
				},
				{
					"gid=152997932279965; _unsign_token=6d3914d8fc8f98bbd0e5159fb0c5f343; cna=vI+4E+zPIjoCAXoOJ+CTzTYk; UM_distinctid=16439e01220271-014290d7042441-454c092b-140000-16439e01221387; xmgid=ba6a624f-3294-49e4-b53c-b93da0f2ce10; _xiamitoken=a5326fc2d0c958fa5daf290b103d8d1b; user_from=1; CNZZDATA2629111=cnzz_eid%3D1553856013-1529975217-https%253A%252F%252Fwww.baidu.com%252F%26ntime%3D1530777254; CNZZDATA921634=cnzz_eid%3D360374184-1529974107-https%253A%252F%252Fwww.baidu.com%252F%26ntime%3D1530777287; join_from=1zufSNtP6D010%2FjCCA; t_sign_auth=0; _m_h5_tk=f332007b44ace10facbe83629f2c18f0_1530784859892; _m_h5_tk_enc=710db12930c5bf88181ac186b7689afc; xm_token=ee62246dbbfa05234ca63d51fea806f0; uidXM=377697570; member_auth=0W6bGo9Jvzsz0aWWT9o5dSJKs%2B2FEmCHydlZ3eYs5lEjJo8NN4Wox6uSRQxO0SeWr1gmzRgwCKbuwGLh%2FmE7HAoWwM9o; user=377697570%22%E9%95%9C%E5%AD%90%EF%BC%8C%E5%88%AB%E5%93%AD%EF%BC%81%22images%2Favatar_new%2F1349040276_1530782237.jpg%220%220%22%3Ca+href%3D%27http%3A%2F%2Fwww.xiami.com%2Fwebsitehelp%23help9_3%27+%3ELv1%3C%2Fa%3E%220%220%220%220a5da699d6%221530782238; isg=",
					"a5326fc2d0c958fa5daf290b103d8d1b"
				}
		};
		
		
		
		String oid = "355288362";
		String content = "";
		
		
		
		
		//符号库
		//		String fuhaoarray [] ={" - "," = "," + "," , "," . "," * "," / "," | "," \\ "," ` "," ~ "," ! "," @ "," # "," $ "," % "," ^ "," & "};
		String fuhaoarray [] ={"-","=","+",",",".","*","/","|","\\","`","~","!","@","#","$","%","^","&"};
		//使用符号id
		int fuhaoid = 0;
		
		

		
		for (int i = 0; i < 10000000; i++) {
				
			
			
			
			
			
			
			
			
				System.out.println("生成内容");
				System.out.println("符号id"+fuhaoid);
				
				int num=(int)(Math.random()*10001000);			//返回大于等于0小于n之间的随机数
				
				content ="";
				content+= "843"+fuhaoarray[fuhaoid];
				content+= "首"+fuhaoarray[fuhaoid];
				content+= "抖"+fuhaoarray[fuhaoid]+fuhaoarray[fuhaoid];
				content+= "音"+fuhaoarray[fuhaoid];
				content+= "音"+fuhaoarray[fuhaoid];
				content+= "乐"+fuhaoarray[fuhaoid];
				content+= "下"+fuhaoarray[fuhaoid];
				content+= "载"+fuhaoarray[fuhaoid];
				content+= "   http://250xyz.xyz/douyin/jihe4ban.html   "+fuhaoarray[fuhaoid];
				System.out.println(content);
				
				
				
				
				
				
				
				
				
				
				System.out.println("自动更改用户");
				int lunliuid = i%3;
				System.out.println("用户："+lunliuid);
				
				String cockie = list[lunliuid][0];
				String xiamitoken = list[lunliuid][1];
				
				System.out.println(cockie);
				System.out.println(xiamitoken);
				
				System.out.println("检查是否第一大单");
				boolean diyi = new HttpGetPost().dyno1("https://www.xiami.com/collect/"+oid,"250xyz.xyz");
				System.out.println(diyi);
				
				
				
				
				//如果是第一
				if (diyi) {
					
					//延迟
					for (int k = 0; k < 3; k++) {
						Thread.sleep(1000);
						System.out.print(k+",");
					}
					
				}else{
					
						//延迟
					for (int k = 0; k < 0; k++) {
						Thread.sleep(1000);
						System.out.print(k+",");
					}
					
					
					System.out.println("发布");
					try {
						new HttpGetPost().fabupinglun(cockie, xiamitoken, oid,content);
					} catch (IOException e) {
						e.printStackTrace();
					}
					
					//延迟
					for (int k = 0; k < 3; k++) {
						Thread.sleep(1000);
						System.out.print(k+",");
					}
					
					System.out.println("再次检查是否第一大单");
					boolean zaicidiyi = new HttpGetPost().dyno1("https://www.xiami.com/collect/"+oid,"250xyz.xyz");
					System.out.println(zaicidiyi);
					
					
					
					if(!zaicidiyi){
						
						
						//如果再次检测不是第一则发消息
						//new sendMsg().sendmsg("no1 no1");
						
						
						
						System.out.println("再次检测失败，自动更改符号");
						if (fuhaoid == fuhaoarray.length-1) {
							fuhaoid = 0;
						}else{
							fuhaoid++;
						}
						
						
						
						
						
					}
					
					
					
					
					//延迟最低13秒
					//如果不紧急可以设置高点，防止封号
					for (int k = 0; k < 13; k++) {
						Thread.sleep(1000);
						System.out.print(k+",");
					}
					System.out.println();
				}
		}
	}
	
	
	
	//生成随机符号
	public String getsuijifu(){

		//生成随机数
		//返回符号
		return "";
	}
}
