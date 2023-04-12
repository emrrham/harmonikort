public class harmonikort {
    public static void main(String[] args) {

        double[] list = {10,20,30,40,50,60};
        double anlami = 0;
        for (int i = 0; i < list.length; i++){
            anlami += 1/(list[i]);
        }
        double harmonikortalama = list.length / anlami;
        System.out.println(harmonikortalama);
    }
}