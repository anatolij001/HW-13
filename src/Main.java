public class Main {
    public static void main(String[] args) {
        Author stephenKing = new Author("Stephen", "King");
        Author markTwain = new Author("Mark", "Twain");
        Book it = new Book("It", stephenKing, 1986);
        Book tomSawyerAbroad = new Book("Tom Sawyer Abroad", markTwain, 1894);

        //---    Книга 1   ---
        System.out.println(it);
//        System.out.println("Книга 1 - " + it.getBookName());
//        System.out.println("Автор 1 - " + it.getAuthor().getAuthorFirstName() + " " + it.getAuthor().getAuthorLastName());
//        System.out.println("Год издания книги 1 - " + it.getBookYear() + "\n");

        //---    Книга 2   ---
        System.out.println(tomSawyerAbroad);
//        System.out.println("Книга 2 - " + tomSawyerAbroad.getBookName());
//        System.out.println("Автор 2 - " + tomSawyerAbroad.getAuthor().getAuthorFirstName() + " " + tomSawyerAbroad.getAuthor().getAuthorLastName());
//        System.out.println("Год издания книги 2 - " + tomSawyerAbroad.getBookYear() + "\n");

        //---   Изменение года издания второй книги
        tomSawyerAbroad.setBookYear(2025);
        System.out.println("Измененный год издания книги 2 - " + tomSawyerAbroad.getBookYear() + "\n");
    }
}