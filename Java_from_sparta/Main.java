// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // LG TV ����ü�� ����
        MultiRemoteController mrc = new LgTv("LG");
        mrc.turnOnOff();
        mrc.volumeUp();
        mrc.channelDown();
        mrc.channelUp();
        mrc.turnOnOff();
        // ���� ����� Samsung TV�� ��ü
        System.out.println("\n<Samsung TV�� ��ü>");
        mrc = new SamsungTv("Samsung");
        mrc.turnOnOff();
        mrc.channelUp();
        mrc.volumeDown();
        mrc.volumeUp();
        mrc.turnOnOff();

        System.out.println("\n<�Ű�����, ��ȯŸ�� ������ üũ>");
        MultiRemoteController samsung = mrc.getTV(new SamsungTv("Samsung"));
        samsung.turnOnOff();
        SamsungTv samsungTv = (SamsungTv) samsung;
        samsungTv.turnOnOff();
        System.out.println();
        MultiRemoteController lg = mrc.getTV(new LgTv("LG"));
        lg.turnOnOff();
        LgTv lgTv = (LgTv) lg;
        lgTv.turnOnOff();

    }
}