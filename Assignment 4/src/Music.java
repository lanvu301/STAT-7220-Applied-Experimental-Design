public class Music extends Media implements IAudioStandard{
    String audioCodec;
    Music(String s1, String s2){
        super(s1);
        audioCodec=s2;
    }
    @Override
    public String getAudioCodec(){
        return "Audio codec: " + audioCodec;
    }

    @Override
    public String getMediaInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Music ID: ").append(id).append("\n");
        sb.append("Music name: ").append(fileName).append("\n");
        sb.append("Audio Codec: ").append(audioCodec);
        return sb.toString();
    }
}
