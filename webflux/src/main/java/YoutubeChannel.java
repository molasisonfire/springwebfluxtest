import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {
    private List<Video> videos =new ArrayList<>();
    public void addVideo(String title){
        this.videos = videos;
    }


    public void addVideo(Video video){
        videos.add(video);
    }

    public Flux<Video> getAllVideos(){
        return Flux.fromIterable(videos);
    }

}
