package zadania;

public class tabeleczka {
    public static void helloUser(String[] users){

        for (String user:users) {
            System.out.println("hello" + user);
        }
    }

    public static void main(String[] args) {
        String[] names = {"Michal", "Sara", "Kamil", "Zaneta", "Lukasz"};
        helloUser(names);
    }


}
