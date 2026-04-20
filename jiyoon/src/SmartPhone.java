public class SmartPhone {
    private String company;
    private String os;

    public SmartPhone(String complany,String os){
        this.company = complany;
        this.os = os;
    }
    @Override
    public String toString(){
        return company + "," + os;
    }
}
