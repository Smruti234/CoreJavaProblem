package CoreJavaProblem;

public class PowerTwo {
	public static void main(String[] args) {

				int num, mul = 1;
		num = Integer.parseInt(args[0]);
		if (num > 31) {
			System.out.println("value of number should be less than 31");
			return;
		}
		else {
			System.out.println(mul);
			for (int j = 1; j <= num; j++) {
				mul = mul * 2;
				System.out.println(mul);
			}
		}

	}

}


