import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Runner
	{
		static int Counter;
		static String nameInput2;
		static  ArrayList<Integer> arraylist = new ArrayList<Integer>();
		static int n;
		static int target;
		
		public static void main(String[] args)
			{

				greeter();
				quizSetup();
				quiz();

			}
		public static void greeter(){
			
			//Complete
			System.out.println("Hey there! What is your name?");
			Scanner nameInput = new Scanner(System.in);
			nameInput2 = nameInput.nextLine();
			System.out.println("Nice to meet you " + nameInput2 );
			System.out.println("");
		}
		
		public static void quizSetup(){
			System.out.println("Please input a number you would like to add, when you are finished please enter * -1 * ");
			boolean notNegative = true;
			while(notNegative){
					Scanner addNum = new Scanner(System.in);
					int addNum2 = addNum.nextInt();
					if(addNum2 == -1){
						notNegative = false;
						break;
					}else if(addNum2 > 0 && addNum2 < 21){
						Counter++;
						arraylist.add(addNum2);
						
					}else{
						System.out.println("Please input a number between 1 and 20");
					}

				
				
				
				}
			for(int i = 0; i < arraylist.size(); i++){
				Collections.sort(arraylist);
				System.out.print(" [" + arraylist.get(i) + "] ");
			}
				n = new Random().nextInt(Counter);
				System.out.println("");
				target = arraylist.get(n);
				System.out.println("Your target is " + arraylist.get(n) + " At Index " + arraylist.indexOf(n + 1) );
			
			}
		 
			
			
			
		
	
		
		public static void quiz(){
			int left = 0;
			int right = arraylist.size() -1;
//			while(left <= right)
//				{
					int mid = (left + right) / 2;
					
					if(target == arraylist.get(mid)){
						System.out.println("You got it!");
						
					}
					
					if(target < arraylist.get(mid))
						{
							right = mid - 1;
							System.out.println(right + " r");
						}
					else{
						left = mid + 1;
						System.out.println(left + "l");
						
					}
					
//				}
			
			
		}

	}
