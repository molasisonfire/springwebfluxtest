import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.List;

public class YoutubeSubscription implements Subscription {

    private Subscriber<? super String> subscriber;
    private List<String> videos;
    public YoutubeSubscription(Subscriber<? super String> subscriber, List<String> videos) {
        this.subscriber = subscriber;
        this.videos = videos;
    }

    @Override
    public void request(long size) {
        System.out.println("request(unbounded)");
        long requestNumberItems = getRequestNumbers(size);
        for(int i = 0; i < requestNumberItems ; i++){
            subscriber.onNext(videos.get(i));
        }
        subscriber.onComplete();
    }

    private long getRequestNumbers(long size) {
        if( size <= videos.size())  return size;
        return videos.size();
    }

    @Override
    public void cancel() {

    }
}
