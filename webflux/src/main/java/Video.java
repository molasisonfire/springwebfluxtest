public class Video {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    private String name;
    private String description;
    private Integer likes;
    private Integer views;
    public Video(String name, String description, Integer likes, Integer views){
        this.name = name;
        this.description = description;
        this.likes = likes;
        this.views = views;

    }
}
