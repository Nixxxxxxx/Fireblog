package fireblog.yllun.zero.fireblog;

/**
 * Created by zero on 31.01.17.
 */

public class Blog {
    // Should match firebase storage name reference used there
    private  String image, message, title;


    public Blog() {
    }

    public Blog(String title, String message, String image) {
        this.title = title;
        this.message = message;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
