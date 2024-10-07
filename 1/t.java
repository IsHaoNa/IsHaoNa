public class t {
    public static void main(String[] args) {

        int Prime_count = 0;

        System.out.print("101-201之间的素数有："+"【  ");

        for (int i = 101; i < 201; i++) {

            if(Judge(i)){

                System.out.print(i+"  ");

                Prime_count++;

            }
        }
        System.out.println("】");
        System.out.println("101-201之间的素数有：" + Prime_count +"个");
    }

    private static boolean Judge(int i) {
        for (int j = 2; j <= i/2; j++) {
            if(i%j == 0){
                return false;
            }
        }return true;
    }
}
