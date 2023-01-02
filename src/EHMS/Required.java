package EHMS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Required extends Variables{
    public int AutoId(String fname) throws IOException {
        if(check(fname)){
            filer = new BufferedReader(new FileReader(fname));
            filer.readLine();
            while ((line = filer.readLine()) != null) {
                data = line.split(",");
                autoId = Integer.parseInt(data[0]);
            }
            filer.close();
            return autoId + 1;
        }
        else {
            return 1;
        }
    }
    public boolean dcheck(String fname, int id)throws IOException {
        filer = new BufferedReader(new FileReader(fname));
        filer.readLine();
        while ((line=filer.readLine())!=null){
            data=line.split(",");
            if(Integer.parseInt(data[4])==id && Integer.parseInt(data[8])==0){
                count++;
            }
        }
        filer.close();
        return count > 0;
    }
    public boolean pcheck(String fname, int id)throws IOException {
        filer = new BufferedReader(new FileReader(fname));
        filer.readLine();
        while ((line=filer.readLine())!=null){
            data=line.split(",");
            if(Integer.parseInt(data[1])==id){
                count++;
            }
        }
        filer.close();
        return count > 0;
    }
    public boolean check(String fname)throws IOException{
        filer = new BufferedReader(new FileReader(fname));
        filer.readLine();
        while ((line=filer.readLine())!=null){
            count++;
        }
        filer.close();
        return count > 0;
    }
}
