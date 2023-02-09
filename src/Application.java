public class Application {
    public static void main(String[] args) {
        String[] words= new String[3];
        words[0]="hello";
        words[1]="you";
        words[2]="there";

        System.out.println(words[1]);

        String text=null;
        System.out.println(text);

        String[] fruit={"apple","kiwi","mandarin","gogo"};
        for(String fruits:fruit){
            System.out.println(fruits);

        }

        int [][]nums={{3,5,3456},{7,8,1234},{56,23,5643}};

        System.out.println(nums[1][1]);

        for(int i=0;i<nums.length;i++){
            for(int row=0;row< nums.length;row++){
                for(int col=0;col<nums[row].length;col++){
                    System.out.print(nums[row][col] + "\t");

                }
                System.out.println();

            }
        }





    }
}
