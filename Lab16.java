import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Lab16 {
    public static void main(String[] args) {

        MovieUtility reader = new MovieUtility();
        ArrayList<Movie> allMovies = reader.getMovies();

        // for(int i=0;i<allMovies.size();i++){
        //     System.out.println(allMovies.get(i).getCountryName());
        // }

    }
}

class MovieUtility {
    ArrayList<Movie> getMovies() {
        ArrayList<Movie> list = new ArrayList<>();
        try {
            File file = new File("movies.tsv");
            Scanner scr = new Scanner(file);
            while (scr.hasNext()) {
                String line = scr.nextLine();
                String arr[] = line.split("\\t");
                Movie m = new Movie();

                m.setId(Integer.parseInt(arr[0]));
                
                arr[1] = arr[1].replace("\"", "");
                m.setMovieName(arr[1]);
                m.setYear(Integer.parseInt(arr[2]));
                arr[3]  = arr[3].replace("\"", "");
                m.setCountryName(arr[3]);
                m.setGener(Arrays.copyOfRange(arr, 4, arr.length));

                list.add(m);
            } // while
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}

// movie -> read -> object -> list add
class Movie {
    private int id;
    private String movieName;
    private int year;
    private String gener[];
    private String countryName;

    public int getId() {
        return id;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getYear() {
        return year;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String[] getGener() {
        return gener;
    }

    public void setGener(String[] gener) {
        this.gener = gener;
    }

}
