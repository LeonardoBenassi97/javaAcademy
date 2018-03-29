import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BottlesTest
{
    @Test
    public void testSong()
    {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bottles.writeLyrics(
                new PrintStream(
                        byteArrayOutputStream
                )
        );
    }
}
