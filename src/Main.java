import com.limagiran.holyrics.model.Music;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("sample.mufl");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Music> musicList  = (ArrayList<Music>)ois.readObject();
        Music music = musicList.get(0);
        System.out.println(music.title);
    }
}