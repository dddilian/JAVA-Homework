
public class Task4OneToThirty {

	public static void main(String[] args) {
		int[][] matrix = {
				{ 1,  2,  3,  4,  5, 6},
                { 7,  8,  9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30},
			};
			
			for(int row = 0; row < matrix.length; row++){
				for(int col = 0; col < matrix[row].length; col++){
					System.out.print(matrix[row][col] + " ");
				}
				System.out.println();
			}
			System.out.println();
			
			for (int row = matrix.length - 1; row >= 0; row--)           
            {                                                            
                for (int col = matrix.length; col >= 0; col--)   //!!!!    
                {                                                        
                	System.out.print(matrix[row][col] + " ");
                }
          System.out.println();
         }
	}
}