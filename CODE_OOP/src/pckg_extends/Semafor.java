package pckg_extends;

public class Semafor {

    private String zeleno;
    private String zuto;
    private String crveno;
    private String code;
    private static final String[] CODES = {"100","010","001"};

    public Semafor(){
        this.zeleno = "1";
        this.zuto = "0";
        this.crveno = "0";
        this.code = this.zeleno + this.zuto + this.crveno;
    }

    public Semafor(String zeleno, String zuto, String crveno) {
        this.zeleno = zeleno;
        this.zuto = zuto;
        this.crveno = crveno;
        this.code = this.zeleno + this.zuto + this.crveno;
    }

    private boolean checkCode(){
        for (String inCode : CODES){
            if(code.equals(inCode)){
                return true;
            }
        }
        return false;
    }

    public void giveSemaforStatus(){
        if (checkCode()){
            switch (code){
                case "100":
                    System.out.println("Zeleno je: Prođi -->"); break;
                case "010":
                    System.out.println("Žuto je: Oprez!"); break;
                case "001":
                    System.out.println("Crveno je: Stani!!!"); break;
                default:
                    System.out.println("Greška koje neće biti!");

            }
        } else {
            System.out.println("Pogrešan kod semafora - unesite ispravan kod!");
        }
    }

    public void putSemaforForInWork(){
        int cnt = 0;
        while(cnt<10){
            giveSemaforStatus();
            this.code = CODES[(cnt+1)%3];
            cnt++;
        }
    }

    public String getZeleno() {
        return zeleno;
    }

    public void setZeleno(String zeleno) {
        this.zeleno = zeleno;
        this.code = this.zeleno + this.zuto + this.crveno;
    }

    public String getZuto() {
        return zuto;
    }

    public void setZuto(String zuto) {
        this.zuto = zuto;
        this.code = this.zeleno + this.zuto + this.crveno;
    }

    public String getCrveno() {
        return crveno;
    }

    public void setCrveno(String crveno) {
        this.crveno = crveno;
        this.code = this.zeleno + this.zuto + this.crveno;
    }

    @Override
    public String toString() {
        return "Semafor{" +
                "zeleno='" + zeleno + '\'' +
                ", zuto='" + zuto + '\'' +
                ", crveno='" + crveno + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
