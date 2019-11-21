package design.patterns.structural.proxy;

import java.util.HashMap;

public interface YoutubeVideoApi {
    Video getVideoById(String id);
    HashMap<String, Video> getPopularVideos();
}
