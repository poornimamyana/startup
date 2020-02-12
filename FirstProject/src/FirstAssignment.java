
public class FirstAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1 
		 * 1 2 
		 * 1 2 3 
		 * 1 2 3 4 
		 * 1 2 3 4 5 
		 * 1 2 3 4 5 6
		 */
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		/*
		 * A 
		 * A B 
		 * A B C
		 */
		for (int i = 65; i <= 67; i++) {
			for (int j = 65; j <= i; j++) {
				System.out.print((char) j + " ");
			}
			System.out.println();
		}
	
	/*
	 * $ $ $ $
	 * $     $
	 * $     $
	 * $ $ $ $
	 * */
	for (int i = 0; i <=3; i++) {
		for (int j = 0; j <=3; j++) {
			if((i==1&&j==1)|| (i==1&&j==2) || (i==2&&j==1) || (i==2&&j==2))
			{
				System.out.print("  ");
			}
			else
			System.out.print('$'+" ");
		}
		System.out.println();
}
	}
}
