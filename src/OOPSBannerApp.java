public class OOPSBannerApp{
    public static String[] getOPattern(){
        return new String[]{
            "*****",
            "*   *",
            "*   *",
            "*   *",
            "*****"
        };
    }
    public static String[] getPPattern(){
        return new String[]{
            "*****",
            "*   *",
            "*****",
            "*    ",
            "*    "
        };
    }
    public static String[] getSPattern(){
        return new String[]{
            "******",
            "*     ",
            "******",
            "     *",
            "******"
        };
    }
    public static void main(String[] args){
        
        String[] OPattern = getOPattern();
        String[] PPattern = getPPattern();
        String[] SPattern = getSPattern();

        for (int i=0;i<OPattern.length;i++){
            System.out.println(OPattern[i]+" "+OPattern[i]+" "+PPattern[i]+" "+SPattern[i]);
        }
    }

}