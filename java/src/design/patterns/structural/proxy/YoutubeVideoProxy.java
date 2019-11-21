package design.patterns.structural.proxy;

import java.util.HashMap;

public class YoutubeVideoProxy implements YoutubeVideoApi {

    private YoutubeVideoApi realService;

    private HashMap<String, Video> allVideosCache = new HashMap<>();
    private HashMap<String, Video> popularVideosCache = new HashMap<>();

    public YoutubeVideoProxy(YoutubeVideoApi realService) {
        this.realService = realService;
    }


    @Override
    public Video getVideoById(String id) {

        Video result = allVideosCache.get(id);

        if(result == null){
            result = realService.getVideoById(id);
            allVideosCache.put(id, result);
        } else {
            System.out.println("Video with id " + id + "loaded from cache");
        }
        return result;
    }

    @Override
    public HashMap<String, Video> getPopularVideos() {

        HashMap<String, Video> result = popularVideosCache;

        if(result.isEmpty()){
            result = realService.getPopularVideos();
            popularVideosCache = result;
        } else {
            System.out.println("Popular videos loaded from cache");
        }
        return result;
    }

    public void clearCache(){
        allVideosCache.clear();
        popularVideosCache.clear();
    }
}
