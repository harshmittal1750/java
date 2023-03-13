class features {

    public String playMusic() {
        return "Music Playing";
    }

    public String getMeAPen(int cost) {
        if (cost >= 10) {
            return "Pen Bought";
        }
        return "Nothing";
    }
}

public class classesAndObjects2 {
    public static void main(String[] args) {
        features objFeatures = new features();
        String str = objFeatures.getMeAPen(10);
        System.out.println(str);
        String str2 = objFeatures.playMusic();
        System.out.println(str2);

    }
}
