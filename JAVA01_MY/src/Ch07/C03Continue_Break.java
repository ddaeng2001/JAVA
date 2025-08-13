package Ch07;

	import java.util.Scanner;

	public class C03Continue_Break {

		public static void main(String[] args) {

			
			
			
			
			
			
			//--------------------------
			// 1 break
			//--------------------------
			// -1을 입력하기 전까지 정수값을 누적하여 합을 구하고 출력
//			Scanner sc = new Scanner(System.in);
//			int n;
//			int sum = 0;
//			while(true) {
//				
//				n=sc.nextInt();
//				if(n==-1) //-1를 넣는 순간 break가 실행되면서 누적합이 프린트됨
//					break;
//				
//				sum+=n;
//			}
//			System.out.println("SUM : " + sum);
//			
//			sc.close();
			//--------------------------
			// 모든 반복문 탈출 : flag
			//--------------------------
			// 7 x 7 = 49 출력 이후 모든 반복문 탈출
//			boolean flag = false;
//			int dan = 2;
//			while (dan < 10) {
//				
//				int i = 1;
//				while (i < 10) {
//					System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//					// 7 x 7 = 49 출력 이후 모든 반복문 탈출
//					if(dan==7 && i==7) {
//						flag=true; //가장 안쪽의 while문 탈출 -- 상태값 변경해서!
//						break;
//					}
//					i++;
//				}
//				
//				System.out.println();
//	
//				if(flag) 
//					break;
//				dan++;
//			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//--------------------------
			// 2.EXIT
//			//--------------------------
//			int dan = 2;
//			
//			Exit:
//			while (dan < 10) {
//				
//				int i = 1;
//				while (i < 10) {
//					System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//					// 7 x 7 = 49 출력 이후 모든 반복문 탈출
//					if(dan==7 && i==7) {
//						break Exit; //Exit가 지정한 flag까지 다 벗어남! 즉 큰 while문 자체를 탈출!
//					}
//					i++;
//				}
//		
//				System.out.println();
//				dan++;
//			}
			
			//--------------------------
			// continue
			//--------------------------
			// 1부터 10까지의 수중에 3의 배수를 제외한 합 출력
			int i=1;
			int sum = 0;
			while(i<=10) {
				
				if(i%3==0) {
					i++;
					continue; // 반복문 내 continue는 흐름대로 내려가는 게 아니라 다시 반복문의 조건식으로 올라가서 다시 봄
									//이렇게 되면 loop 발생
				}
				
				System.out.println("i : " + i);
				sum+=i;
				i++;
			}
			System.out.println("SUM : " + sum);
			

			
		}

	}





