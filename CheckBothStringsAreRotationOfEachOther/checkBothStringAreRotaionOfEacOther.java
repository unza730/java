package CheckBothStringsAreRotationOfEachOther;

public class checkBothStringAreRotaionOfEacOther {
    public static void main(String[] args){
     System.out.println("abcd  bcda  are rotated"+isRotatedVersion("abcd", "bcda"));
    }
    public static boolean isRotatedVersion(String str, String rotatedString){
        boolean isRotated = false;
        if(str==null || rotatedString==null){
            return false;
        }else if(str.length()!=rotatedString.length()){
            return false;
        }else{
            String concatenated = str + str;
            return concatenated.contains(rotatedString);
        }
    }
}
