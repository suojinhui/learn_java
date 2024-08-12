package MovieDemo;

public class Test {
    public static void main(String[] args) {
        Movice [] movies = new Movice[6];

        movies[0] = new Movice(1,"唐人街探案", 20.0,"张小泉");
        movies[1] = new Movice(2,"速度与激情", 25.0,"瑞秋.费尔南多");
        movies[2] = new Movice(3,"夏洛特烦恼", 30.0,"沈腾");
        movies[3] = new Movice(4,"战狼2", 35.0,"吴京");
        movies[4] = new Movice(5,"让子弹飞", 40.0,"姜文");
        movies[5] = new Movice(6,"暗战", 45.0,"王大陆");


        MovieOperator.printAllMovies(movies);
        MovieOperator.searchMovieById(movies);



    }
}
