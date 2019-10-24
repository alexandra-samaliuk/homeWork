package HomeTask3;

public class HomeTask3_3 {
    public static void main(String[] args) {
        String version1 = "1.8.5";
        String version2 = "2.2.5";
        int compare = version1.compareTo(version2);
        if(compare>0){
            System.out.println("The second version is old");
        }else if(compare<0) {
            System.out.println("The first version is old");
        }
        else{
            System.out.println("Versions are the same");
        }

    }
}
