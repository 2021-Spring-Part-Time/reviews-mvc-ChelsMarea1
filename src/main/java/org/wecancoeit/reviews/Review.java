package org.wecancoeit.reviews;

public class Review {

    private Long id;
    private String title;
    private String artist;
    private String image;
    private String category;
    private String content;

    public Long getId() {
        return id;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getCategory() {
        return category;
    }

    public String getContent() {
        return content;
    }

    public Review(long id, String title, String artist, String image, String category, String content) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.image = image;
        this.category = category;
        this.content = content;
    }
}
