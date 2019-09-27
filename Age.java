import java.util.Scanner;
public class Age{
	public static void main (String[] args){
		System.out.print("请输入你的年龄:");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
	switch(age/24){
		case 0:
		    System.out.println("你好，小姐姐");
			break;
		case 1:
		    System.out.println("你好，小姐姐");
			break;
		case 2:
		    System.out.println("你好，大姐姐");
			break;
		default:
		    System.out.println("妖怪吧！！！");
			break;
	}
}

}