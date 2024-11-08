import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // charChart();
        // random();
        findChar("/");
    }

    public static void random() {
        int leftLimit = 33; // letter 'a'
        int rightLimit = 127; // letter 'z'
        int targetStringLength = 16;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            if(randomLimitedInt!=96){

                buffer.append((char) randomLimitedInt);
            }
        }
        String generatedString = buffer.toString();

        System.out.println(generatedString);
    }

    public static void charChart() {
        int end = 127;
        for (int i = 33; i < end; i++) { // 33-95,97-126
            if(i!=96){

                int randomLimitedInt = i;
                System.out.println(randomLimitedInt + "=" + (char) randomLimitedInt);
            }
        }
    }

    public static int findChar(String expression){
        int i=0;
        
        while(!expression.equals((char) i+"")){
            i++;
        }
        System.out.println("Found "+expression+" in position: "+i);
        return i;
    }

}
// Ii/_o2:3Enmh}LD}
