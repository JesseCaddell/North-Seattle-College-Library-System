public class Book implements NSCMediaUtils.MediaItem, NSCMediaUtils.MediaDetailsProvider {

    private String title;
    private String author;
    private String ISBN;
    private boolean NSCCollection;

    public Book (String title, String author, String ISBN, boolean NSCCollection) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.NSCCollection = NSCCollection;
    }

    //setting getters
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getISBN() {
        return ISBN;
    }

    // implementing mediadetailsprovider method

    public String getMediaDetails() {
        return "Book: " + title +"\nAuthor: " + author +"\nISBN: " + ISBN + "\nIn Collection: " + NSCCollection +"\n";
    }

//    @Override
//    public String toString() {
//        return "Book: " + title +"\nAuthor: " + author +"\nISBN: " + ISBN + "\n In Collection: " + NSCCollection;
//    }


}
