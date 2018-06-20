package test.main;

import test.mypac.Wallet;

public class MainClass09 {
	public static void main(String[] args) {
		//지갑에 돈을 넣어두고
		Wallet.addMoney(1000);
		
		Runnable run1=new Runnable() {

			@Override
			public void run() {
				//인출한 돈을 저장할 지역 변수
				int totalMoney=0;
				//Wallet에서 돈 인출
				while(true) {
					//김구라 이름으로 돈 인출
					int money=Wallet.getMoney("김구라");
					//0이 리턴되면 반복문 탈출
					if(money==0)break;
					//인출한 돈을 지역 변수에 누적 시키기
					totalMoney += money;
				}
				System.out.println("김구라가 인출한 돈 :"+totalMoney);
			}			
		};
				

		Runnable run2=new Runnable() {

			@Override
			public void run() {
				//인출한 돈을 저장할 지역 변수
				int totalMoney=0;
				//Wallet에서 돈 인출
				while(true) {
					//김구라 이름으로 돈 인출
					int money=Wallet.getMoney("원숭이");
					//0이 리턴되면 반복문 탈출
					if(money==0)break;
					//인출한 돈을 지역 변수에 누적 시키기
					totalMoney += money;
				}
				System.out.println("원숭이가 인출한 돈 :"+totalMoney);
			}			
		};
		
		new Thread(run1).start();
		new Thread(run2).start();
	}
}



