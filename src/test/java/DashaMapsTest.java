import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DashaMapsTest {
    DashaMapOne DMOne = new DashaMapOne();
    DashaMapTwo DMTwo = new DashaMapTwo();
    DashaMapThree DMThree = new DashaMapThree();


    @Before
    private void setupMaps() {
        Class clazz = DashaMapsTest.class;
        InputStream stream = clazz.getResourceAsStream("/word-list.txt");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(stream));
            String line;
            while ((line = br.readLine()) != null) {
                String[] splice = line.split(" ");
                if (splice.length == 2) {
                    DMOne.set(splice[0], splice[1]);
                    DMTwo.set(splice[0], splice[1]);
                    DMThree.set(splice[0], splice[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void DMOneTest(){

    }

}
