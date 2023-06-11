public abstract class Tv {
    private String company;
    private int channel =1;
    private int volume =0;
    private boolean power = false;

    public Tv(String company){
        this.company = company; //추상클래스가 부모 클래스의 역할을 하기 위해서 생성자로 먼저
    }
    public void displayPower(String company,boolean power){
        if(power){//애초에 값을 true or false으로 받으니 트루이면 출력
            System.out.println(company + " Tv 전원이 켜졌습니다.");
        }else{//값이 false 이면 전원이 종료가 되었다고 출력한다.
            System.out.println(company + " Tv 전원이 종료되었습니다.");
        }
    }

    public void displayChannel(int channel){
        System.out.println("현재 채널은 " +channel);
    }

    public void displayVolume(int volume){
        System.out.println("현재 볼륨은 " + volume);
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
