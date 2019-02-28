package problem04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int random;
		boolean stop = true;
		String[] problem = new String[18];
		int count=0;
		int pre=0;
		int[] problemcount = new int[18];
		String[] problemanswer = new String[19];
		int answer;
		int playeranswer;
		int correct=0;
		long st,et;
		
		st=System.currentTimeMillis();
		Scanner sc1 = new Scanner(System.in);
		for(int i=1;i<10;i++)
		{
			pre=0;
			for(int j=0;j<2;j++)
			{

				random=(int)(Math.random()*9)+1;
				while(random==pre) { //pre에 저장해서 문제 중복방지
					random=(int)(Math.random()*9)+1;
				}
				pre=random;
				problem[count]=i + "x" + random;
				count++;
			}
		}
		for(int i=0;i<problem.length;i+=2)
		{
			System.out.print(problem[i] + "   ");
			System.out.println(problem[i+1]);
		}

		System.out.println("============================");

		
		for(int i=1;i<19;i++)
		{
			random=(int)(Math.random()*17);
			
			System.out.println(i + ". " + problem[random] + " ?");
			answer = ((int)(problem[random].charAt(0))-48) * ((int)(problem[random].charAt(2))-48);
			System.out.print("answer : " );
			playeranswer = sc1.nextInt();
			if(answer==playeranswer)
				correct++;
				
		}
		et = System.currentTimeMillis();
		System.out.print("1 : " +correct + " /  : ");
		System.out.printf("%dms\n",et-st);
	}
}