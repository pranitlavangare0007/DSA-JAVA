package Strings;

public class CompareVersion {
    public static int compareVersion(String version1, String version2) {
        String v1[]=version1.split("\\.");
        String v2[]=version2.split("\\.");

        System.out.println("v1 : "+v1.length +" "+v2.length);

        if(v1.length < v2.length){
            String newV1[]=new String[v2.length];
            for(int start=0 ;start <newV1.length;start++){
                if(start < v1.length){
                    newV1[start]=v1[start];
                }else{
                    newV1[start]="0";
                }
            }
            v1=newV1;
        }
         if(v1.length > v2.length){
            
            String newV2[]=new String[v1.length];
            for(int start=0 ;start <newV2.length;start++){
                if(start < v2.length){
                    newV2[start]=v2[start];
                }else{
                    newV2[start]="0";
                }
            }
            v2=newV2;
        }
       
        int i=0;
        int j=0;

        while (i<v1.length && j<v2.length) {
            if(Integer.valueOf(v1[i]) > Integer.valueOf(v2[j])){
                return 1;
            }else if (Integer.valueOf(v1[i]) < Integer.valueOf(v2[j])) 
            {
                return -1;
            }
            i++;
            j++;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        String version1 = "1.0.1", version2 = "1";
        System.out.println(compareVersion(version1, version2));
    }
}
