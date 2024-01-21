public class Leap {
    /*
     * static boolean isLeapYear(int year) {
     * if ( year == 100 * (year/100) & year == 400 * (year/400) || year % 4 == 0 ) {
     * return true;
     * }
     * return false;
     * }
     */

    static boolean isLeapYear(int year) {
        // Verifica se o ano é divisível por 4
        // e ao mesmo tempo não é divisível por 100, exceto se for divisível por 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true; // O ano é bissexto
        } else {
            return false; // O ano não é bissexto
        }
    }
}
