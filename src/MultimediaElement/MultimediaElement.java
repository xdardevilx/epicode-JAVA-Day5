public abstract class MultimediaElement {
    
    String name;


    public MultimediaElement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void show(){};
    public void play(){};
}
