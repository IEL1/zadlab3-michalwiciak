/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner;

/**
 *
 * @author Asia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static double potegaRek(int x, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 != 0) {
            return x * Math.pow(potegaRek(x, (n - 1) / 2), 2);
        } else {
            return Math.pow(potegaRek(x, n / 2), 2);
        }
    }

    public static double potegaIter(int x, int n) {
        int w = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                w *= x;
            }
            x *= x;
            n /= 2;
        }
        return w;
    }

    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4

        Scanner zad = new Scanner(System.in);
        System.out.println("Podaj numer zadania: ");
        int zadanie = zad.nextInt();
        System.out.println();
        System.out.println("Wybrales zadanie numer " + zadanie);
        switch (zadanie) {

            case 1:
                System.out.println("Ktory podpunkt? ");
                int podpunkt = zad.nextInt();
                switch (podpunkt) {
                    case 4:
                        System.out.println("Wybrales podpunkt numer " + podpunkt + ". Oto jego rozwiazanie: ");
                        int a = 13,
                         b = 3,
                         c = -19,
                         wynik1,
                         wynik2,
                         wynik3,
                         wynik4;
                        wynik1 = a << b; // operator lewego przesunięcia ze znakiem, 13 << 3 = 13 * 2^3 = 13 * 8 = 104, przesuniecie 3 bitow w 11 z uwzglednieniem bitu znaku
                        System.out.println(wynik1);
                        wynik2 = a >> b; // operator prawego przesunięcia ze znakiem, 13 >> 3 = 13 / 2^3 = 13 / 8 = 1,
                        System.out.println(wynik2);
                        wynik3 = a >>> b; // operator prawego przesunięcia bez znaku, przy liczbie po lewej dodatniej wynik jest identyczny jak dzialania a>>b
                        System.out.println(wynik3);
                        wynik4 = c >>> b; // przy liczbie po lewej ujemnej wynik to (c >> b) + (2 << ~b)
                        System.out.println(wynik4);
                        break;
                    case 7:
                        System.out.println("Wybrales podpunkt numer " + podpunkt + ". Oto jego rozwiazanie: ");
                        boolean tak = true;
                        int d = 2,
                         f = -2,
                         wynik5 = d ^ d,
                         wynik6 = f ^ f,
                         g = 5,
                         h = 6,
                         wynik7 = g ^ h;
                        System.out.println("tak = " + tak);
                        System.out.println("!tak = " + !tak + "\n"); //wynikiem bedzie negacja true, czyli false
                        System.out.println("2 ^ 2 = " + wynik5); // uzycie do liczby n operatora ^, aby wyswietlic wynik n^n da wynik 0, jeśli oba bity są jednocześnie 0 lub 1 wynik jest rowny 0
                        System.out.println("-2 ^ -2 = " + wynik6);
                        System.out.println("5 ^ 6 = " + wynik7); // liczba 5 w postaci binarnej to 101, 6 to 110, 5^6 -> 101 xor 110 -> 011, pierwszy bit jest taki sam, wiec w wyniku ten bit wynosi 0, pozostale bity sa rozne, wiec w wuniku jest to 1, 101 w postaci dziesietnej to 3
                        break;
                    default:
                        System.out.println("Nie ma zadania numer " + zadanie + "z podpunktem numer " + podpunkt);
                        break;
                }
                break;

            case 2:
                System.out.println("Zadanie 2.2.");
                System.out.println("Ktory podpunkt? ");
                System.out.println("1-char[] toCharArray(), 2-byte[] getBytes(), 3-boolean equals(String str), 4-boolean equalsIgnoreCase(String str), \n"
                        + "5-int campareTo(String str), 6-int campareToIgnoreCase(String str), 7-int indexOf(int i), 8-String substring(int startString)\n"
                        + "9-String replace(char orginal, char zamiennik), 10-String trim(), 11-String toLowerCase(), 12-String toUpperCase(), 13-String[] split(String regex, int limit)");
                podpunkt = zad.nextInt();
                switch (podpunkt) {
                    case 1:
                        System.out.println();
                        String Str = new String("dzien dobry");
                        System.out.print("good morning :");
                        System.out.println(Str.toCharArray()); //zamienia Stringa na tablicę char
                        break;
                    case 2:
                        System.out.println();
                        String s1 = "ABCDEF";
                        byte[] b = s1.getBytes();
                        for (int i = 0; i < b.length; i++) {
                            System.out.println(b[i]);  //metoda zwraca tablice bajtow ze Stringa
                        }
                        break;
                    case 3:
                        System.out.println();
                        boolean b1,
                         b2;
                        String str1 = "To jest jakis tekst";
                        String str2 = str1;
                        String str3 = "nckdncskcmlsd mkdslc";
                        boolean wartosc = str1.equals(str2);
                        System.out.println("Zwrocony wynik(porownanie str1 do str2) = " + wartosc);
                        wartosc = str1.equals(str3);
                        System.out.println("Zwrocony wynik(str1 do str3) = " + wartosc); //zwraca wartosc true, jesli Stringi sa takie same i false, jesli sie roznia
                        break;
                    case 4:
                        System.out.println();
                        str1 = new String("Blablabla bla");
                        str2 = str1;
                        String Str3 = new String("Blablabla bla");
                        String str4 = new String("BlablaBLA BLA");
                        wartosc = str1.equals(str2);
                        System.out.println("str1 = " + str1);
                        System.out.println("str2 = " + str2);
                        System.out.println("Str3 = " + Str3);
                        System.out.println("str4 = " + str4);
                        System.out.println("Zwrocony wynik1(str1 do str2) = " + wartosc);
                        wartosc = str1.equals(Str3);
                        System.out.println("Zwrocony wynik2(str1 do Str3) = " + wartosc);
                        wartosc = str1.equalsIgnoreCase(str4);
                        System.out.println("Zwrocony wynik3(str1 do str4) = " + wartosc); //zwraca true, jesli argument nie jest pusty i Stringi sa takie same(pomijajac wielkosc liter), w przeciwnym wypadku zwraca false
                        break;
                    case 5:
                        System.out.println();
                        String str5 = "zyrafa",
                         str6 = "tygrys";
                        System.out.println("str5 = " + str5);
                        System.out.println("str6 = " + str6);
                        int wynik = str5.compareTo(str6);
                        if (wynik < 0) {
                            System.out.println("str5 jest leksykograficznie wiekszy od str6");
                        } else if (wynik == 0) {
                            System.out.println("str5 jest taki sam jak str6");
                        } else {
                            System.out.println("str5 jest leksykograficznie mniejszy od str6");
                        }
                        // porownuje kolejno litera po literze na ktorej pozycji sa wieksze leksykograficznie litery - tzn. gdzie sa pozniejsze w slowniku litery
                        break;
                    case 6:
                        System.out.println();
                        String str7 = "Stringi sa takie same";
                        String str8 = "Stringi sa takie same";
                        String str9 = "Liczby nie sa takie same";
                        System.out.println("str7 = " + str7);
                        System.out.println("str8 = " + str8);
                        System.out.println("str9 = " + str9);
                        wynik = str7.compareToIgnoreCase(str8);
                        System.out.println("wynik(porownanie str7 do str8) = " + wynik);

                        wynik = str8.compareToIgnoreCase(str9);
                        System.out.println("wynik(porownanie str8 do str9) = " + wynik);

                        wynik = str9.compareToIgnoreCase(str7);
                        System.out.println("wynik(porownanie str9 do str7) = " + wynik);
                        // zwraca ujemna liczbe calkowita, zero lub dodatnia liczbe calkowita, gdy dany string jest kolejno wiekszy, rowny lub mniejszy niz drugi string, ignoruje wielkosc liter
                        break;
                    case 7:
                        System.out.println();
                        String str10 = new String("Netbeans");
                        System.out.println(str10);
                        System.out.print("Znaleziony indeks(literki 'n') :");
                        System.out.println(str10.indexOf('n')); //zwraca indeks podanego znaku w stringu, jesli nie wystepuje zwraca -1
                        break;
                    case 8:
                        System.out.println();
                        String str11 = new String("Hello world!");
                        System.out.println(str11);
                        System.out.print("Zwrocona wartosc :");
                        System.out.println(str11.substring(6)); //zwraca nowego stringa, ktory zaczyna sie od znaku o okreslonym indeksie w tym stringu i rozciaga sie do jego konca
                        break;
                    case 9:
                        System.out.println();
                        String str12 = new String("Hello world!");
                        System.out.println(str12);
                        System.out.print("Zamiana liter 'l' na 'H' :");
                        System.out.println(str12.replace('l', 'H'));

                        System.out.print("Zamiana liter 'o' na 'a':");
                        System.out.println(str12.replace('o', 'a')); //podmienia znaki na inne znaki w stringu
                        break;
                    case 10:
                        String str13 = new String("   Hello world!   ");
                        System.out.println(str13);
                        System.out.print("Zwrocona wartosc :");
                        System.out.println(str13.trim()); //zwraca kopie stringa bez poczatkowych i koncowych spacji lub po prostu tego stringa jesli takowych nie ma
                        break;
                    case 11:
                        String str14 = new String("HELLO WORLD!");
                        System.out.println(str14);
                        String str14lower = str14.toLowerCase();
                        System.out.println("Wynik = " + str14lower); //zwraca stringa w malych literach  
                        break;
                    case 12:
                        String str15 = new String("hello world!");
                        System.out.println(str15);
                        String str15upper = str15.toUpperCase();
                        System.out.println("Wynik = " + str15upper); //zwraca stringa w duzych literach
                        break;
                    case 13:
                        String str16 = new String("Welcome-to-str16");
                        System.out.println("str16 = " + str16);
                        System.out.println("Zwrocona wartosc :");

                        for (String retval : str16.split("-", 2)) {
                            System.out.println(retval);
                        }
                        System.out.println("");
                        System.out.println("Zwrocona wartosc :");

                        for (String retval : str16.split("-", 3)) {
                            System.out.println(retval);
                        }
                        System.out.println("");
                        System.out.println("Zwrocona wartosc :");

                        for (String retval : str16.split("-", 0)) {
                            System.out.println(retval);
                        }
                        System.out.println(""); // zwraca tablice stringow przekalkulowana poprzez podzielenie tego ciagu wokol dopasowan danego wyrazenia regularnego   
                        break;
                    default:
                        System.out.println("Nie ma takiego zadania");
                        break;
                }
                break;

            case 3:
                System.out.println("Ktory podpunkt? ");
                podpunkt = zad.nextInt();
                switch (podpunkt) {
                    case 3:
                        System.out.println();
                        System.out.println("Wybrales podpunkt numer " + podpunkt + ". Oto jego rozwiazanie: ");
                        System.out.println("Podaj sposob wykonania algorytmu szybkiego potegowania: 1-rekurencyjnie, 2-iteracyjnie");
                        int sposob = zad.nextInt();
                        switch (sposob) {
                            case 1:
                                System.out.println("Podaj liczbe ktora chcesz spotegowac: ");
                                int liczba1 = zad.nextInt();
                                System.out.println("Podaj wykladnik potegi: ");
                                int liczba2 = zad.nextInt();
                                double wynik8 = potegaRek(liczba1, liczba2);
                                System.out.println("wynik = " + wynik8);
                                break;
                            case 2:
                                System.out.println("Podaj liczbe ktora chcesz spotegowac: ");
                                int liczba3 = zad.nextInt();
                                System.out.println("Podaj wykladnik potegi: ");
                                int liczba4 = zad.nextInt();
                                System.out.println();
                                System.out.println(liczba3 + " do potegi " + liczba4 + " wynosi " + potegaIter(liczba3, liczba4));
                                break;
                            default:
                                System.out.println("Podano niewlasciwy numer");
                                break;

                        }
                        break;
                    case 4:
                        System.out.println();
                        System.out.println("Wybrales podpunkt numer " + podpunkt + ". Oto jego rozwiazanie: ");
                        System.out.println("Podaj, ktory wyraz ciagu Fibonacciego obliczyc: ");
                        int n = zad.nextInt();
                        System.out.println(n + "-ty wyraz ciagu Fibonacciego wynosi: " + fib(n));
                        break;
                    default:
                        System.out.println("Nie ma zadania numer " + zadanie + "z podpunktem numer " + podpunkt);
                        break;
                }
                break;

        }

    }

}
