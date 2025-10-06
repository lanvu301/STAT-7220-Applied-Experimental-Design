public class Video extends Media implements IImageStandard, IAudioStandard {
    private String imageCodec;
    private String audioCodec;

    public Video(String name, String imageCodec, String audioCodec) {
        super(name);
        this.imageCodec = imageCodec;
        this.audioCodec = audioCodec;
    }

    @Override
    public String getImageCodec() {
        return "Image codec: " + imageCodec;
    }

    @Override
    public String getAudioCodec() {
        return "Audio codec: " + audioCodec;
    }

    @Override
    public String getMediaInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Video ID: ").append(id).append("\n");
        sb.append("Video name: ").append(fileName).append("\n");
        sb.append("Image Codec: ").append(imageCodec).append("\n");
        sb.append("Audio Codec: ").append(audioCodec);
        return sb.toString();
    }
}