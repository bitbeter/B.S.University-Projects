package src;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hasan on 12/7/2016 AD.
 */
public class FileHandler {

    FileHandler(String exampleDirectory){
        openFiles(exampleDirectory);
    }

    private List<File> xFiles ;
    private List<File> errFiles ;

    private void openFiles(String path){
        xFiles = recursiveSearch(new File(path));
        errFiles = recursiveSearch(new File(path));
    }

    public File getNextXFile(){
        if (!xFiles.isEmpty())
            return xFiles.remove(0);
        return null;
    }

    public File getNextErrFile(){
        if (!errFiles.isEmpty())
            return errFiles.remove(0);
        return null;
    }

    public List<File> recursiveSearch(File file) {
        File[] filesList = file.listFiles();
        List<File> rst = new ArrayList<File>();

        for (File f : filesList) {
            if (f.isDirectory() && !f.isHidden()) {
                rst.addAll(recursiveSearch(f));
            }
            if( f.isFile() ){
                rst.add(f);
            }
        }
        return rst;
    }
}
