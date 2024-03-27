package Practice_set_6;

public class Addition_matrix {
    public static void main(String[] args) {
        

        int[][] arr1 = {{1,2,3}, 
                        {4,5,6}};

        int[][] arr2 = {{11,12,13},
                        {14,15,16}};

        int[][] add = new int[2][3];

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){

                add[i][j] = arr1[i][j] + arr2[i][j]; 
            }
        }


        for(int k = 0; k < arr1.length; k++){
            for(int l = 0; l < arr1[k].length; l++){

                System.err.println(add[k][l]); 
            }
        }

        

    }
}
