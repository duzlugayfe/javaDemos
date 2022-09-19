public class arraysDemo {
    public static void main(String[] args) {
        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Arzu";
        ogrenciler[1] = "Burak";
        ogrenciler[2] = "Serap";
        ogrenciler[2] = "Sedat";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}
