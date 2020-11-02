
public class HelloWorld {
	

	public static void main(String[] args) {
		
		int [][] a= {{1,2},{3,4},{5,6},
				{7,8},{9,10},{11,12}};
		System.out.println(a.length);
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<2;j++) {
				
				System.out.println("arr[" + i + "][" + j + "] = "
                        + a[i][j]);
			}
				System.out.println();
		}
	
	}}


