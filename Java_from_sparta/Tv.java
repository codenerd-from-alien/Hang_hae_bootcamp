public abstract class Tv {
    private String company;
    private int channel =1;
    private int volume =0;
    private boolean power = false;

    public Tv(String company){
        this.company = company; //�߻�Ŭ������ �θ� Ŭ������ ������ �ϱ� ���ؼ� �����ڷ� ����
    }
    public void displayPower(String company,boolean power){
        if(power){//���ʿ� ���� true or false���� ������ Ʈ���̸� ���
            System.out.println(company + " Tv ������ �������ϴ�.");
        }else{//���� false �̸� ������ ���ᰡ �Ǿ��ٰ� ����Ѵ�.
            System.out.println(company + " Tv ������ ����Ǿ����ϴ�.");
        }
    }

    public void displayChannel(int channel){
        System.out.println("���� ä���� " +channel);
    }

    public void displayVolume(int volume){
        System.out.println("���� ������ " + volume);
    }

    public String getCompany(){
        return company;
    }

    public int getChannel(){
        return channel;
    }

    public int getVolume(){
        return volume;
    }

    public boolean isPower(){
        return power;
    }

    public void setChannel(int channel){
        this.channel = Math.max(channel,0);
    }

    public void setVolume(int volume){
        this.volume = Math.max(volume,0);
    }

    public void setPower(boolean power){
        this.power = power;
    }
}
