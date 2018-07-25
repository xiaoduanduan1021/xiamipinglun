package com;

import org.eclipse.jdt.internal.compiler.batch.Main;

public class getAllNo1 {

	//查看所有连接中是否是第一
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("检查是否第一");
		
		String list [][][] = new HttpGetPost().getList();
		
		for (int i = 0; i < list.length; i++) {
			String yigezhanghu[][] = list[i];
			for (int j = 0; j < yigezhanghu[1].length; j++) {
				String oid = yigezhanghu[1][j];
				
				System.out.println(oid);
				boolean diyi = new HttpGetPost().dyno1("https://www.xiami.com/collect/"+oid,"250xyz.xyz/zhifubao");
				System.out.println(diyi);
				//延迟
				for (int k = 0; k < 0; k++) {
					Thread.sleep(1000);
					System.out.print(k+",");
				}
				System.out.println();
			}
		}
		
		System.out.println("完成");
	}
}
