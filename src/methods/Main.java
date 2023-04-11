package methods;

public class Main {
    public static void main(String[] args) {


        int salariu1, salariu2, salariu3;

        salariu1 = calculSalariu("Andrei", 3000, 3);
        salariu2 = calculSalariu("Ion", 4500, 4);
        salariu3 = calculSalariu("Vasile", 5000, 5);

        System.out.println("Salariile rezultate : " + salariu1 + " vs " + salariu2 + " vs " + salariu3);

        int rezultatComparator = comparatorSalarii(salariu1, salariu2, salariu3);
        System.out.println("Cel mai mare salariu este : " + rezultatComparator);
    }

    public static int calculSalariu(String numeAngajat, int salariu, int experienta) {
        int nivel = 300 * experienta;
        int bonus = nivel * experienta / 5;
        salariu += bonus;

        System.out.println("Salariul lui " + numeAngajat + " este " + salariu);
        return salariu;
    }

    public static int comparatorSalarii(int salariu1, int salariu2, int salariu3) {
        if (salariu1 > salariu2 && salariu1 > salariu3) {
            return salariu1;
        } else if (salariu2 > salariu1 && salariu2 > salariu3) {
            return salariu2;
        } else if (salariu3 > salariu1 && salariu3 > salariu2) {
            return salariu3;
        }
        return 0;
    }


}







