import org.junit.jupiter.api.Test;

class NSCLibraryTest {
    //testing media container for books
    NSCLibraryMediaContainer<NSCMediaUtils.MediaItem> testMediaContainerBook = new NSCLibraryMediaContainer<>();

    //testing media container for DVDs
    NSCLibraryMediaContainer<NSCMediaUtils.MediaItem> testMediaContainerDVD = new NSCLibraryMediaContainer<>();

    //Testing media container for Magazines
    NSCLibraryMediaContainer<NSCMediaUtils.MediaItem> testMediaContainerMagazine = new NSCLibraryMediaContainer<>();

    //create books
    Book testBook1 = new Book("JTesting101", "Jimmy", "testISBN", true);
    Book testBook2 = new Book("JTesting102", "James", "TestISBN2", false);

    // create DVDs
    DVD testDVD1 = new DVD("testDVD1", 01, "testgenre1", true);
    DVD testDVD2 = new DVD("testDVD2", 02, "tyestgenre2", false);

    //create Magazines
    Magazine testMag1 = new Magazine("testTitle1", 01, "testMonth1", true);
    Magazine TestMag2 = new Magazine("testTitle2", 02, "testMonth2", false);



    @Test
    public void addBook(Book book) {
        testMediaContainerBook.add(book);
    }
    @Test
    public void removeBook(Book book) {
        testMediaContainerBook.remove(book);
    }

    @Test
    public void addDVD(DVD dvd) {
        testMediaContainerBook.add(dvd);
    }
    @Test
    public void removeDVD(DVD dvd) {
        testMediaContainerBook.remove(dvd);
    }


}