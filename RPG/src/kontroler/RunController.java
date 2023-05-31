package kontroler;

import interfaces.Bohater;
import interfaces.Zloczynica;
import models.Bohatermodel;
import models.Zloczynicamodel;

import java.util.Arrays;
import java.util.Scanner;

public class RunController{

    public void run() {
        System.out.println("Witaj czas zrobić twoją klase postaci w RPG");
        System.out.println("Stwórz idalną postać którą będziesz mógł pokonywać różne przeszkody");
        System.out.println("Czas zdobyć sławe lub nie sławy zalerzy od puktu widzenia :)");
        System.out.println("Masz do wyboru dwie ścieżki Bohatera lub Złoczynicy");
        System.out.println("Wybór zależy tylko od ciebie");
        System.out.println("wybiesz ścieszke");

        Scanner scanner = new Scanner(System.in);
        String decision = scanner.nextLine();

        switch (decision) {
            case "Bohater" -> {
                Bohatermodel bohatermodel = new Bohatermodel();
                Bohater.welcome(decision);
                Bohatermodel.breakLinie();
                System.out.println("Podaj imię Bohatera");
                bohatermodel.setimie(scanner.nextLine());
                System.out.println("podaj wiek Bohatera i młodszy tym więcej zdrowia a stzrszy tym więcej many na start (20-100)");
                int age = Integer.parseInt(scanner.nextLine());
                if (age < 20 || age > 100) {
                    System.out.println("zły wiek. Prosze od nowa zrobić klase postać");
                    return;
                }
                Bohatermodel.setklasa(scanner.nextLine());
                System.out.println("Wybiesz klasa Bohatera (rycerz, mag, baladyn)");
                String klasa = scanner.nextLine();
                if (!isValidklasa(klasa)) {
                    System.out.println("zła klasa Bohatera. Prosze od nowa zrobić klase postać");
                    return;
                }
                String broni = null;
                Bohatermodel.setBroni(broni);
                System.out.println("Wybiesz swają broni(miecz,laska,łuk,włucznia,tarcza)");
                String Broni = scanner.nextLine();
                if (!isValidBroni(Broni)) {
                    System.out.println("Nieprawidłowy broni. Tworzenie postaci anulowane.");
                    return;
                }
                String Zbroja = null;
                Bohatermodel.setZbroja(Zbroja);
                System.out.println("wybiesz zbroje (ciężki, średni, lekki)");
                Zbroja = scanner.nextLine();
                if (!isValidZbroja(Zbroja)) {
                    System.out.println("zła zbroja Bohatera. Prosze od nowa zrobić klase postać");
                    return;
                }
                String Charyzma = null;
                Bohatermodel.setCharyzma(Charyzma);
                System.out.println("Wybiesz charyzme dla Bohatera (przywudczy, madry, hojny)");
                String charyzma = scanner.nextLine();
                if (!isValicharyzma(charyzma)) {
                    System.out.println("zła charyzma Bohatera. Prosze od nowa zrobić klase postać");
                    return;
                }
                String przeszlosc = null;
                bohatermodel.setprzeszlosc(przeszlosc);
                System.out.println("Wybiesz przeszłość swojego Bohatera (szkoła, farmer)");
                przeszlosc = scanner.nextLine();
                if (!isValidprzeszlosc(przeszlosc)) {
                    System.out.println("zła zbroja Bohatera. Prosze od nowa zrobić klase postać");
                    return;
                }
                String koniece = "test";
                Bohatermodel.Setkoniec(koniece);
                System.out.println("czy chcesz stworzyć postać (tak / nie)");
                String confirmation = scanner.nextLine();
                if (confirmation.equalsIgnoreCase("tak")) {
                    System.out.println(Arrays.toString(bohatermodel.BohaterData()));

                } else {
                    System.out.println("Tworzenie postaci anulowano");
                }


            }
            case "Złoczynica" -> {
                Zloczynicamodel Zloczynicamodel = new Zloczynicamodel();
                Zloczynicamodel.welcome(decision);
                Zloczynicamodel.breakLine();
                System.out.println("Podaj imię Bohatera");
                Zloczynicamodel.setimie(scanner.nextLine());
                System.out.println("podaj wiek Bohatera i młodszy tym więcej zdrowia a stzrszy tym więcej many na start (20-100)");
                int age = Integer.parseInt(scanner.nextLine());
                if (age < 20 || age > 100) {
                    System.out.println("zły wiek. Prosze od nowa zrobić klase postać");
                    return;
                }
                Zloczynicamodel.setklasa(scanner.nextLine());
                System.out.println("Wybiesz klasa Złoczynicy (Barbazynica, mroczny mag, zlodziej");
                String klasa = scanner.nextLine();
                if (!isValidklasa(klasa)) {
                    System.out.println("zła klasa Złoczynicy. Prosze od nowa zrobić klase postać");
                    return;
                }
                String Broni = null;
                Zloczynicamodel.setBroni(Broni);
                System.out.println("Wybiesz swają broni(miecz,laska,łuk,noz,topor)");
                Broni = scanner.nextLine();
                if (!isValidBroni(Broni)) {
                    System.out.println("Zła broni. tworzenie klasy anulowano.");
                    return;
                }
                String Zbroja = null;
                Zloczynicamodel.setZbroja(Zbroja);
                System.out.println("wybiesz zbroje (ciężki, średni, lekki)");
                Zbroja = scanner.nextLine();
                if (!isValidZbroja(Zbroja)) {
                    System.out.println("zła zbroja Złoczynicy. Prosze od nowa zrobić klase postać");
                    return;
                }
                String Charyzma = null;
                Zloczynicamodel.setcharyzma(Charyzma);
                System.out.println("Wybiesz charyzme dla Zloczynicy (cwaniak, maadry, respekt)");
                String charyzma = scanner.nextLine();
                if (!isValicharyzma(charyzma)) {
                    System.out.println("zła zbroja Złoczynicy. Prosze od nowa zrobić klase postać");
                    return;
                }
                String przeszlosc = null;
                Zloczynicamodel.setprzeszlosc(przeszlosc);
                System.out.println("Wybiesz przeszłość swojego Bohatera (szkoła, farmer)");
                przeszlosc = scanner.nextLine();
                if (!isValidprzeszlosc(przeszlosc)) {
                    System.out.println("zła zbroja Złoczynicy. Prosze od nowa zrobić klase postać");
                    return;
                }
                String koniec = null;
                Zloczynicamodel.setkoniec(koniec);
                System.out.println("czy chcesz stworzyć postać (tak / nie)");
                String confirmation = scanner.nextLine();
                if (confirmation.equalsIgnoreCase("tak")) {
                    System.out.println(Arrays.toString(Zloczynica.ZloczynicaData()));

                } else {
                    System.out.println("Tworzenie postaci anulowano");
                }

            }
            default -> {
                System.out.println("Zły Wybór");
                this.run();
            }
        }
        this.breakLine();
        System.out.println("Zakańczone robienie klasy Powodzenia");
    }

    private boolean isValidklasa(String klasa) {
        String[] validklasa ={"rycerz, mag, baladyn"};
        return Arrays.asList(validklasa).contains(klasa);
    }

    private boolean isValidBroni(String Broni) {
        String[] validBroni = {"miecz,laska,łuk,włucznia,tarcza"};
        return Arrays.asList(validBroni).contains(Broni);
    }

    private boolean isValidZbroja(String Zbroja){
        String[] validZbroja = {"ciężki, średni, lekki"};
        return Arrays.asList(validZbroja).contains(Zbroja);
    }

    private boolean isValicharyzma(String charyzma){
        String[] validcharyzma = {"przywudczy, madry, hojny"};
        return Arrays.asList(validcharyzma).contains(charyzma);
    }

    private boolean isValidprzeszlosc(String przeszlosc){
        String[] validprzeszlosc = {"szkoła, farmer"};
        return Arrays.asList(validprzeszlosc).contains(przeszlosc);
    }

    private boolean isValidkoniec(String koniec){
        return koniec.equalsIgnoreCase("tak") || koniec.equalsIgnoreCase("nie");
    }

    private void breakLine() {System.out.println("-----------------");}

    public static void main(String[] args) {
        RunController controller = new RunController();
        controller.run();
    }

}
