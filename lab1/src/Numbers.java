public class Numbers {
    int maxsize = 300;
    int curr = 0;
    int sum = 0;

    public Numbers(){}
    public void find() {
        for( int i = 0; i <= maxsize; i++) {
            if((i % 4 == 0) && (i % 6 != 0)) {
                curr = i;
                while(curr > 0) {
                    sum += curr % 10;
                    curr /= 10;
                }
                if (sum < 10)
                    System.out.println(i);
            }
            sum = 0;
        }
    }
}
