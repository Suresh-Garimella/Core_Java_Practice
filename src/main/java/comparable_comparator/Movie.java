
package comparable_comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

class CustomComparator<T> implements Comparator<T> {
    String getter;

    CustomComparator(String getter) {
        this.getter = getter;
    }

    @Override
    public int compare(T o1, T o2) {
        Class<?>[] parameters = new Class[0];
        Object[] o = new Object[0];
        try {
            Object a1 = o1.getClass().getMethod("get" + getter.substring(0, 1).toUpperCase()
                    + getter.substring(1), parameters)
                    .invoke(o1, o);
            Object a2 = o2.getClass().getMethod("get" + getter.substring(0, 1).toUpperCase()
                    + getter.substring(1), parameters)
                    .invoke(o2, o);

            if (a1 instanceof Integer)
                return Integer.compare((Integer) a1, (Integer) a2);
            else if (a1 instanceof Float)
                return Float.compare((Float) a1, (Float) a2);
            else if (a1 instanceof Double)
                return Double.compare((Double) a1, (Double) a2);
            else
                return 0;
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
            return 0;
        }
    }
}

public class Movie {
    int yearReleased;
    float rating;
    double budget;
    double collectionAmount;
    double profit;
    public String name;

    Movie(int yearReleased,
            float rating,
            double budget,
            double collectionAmount,
            String name) {
        this.rating = rating;
        this.collectionAmount = collectionAmount;
        this.budget = budget;
        this.yearReleased = yearReleased;
        this.profit = this.collectionAmount - this.budget;
        this.name = name;
    }

    public int getYearReleased() {
        return this.yearReleased;
    }

    public float getRating() {
        return this.rating;
    }

    public double getCollectionAmount() {
        return this.collectionAmount;
    }

    public double getBudget() {
        return this.budget;
    }

    public double getProfit() {
        return this.profit;
    }

    static void sortByRatingProfit(ArrayList<Movie> arrayList) {
        Collections.sort(arrayList, new CustomComparator<Movie>("profit"));
        Collections.sort(arrayList, new CustomComparator<Movie>("rating"));
        for (Movie movie : arrayList) {
            System.out.println(movie.name);

        }
    }

    static void sortByYearReleasedRating(ArrayList<Movie> arrayList) {
        Collections.sort(arrayList, new CustomComparator<Movie>("rating"));
        Collections.sort(arrayList, new CustomComparator<Movie>("yearReleased"));
        for (Movie movie : arrayList) {
            System.out.println(movie.name);

        }
    }

    public static void main(String[] args) {
        Movie m1 = new Movie(2000, 9, 2000, 3000, "A");
        Movie m2 = new Movie(2010, 5, 3000, 2000, "B");
        Movie m3 = new Movie(2005, 5, 2000, 3000, "C");
        Movie m4 = new Movie(2000, 8, 4000, 5000, "D");
        Movie m5 = new Movie(2006, 9, 2000, 2000, "E");
        ArrayList<Movie> arrayList = new ArrayList<>(Arrays.asList(m1, m2, m3, m4, m5));
        System.out.println("Sorted Based on Rating & Profit");
        sortByRatingProfit(arrayList);
        System.out.println("----------------------------------------");
        System.out.println("Sorted Based on ReleaseDate & Rating ");
        sortByYearReleasedRating(arrayList);

    }
}
