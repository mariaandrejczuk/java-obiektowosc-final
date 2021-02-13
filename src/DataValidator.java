
public final class DataValidator {  //tę klasę robimy final, bo jest to klasa typowo dostarczająca metodę, nie chodzi o to, żeby ktoś ją dziedziczył, rozszerzał, metoda jest jedna, statyczne,

    public static boolean birthDate(String pesel, int birthYear) {

        int year = Integer.parseInt(pesel.substring(0, 2));
        birthYear = Integer.parseInt(String.valueOf(birthYear).substring(2));
        return year == birthYear;


        //String year = pesel.substring(0,2);
        //Integer.parseInt(year);
        // int year = Integer.parseInt(pesel.substring(0,2));-krótsza wersja ww. dwóch linijek kodu
    }
}
