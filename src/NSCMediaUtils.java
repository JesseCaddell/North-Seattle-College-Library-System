
public class NSCMediaUtils {
    interface MediaDetailsProvider {
        String getMediaDetails();
    }
    //public interface MediaItem flags classes as media items
    public interface MediaItem extends MediaDetailsProvider {
    }

    public static <T extends MediaItem & MediaDetailsProvider> void printMediaDetails(T media) {
        String details = media.getMediaDetails();
        System.out.println(details);
    }


}
