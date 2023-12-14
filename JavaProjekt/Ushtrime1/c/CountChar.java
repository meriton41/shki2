 import java.io.*;
 package c;
public class CountChar{
    public static void main(String[] args) {
        try {
            String input="ubt.txt";
            FileReader fr=new FileReader(input);
            FileWriter fw=new FileWriter(ubt0.txt);
            int count=0;
             int c;
        while((fr.read())!=-1){
     if(c=='u' || c=='U'){
        c=fr.read();
     }
if(c=='b'  || c=='B'){
    c=fr.read();
}
if(c=='t'||c=='T'){
count++;
         }
        }
    }
 }
if(count==o){
    fw.write("Ne file "+input+" nuk eshte gjetur asnje fjale UBT");
}else{
    fw.write("Ne file "+input+" jane gjetur "+count+" fjale UBT")
}
fr.close();
fw.close();
        } catch (IOException e) {
            e.setStackTrace();
        }
    }

}
}
