class Bank{
    float getRateOfInterest(){
        return 3.8f;
    }
}
class HDFC extends Bank{
    float getRateOfInterest() {
        return 4.0f;
    }
}

class SBI extends Bank{
    float getRateOfInterest(){
        return 4.5f;
    }
}
class PNB extends Bank{
    float getRateofInterest(){
        return 5.0f;
    }
}

public class practical12{
    public static void main(String []args){
        Bank b;
        b=new HDFC();
        System.out.println("Rate of Interest in HDFC is :"+b.getRateOfInterest());
        b=new SBI();
        System.out.println("Rate of Interest in SBI is  :"+b.getRateOfInterest());
        b=new PNB();
        System.out.println("Rate of Interest in PNB is  :"+b.getRateOfInterest());

    }
}
