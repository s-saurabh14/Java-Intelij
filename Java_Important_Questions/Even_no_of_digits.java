public class Even_no_of_digits {
    public static void main(String[] args) {
        int[]nums = {437,315,322,431,686,264,442};
       /*  int res=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            while(x!=0){
                x=x/10;
                count++;
                //System.out.println(nums[i]);
                System.out.println(count);
            }
            if(count % 2==0){
                res++;
                //System.out.println(nums[i]);
            }
            count=0;
        }
        System.out.println(res); */

        // Method 2

        int res=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            count=0;
            int num=nums[i];
            count = (int)(Math.log10(num)+1);
            System.out.println(count);
            if(count%2==0){
                res++;
                System.out.println(res);
            }
        }
        System.out.println("final ans : "+res);
    }
}
