public class Main {
    public static void main(String[] args) {
        //todo Тут увольняем айтишников
        int countITemployee = 100;
//        for (int i = 1; i <= countITemployee; i++) {
//            if (i % 2 == 0) {
//                System.out.println("An IT specialist with an ID " + i + " has been dismissed");
//            }
//        }
        int i = 1;
        while (i <= countITemployee) {
            if (i % 2 == 0) {
                System.out.println("An IT specialist with an ID " + i + " has been dismissed");
            }
            i++;
        }
    }
}
