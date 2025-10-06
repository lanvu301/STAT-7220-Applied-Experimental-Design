public class Image extends Media implements IImageStandard{
    String imageCodec;
    public Image(String s1, String s2){
        super(s1);
        imageCodec=s2;
    }
    @Override
    public String getImageCodec(){
        return "Image codec: "+imageCodec;
    }

    @Override
    public String getMediaInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("Image ID: ").append(id).append("\n");
        sb.append("Image name: ").append(fileName).append("\n");
        sb.append("Image codec: ").append(imageCodec);
        return sb.toString();
    }
}
