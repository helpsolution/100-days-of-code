package design.patterns.structural.proxy;

public class Demo {

    /*
        Proxy is a structural design pattern that lets you provide a substitute or placeholder
        for another object. A proxy controls access to the original object, allowing you to perform
        something either before or after the request gets through to the original object.


         +
         You can control the service object without clients knowing about it.

         You can manage the lifecycle of the service object when clients don’t care about it.

         The proxy works even if the service object isn’t ready or is not available.

         Open/Closed Principle. You can introduce new proxies without changing the service or clients.

         _
         The code may become more complicated since you need to introduce a lot of new classes.

         The response from the service might get delayed.
     */

    public static void main(String[] args) {

        YoutubeVideoService realService = new YoutubeVideoService();
        YoutubeVideoProxy proxy = new YoutubeVideoProxy(realService);


        System.out.println("Loaded Popular videos");
        proxy.getPopularVideos().forEach((s, video) -> {
            System.out.println(String.format("Video -> id: %s, name: %s", s, video.getName()));
        });
        System.out.println();

        System.out.println("Loaded Video by id");
        Video videoById = proxy.getVideoById("1");
        System.out.println(String.format("Video -> id: %s, name: %s", videoById.getId(), videoById.getName()));
        System.out.println();

        System.out.println("Loaded Popular videos from cache");
        proxy.getPopularVideos().forEach((s, video) -> {
            System.out.println(String.format("Video -> id: %s, name: %s", s, video.getName()));
        });
    }

}
