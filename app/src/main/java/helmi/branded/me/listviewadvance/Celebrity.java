package helmi.branded.me.listviewadvance;

/**
 * Created by HelmiHasan on 13/05/2016.
 */
public class Celebrity {
    private String name;
    private String job;
    private int image;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Celebrity(String name, String job, int image) {
        this.name = name;
        this.job = job;
        this.image = image;
    }
}
