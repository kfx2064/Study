package lec05.generics.fifth;

public class Main {

    public static void main(String[] args) {

        ChildWildCard<WildCard<String>> childWildCard = new ChildWildCard<>();
        ChildWildCard<WildCard<Integer>> childWildCardInt = new ChildWildCard<>();

    }

}
