import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BottlesTest
{
    @Test
    public void testSong()
    {
        final ByteArrayOutputStream stream = new ByteArrayOutputStream();
        Bottles.writeLyrics(
                new PrintStream(
                        stream
                )
        );

        final String actual = new String(stream.toByteArray());

        Assert.assertNotNull(actual);

    }
}
