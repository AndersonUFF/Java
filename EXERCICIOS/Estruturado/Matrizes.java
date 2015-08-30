class Matrizes {
	public static void main(String[] args){
		int mat[][];
		mat = new int [5][5];

		for (byte l = 0; l < 5; l++){
			for(byte c = 0; c < 5; c++){
				if((l % 2) == (c % 2)){
					mat[l][c] = 0;
				} else {
					mat[l][c] = 1;
				}
			}
		}

		for (byte l = 0; l < 5; l++){
			for(byte c = 0; c < 5; c++){
				System.out.print(mat[l][c] + " ");
			}
			System.out.println();
		}
	}
}