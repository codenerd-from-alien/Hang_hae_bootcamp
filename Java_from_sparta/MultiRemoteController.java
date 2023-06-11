public interface MultiRemoteController {

    void turnOnOff();
    void channelUp();
    void channelDown();
    void volumeUp();
    void volumeDown();

    default MultiRemoteController getTV(Tv tv){
        if(tv instanceof SamsungTv){
            return (SamsungTv) tv;
        } else if(tv instanceof  LgTv){
            return (LgTv) tv;
        }else{
            throw new NullPointerException("일치하는 Tv 없음");
        }
    }

}
