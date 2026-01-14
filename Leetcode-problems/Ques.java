public class Ques{
    public static void main(String args[]){
        /*int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int n = matrix.length, m = matrix[0].length;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<=m-1;j++){
                matrix[j][n-i-1] = matrix[i][j];
                System.out.println("matrix[" +j+"][" + (n-i-1) + "]" + "=" + matrix[j][n-i-1] + "matrix[" +i+"][" + j + "]" + "=" + matrix[i][j]);
                
            }
            
            System.out.println();
            
        }
        System.out.println("matrix print.......");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }*/

        /*int nums[] = {1,1,2};
        int c = 0;
        for(int i=0;i<nums.length;i++){
            if(i+1 < nums.length && nums[i] != nums[i+1]){
                c++;
            }
        }
        if(nums[nums.length-1] != nums[nums.length-2]){
            c++;
        }
        int count[] = new int[c]; int k=0;
        for(int i=0;i<nums.length;i++){
            if(i+1 < nums.length && nums[i] != nums[i+1]){
                count[k++] = nums[i]; 
            }
        }
        if(nums[nums.length-1] != nums[nums.length-2]){
            count[count.length-1] = nums[nums.length-1]; 
        }
        System.out.println(c);
        for(int i=0;i<count.length;i++){
            System.out.print(count[i]);
        }*/

       int num[] ={1,2,0,0};   int k =34;
    //    List<Integer> digitList = new ArrayList<>();
        int count = 0, pow = 0;
        for(int i=0;i<num.length;i++){
            count = count * num[i] + (int)Math.pow(10, pow);
            System.out.println(count);
            pow++;
        }
        count += k;
        System.out.println(count);
        // while(count > 0){
        //     digitList.add(0, count % 10);
        //     count = count / 10;
        // }

        // for(int i=0;i<digitList.length;i++){
        //     System.out.print(digitList[i]);
        // }
    }
}