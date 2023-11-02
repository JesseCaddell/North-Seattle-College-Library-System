public class Main {
    public static void main(String[] args) {
        NSCLibraryMediaContainer<NSCMediaUtils.MediaItem> mediaContainer = new NSCLibraryMediaContainer<>();

       Book book = new Book("Hello world", "Jimmy Day", "123774", true);
       DVD dvd = new DVD("Another movie", 60, "Horror", true);
       Magazine mag1 = new Magazine("PC Gamer", 12, "April", true);


       mediaContainer.add(book);
       mediaContainer.add(dvd);
       mediaContainer.add(mag1);
       mediaContainer.display();


    }
}