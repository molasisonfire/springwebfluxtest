public class SubscriberAux {
    public static void main(String[] args) {
        YoutubeChannel publisher = new YoutubeChannel();

        publisher.addVideo(new Video("Sucess", "Reactive programming with Java",200,10000));
        publisher.addVideo(new Video("Sucess", "Java vs Kotlin",50,20000));

        /*User subscriber = new User( "Anselmo");
        publisher.getAllVideos().subscribeWith(subscriber);*/

        publisher.getAllVideos().log().subscribe();
    }
}
