public class Magazine implements NSCMediaUtils.MediaItem, NSCMediaUtils.MediaDetailsProvider {

    private String title;
    private int issueNumber;
    private String month;
    private boolean NSCCollection;

    public Magazine(String title, int issueNumber, String month, boolean NSCCollection) {
        this.title = title;
        this.issueNumber = issueNumber;
        this.month = month;
        this.NSCCollection = NSCCollection;
    }

    //setting getters
    public String getTitle(){
        return title;
    }
    public int getIssueNumber(){
        return issueNumber;
    }
    public String getMonth(){
        return month;
    }

    // implementing mediadetailsprovider method
    public String getMediaDetails(){
        return "Magazine: " + title +"\nIssue #: " + issueNumber +"\nMonth: " + month + "\nIn Collection: " + NSCCollection +"\n";
    }

//    @Override
//    public String toString() {
//        return "Magazine: " + title +"\nIssue #: " + issueNumber +"\nMonth: " + month + "\n In Collection: " + NSCCollection;
//    }
}
