package design.patterns.structural.proxy;

import java.util.HashMap;
import java.util.Random;

public class YoutubeVideoService implements YoutubeVideoApi {
    @Override
    public Video getVideoById(String id) {
        connectToServer("http://www.youtube.com/"+id);
        return getVideo(id);
    }

    @Override
    public HashMap<String, Video> getPopularVideos() {
        connectToServer("http://www.youtube.com");
        return getVideos();
    }

    private void connectToServer(String address){
        System.out.println("Connecting to " + address + "...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Connected.");
    }

    private Video getVideo(String id){
        return new Video(id, "Some video");
    }

    private HashMap getVideos(){

        HashMap<String,Video> hashMap = new HashMap<>();

        hashMap.put("1", new Video("1", "Spring"));
        hashMap.put("2", new Video("2", "Nioo"));
        hashMap.put("3", new Video("3", "Summer"));

        return hashMap;
    }
}
