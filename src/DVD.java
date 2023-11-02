public class DVD implements NSCMediaUtils.MediaItem, NSCMediaUtils.MediaDetailsProvider {

    private String title;
    private int duration;
    private String genre;
    private boolean NSCCollection;

    public DVD(String title, int duration, String genre, boolean NSCCollection) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.NSCCollection = NSCCollection;
    }

    //setting getters
    public String getTitle(){
        return title;
    }
    public int getDuration(){
        return duration;
    }
    public String getGenre(){
        return genre;
    }
    // implementing mediadetailsprovider method

    public String getMediaDetails(){
        return "DVD: " + title +"\nDuration: " + duration +"min \nGenre: " + genre + "\nIn Collection: " + NSCCollection +"\n";
    }

//    @Override
//    public String toString() {
//        return "DVD: " + title +"\nDuration: " + duration +"\nGenre: " + genre + "\n In Collection: " + NSCCollection;
//    }

}
