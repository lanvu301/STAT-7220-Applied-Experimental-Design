public abstract class Media {
    protected String fileName;
    protected int id;
    protected static int nextId = 1;

    public Media(String fileName) {
        this.fileName = fileName;
        this.id = nextId;
        nextId++;
    }

    public String getFileName() {
        return fileName;
    }

    public int getId() {
        return id;
    }
}

