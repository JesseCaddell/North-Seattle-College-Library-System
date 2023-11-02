import java.util.ArrayList;

public class NSCLibraryMediaContainer<T extends NSCMediaUtils.MediaItem & NSCMediaUtils.MediaDetailsProvider> {
    private ArrayList<T> mediaContainer = new ArrayList<>();

    public void add(T item) {
        mediaContainer.add(item);
    }
    public void remove(T item) {
        mediaContainer.remove(item);
    }
    public void display() {
        for (T item : mediaContainer) {
            System.out.println(item.getMediaDetails());
        }
    }

}
