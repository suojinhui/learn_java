package MovieDemo;


import java.util.Scanner;

public class MovieOperator {

    public MovieOperator() {}

    public static void printAllMovies(Movice[] movies) {
        for (Movice m : movies) {
            System.out.println(m.getId() + "\t" + m.getName() + "\t" + m.getPrice() + "\t" + m.getActors());
        }
    }


    public static void searchMovieById(Movice[] movies) {
        System.out.println("请输入要查找的电影id: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (Movice m : movies) {
            if (m.getId() == id) {
                System.out.println(m.getId() + "\t" + m.getName() + "\t" + m.getPrice() + "\t" + m.getActors());
                return;
            }
        }
        System.out.println("没有找到该电影");
    }
}

