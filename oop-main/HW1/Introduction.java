public class Introduction {
    public static void main(String[] args) {
        String hoTen = "Nguyen Le Duy Nhan";
        String msv = "24020256";
        String lop = "OOP 4";
        String githubUser = "duynhan216";
        String email = "nguyenleduynhan06@gmail.com";
        System.out.println(hoTen + "\t" + msv + "\t" + lop + "\t" + githubUser + "\t" + email);

        for (int i = 9; i > 0; i--) {
            if (i > 1) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Take one down, pass it around,");
            } else {
                System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
                System.out.println("Take one down, pass it around,");
            }
        }
        System.out.println("No more bottles of beer on the wall.");
    }
}
